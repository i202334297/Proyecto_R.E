package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Mayor_Menor_Igual extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnu1;
	private JTextField txtnu2;
	private JLabel lbltitle;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mayor_Menor_Igual frame = new Mayor_Menor_Igual();
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
	public Mayor_Menor_Igual() {
		setTitle("MAYOR, MENOR O IGUAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitle = new JLabel("Ingrese sus numeros:");
		lbltitle.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		lbltitle.setBounds(10, 11, 271, 36);
		contentPane.add(lbltitle);
		
		txtnu1 = new JTextField();
		txtnu1.setBounds(20, 58, 86, 20);
		contentPane.add(txtnu1);
		txtnu1.setColumns(10);
		
		txtnu2 = new JTextField();
		txtnu2.setBounds(129, 58, 86, 20);
		contentPane.add(txtnu2);
		txtnu2.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 100, 375, 150);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(288, 57, 89, 23);
		contentPane.add(btnCalcular);
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnCalcular) {
			actionPerformedBtnCalcular(arg0);
			
		}
		
		
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		
		int num1,num2;
		
		num1=Integer.parseInt(txtnu1.getText());
		num2=Integer.parseInt(txtnu2.getText());
		
		
		if (num1>num2) {
			
			txtS.setText("el " + num1 + " es mayor");
		}
		else if (num1<num2) {
			txtS.setText("el " + num2 + " es mayor");
			
		}
		else {
			txtS.setText("SON IGUALES");
		}
		
	}
}
