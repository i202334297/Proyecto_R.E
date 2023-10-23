package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EJERCICIO1 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantidad;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JComboBox <String> cboCodigo;
	private JButton btnProcesar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EJERCICIO1 frame = new EJERCICIO1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EJERCICIO1() {
		setTitle("Ejer Yougurt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 92, 414, 158);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(10, 45, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboCodigo = new JComboBox <String>();
		cboCodigo.setModel(new DefaultComboBoxModel <String> (new String[] {"1", "2", "3"}));
		cboCodigo.setBounds(10, 11, 86, 22);
		contentPane.add(cboCodigo);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 24, 89, 23);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	
	String obs;
	int cod,cant;
	double pre,impC,impD,impP;
	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		leerDatos();
		precios();
		importeCompra();
		Descuento();
		importePagar();
		regalo();
		mostrar();
	}
	void leerDatos() {
		cant=Integer.parseInt(txtCantidad.getText());
		cod=cboCodigo.getSelectedIndex();
	}
	void precios() {
		if 		(cod==0) {pre=3.90;}
		else if (cod==1) {pre=3.80;}
		else			 {pre=4.20;}
	}
	void importeCompra() {
		impC=pre*cant;
	}
	void Descuento() {
		if 		(cant>=45) 				{impD=impC* 0.115;}
		else if (cant>=30 && cant < 45) {impD=impC* 0.09;}
		else if (cant>=15 && cant < 30) {impD=impC*0.065;}
		else 							{impD=impC* 0.04;}
	}
	void importePagar() {
		impP=impC-impD;
	}
	void regalo() {
		if (cant>25) {obs="Una novela";}
		else 		 {obs="Una historia";}
	}
	void mostrar() {
		imprimir("Importe Compra    : " + decimalFormat(impC));
		imprimir("Importe Descuento : " + decimalFormat(impD));
		imprimir("Importe Pagar     : " + decimalFormat(impP));
		imprimir("Libro obs         : " + obs);
	}
	
	
	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimir(String s) {
		txtS.append(s + "\n");
	}

}
