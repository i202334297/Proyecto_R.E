package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Suma_Resta_ect_2num extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JLabel lblTitle;
	private JButton btnCalcular;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suma_Resta_ect_2num frame = new Suma_Resta_ect_2num();
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
	public Suma_Resta_ect_2num() {
		setTitle("CALCULA TODAS LAS OPERACIONES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("INGRESA LOS 2 N\u00DAMEROS:");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitle.setBounds(10, 11, 253, 30);
		contentPane.add(lblTitle);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(10, 58, 86, 20);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(10, 89, 86, 20);
		contentPane.add(txtnum2);
		txtnum2.setColumns(10);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(284, 55, 89, 23);
		contentPane.add(btnCalcular);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(284, 88, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 120, 404, 130);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {		
		if (arg0.getSource()==btnBorrar) {
			actionPerformedBtnBorrar(arg0);
			
		}
		if(arg0.getSource()==btnCalcular) {
			actionPerformedBtnCalcular(arg0);
		}
			
	}
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		
		txtnum1.setText("");
		txtnum2.setText("");
		txtS.setText("");
		txtnum1.requestFocus();
		
		
		
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		
		double num1,num2,suma,resta,div,multi;
		
		num1=Double.parseDouble(txtnum1.getText());
		num2=Double.parseDouble(txtnum2.getText());
		
		suma =num1+num2;
		resta=num1-num2;
		div  =num1/num2;
		multi=num1*num2;
		
		
		txtS.setText("la suma es             : " +  decimalFormat (suma) + "\n");
		         imp("la resta es            : " +  decimalFormat (resta));
		         imp("la division es         : " +  decimalFormat (div));
		         imp("la multiplicacion es   : " +  decimalFormat (multi));
		
	}
	public String decimalFormat (double p) {
		return String.format("%.2f",p);
		
	}
	public void imp (String s) {
		txtS.append(s+"\n");
		
	}
	
}
