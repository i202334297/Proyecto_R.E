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


public class Operadores_Basicos extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private JPanel contentPane;
	private JTextField txtNum1;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JScrollPane scrollPane;
	private JTextField txtNum2;
	private JLabel lblnum1;	
	private JLabel lblnum2;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operadores_Basicos frame = new Operadores_Basicos();
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
	public Operadores_Basicos() {
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
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(10, 35, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(111, 35, 86, 20);
		contentPane.add(txtNum2);
		
		lblnum1 = new JLabel("num1");
		lblnum1.setBounds(10, 11, 46, 14);
		contentPane.add(lblnum1);
		
		lblnum2 = new JLabel("num2");
		lblnum2.setBounds(109, 11, 104, 14);
		contentPane.add(lblnum2);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource()== btnProcesar ) {
			actionPerformedBtnProcesar(arg0);
		}

		
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
	
		double num1,num2,suma,resta,multiplicaion,division,residuo;

		num2=Double.parseDouble(txtNum2.getText());
		
		num1=Double.parseDouble(txtNum1.getText());
		
		suma              =num1 + num2;
		resta             =num1 - num2;
		multiplicaion     =num1 * num2;
		division          =num1 / num2;
		residuo           =num1 % num2;
	
		
		
	
		
	
		
		
	
	txtS.setText("-----OPERACIONES BASICAS-----" + "\n");
	imprimo("LA SUMA ES           : "  + decimalFormat (suma));
	imprimo("LA RESTA ES          : "  + decimalFormat (resta));
	imprimo("LA MULTIPLICACION ES : "  + decimalFormat (multiplicaion));
	imprimo("LA DIVISION ES       : "  + decimalFormat (division));
	imprimo("EL RESIDUO ES        : "  + decimalFormat (residuo));
		
	}
	
	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}
}


