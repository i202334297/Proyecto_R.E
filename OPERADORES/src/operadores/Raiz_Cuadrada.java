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


public class Raiz_Cuadrada extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private JPanel contentPane;
	private JTextField txtD;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Raiz_Cuadrada frame = new Raiz_Cuadrada();
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
	public Raiz_Cuadrada() {
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
		
		txtD = new JTextField();
		txtD.setBounds(71, 35, 86, 20);
		contentPane.add(txtD);
		txtD.setColumns(10);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource()== btnProcesar ) {
			actionPerformedBtnProcesar(arg0);
		}

		
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		
		
		double dato,raiz;
		
		dato=Double.parseDouble(txtD.getText());
		
		//saca raiz cuadrada
		
		raiz= Math.sqrt(dato);
		
		
	
		
		
		
		
	
	txtS.setText("la raiz es " + decimalFormat(raiz));	
		
	}
	
	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}
	
	
	
}















