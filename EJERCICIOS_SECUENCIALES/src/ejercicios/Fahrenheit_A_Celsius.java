package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fahrenheit_A_Celsius extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDatos;
	private JLabel lblDatos;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea txtA;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fahrenheit_A_Celsius frame = new Fahrenheit_A_Celsius();
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
	public Fahrenheit_A_Celsius() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDatos = new JLabel("INGRESA LOS DATOS A CONVERTIR:");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDatos.setBounds(10, 11, 235, 54);
		contentPane.add(lblDatos);
		
		txtDatos = new JTextField();
		txtDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDatos.setBounds(10, 72, 214, 35);
		contentPane.add(txtDatos);
		txtDatos.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(304, 35, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(304, 78, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 128, 414, 122);
		contentPane.add(scrollPane);
		
		txtA = new JTextArea();
		scrollPane.setViewportView(txtA);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource()==btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtDatos.setText("");
		txtA.setText("");
		txtDatos.requestFocus();
		
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		double datos,celcius;
		 
		datos=Double.parseDouble(txtDatos.getText());
		
		 celcius = (datos - 32) / 1.8;
		
		 
		 
		 txtA.setText("LOS GRADOS CELCIUS SON: " + decimalFormat(celcius) );
		
	}
	public String decimalFormat(double p) {
		return String.format("%.2f",p);
		
	}
	public void imp (String s) {
		txtA.append(s+"\n");
		
	}
}
