package operadores;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Elevar_potencia extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private JPanel contentPane;
	private JTextField txtBase;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JScrollPane scrollPane;
	private JTextField textExponente;
	private JLabel lblBase;	
	private JLabel lblExponente;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Elevar_potencia frame = new Elevar_potencia();
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
	public Elevar_potencia() {
		setTitle("ELEVAR A LA POTENCIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 414, 155);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(297, 34, 89, 23);
		contentPane.add(btnProcesar);
		
		txtBase = new JTextField();
		txtBase.setBounds(10, 35, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		textExponente = new JTextField();
		textExponente.setColumns(10);
		textExponente.setBounds(111, 35, 86, 20);
		contentPane.add(textExponente);
		
		lblBase = new JLabel("Base");
		lblBase.setBounds(10, 11, 46, 14);
		contentPane.add(lblBase);
		
		lblExponente = new JLabel("Exponente");
		lblExponente.setBounds(109, 11, 104, 14);
		contentPane.add(lblExponente);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource()== btnProcesar ) {
			actionPerformedBtnProcesar(arg0);
		}

		
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
	
		double Base,expo,resultado;
		
		Base=Double.parseDouble(txtBase.getText());
		
		expo=Double.parseDouble(textExponente.getText());
		
		/**
		 * Base es elevada a la potendcia expo
		 */
	
		resultado= Math.pow(Base,expo);
	
		
		
	
		
	
		
		
	
	txtS.setText("la raiz es " + decimalFormat(resultado));	
		
	}
	
	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}
}




