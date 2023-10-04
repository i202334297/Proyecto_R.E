package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Calcula_La_Media extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField txtnum3;
	private JLabel lblNewLabel;
	private JButton btnCalcular;
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
					Calcula_La_Media frame = new Calcula_La_Media();
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
	public Calcula_La_Media() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Ingrese los 3 n\u00FAmeros para calcular la media");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 318, 53);
		contentPane.add(lblNewLabel);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(338, 11, 89, 23);
		contentPane.add(btnCalcular);
		
		btnBorrar = new JButton("Borrar");
		btnCalcular.addActionListener(this);
		btnBorrar.setBounds(338, 45, 89, 23);
		contentPane.add(btnBorrar);
		
		txtnum1 = new JTextField();
		txtnum1.addKeyListener(new KeyAdapter() {
			//solose puede ingresar numeros
			
			@Override
			public void keyTyped(KeyEvent reconocetecla) {
				
				txtnum1.addKeyListener(new KeyAdapter() {
					public void keyTyped(KeyEvent reconocetecla) {
						
						char almacenatecla = reconocetecla.getKeyChar();
						if (!Character.isDigit(almacenatecla) && almacenatecla != '.' ){
							reconocetecla.consume();		
						}
						if(almacenatecla == '.' && txtnum1.getText().contains(".")) {
							reconocetecla.consume();
							
						}
					}
					
				});
	
				}

		});
		txtnum1.setBounds(10, 75, 86, 20);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		txtnum2 = new JTextField();
		txtnum2.setColumns(10);
		txtnum2.setBounds(106, 75, 86, 20);
		contentPane.add(txtnum2);
		
		txtnum3 = new JTextField();
		txtnum3.setColumns(10);
		txtnum3.setBounds(202, 75, 86, 20);
		contentPane.add(txtnum3);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 106, 414, 144);
		contentPane.add(scrollPane);
		
		txtA = new JTextArea();
		scrollPane.setViewportView(txtA);
	}
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource()== btnBorrar) {
			actionPerformedBtnBorrar(arg0);
			
		}
		if(arg0.getSource()==btnCalcular) {
			
			actionPerformedBtnCalcular(arg0);
		}
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtnum1.setText("");
		txtnum2.setText("");
		txtnum3.setText("");
		txtA.setText("");
		txtnum1.requestFocus();
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		
		double num1,num2,num3,ope1,ope2;
		
		if(txtnum1.getText().length()==0) {
			txtA.setText("ingresa un numero 1 ");
			txtnum1.requestFocus();
			return;
		}
		
		if (txtnum2.getText().length()==0) {
			txtA.setText("ingresa el numero 2");
			txtnum2.requestFocus();
			return;
		}
		 
		if (txtnum3.getText().length()==0) {
			txtA.setText("ingresa el numero 3");
			txtnum3.requestFocus();
			return;
		}
		
		num1=Double.parseDouble(txtnum1.getText());
		num2=Double.parseDouble(txtnum2.getText());
		num3=Double.parseDouble(txtnum3.getText());
		
		ope1=num1+num2+num3;
		ope2= ope1/3;
		
		
		txtA.setText("LA MEDIA ES: " + decimalFormat(ope2));
		
		
		
	}
	public String decimalFormat(double p) {
		
		return String.format("%.2f", p);
	}
	
	
}
