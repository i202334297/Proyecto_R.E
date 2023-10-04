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

public class Hipotenusa_triangulo_recta extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcat1;
	private JTextField txtcat2;
	private JLabel lblIngrese;
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
					Hipotenusa_triangulo_recta frame = new Hipotenusa_triangulo_recta();
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
	public Hipotenusa_triangulo_recta() {
		setTitle("Calcular Hipotenusa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblIngrese = new JLabel("INGRESE LOS CATETOS");
		lblIngrese.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIngrese.setBounds(10, 11, 202, 47);
		contentPane.add(lblIngrese);
		
		txtcat1 = new JTextField();
		txtcat1.setBounds(20, 69, 86, 20);
		contentPane.add(txtcat1);
		txtcat1.setColumns(10);
		
		txtcat2 = new JTextField();
		txtcat2.setBounds(126, 69, 86, 20);
		contentPane.add(txtcat2);
		txtcat2.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(335, 25, 89, 23);
		contentPane.add(btnCalcular);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 68, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 107, 414, 143);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource()==btnCalcular) {
			actionPerformedBtnCalcular(arg0);
		}
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		
		txtcat1.setText("");
		txtcat1.setText("");
		txtS.setText("");
		txtcat1.requestFocus();
		
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		
		double cat1,cat2,hipote;
		
		cat1=Double.parseDouble(txtcat1.getText());
		cat2=Double.parseDouble(txtcat2.getText());
		
		hipote = (cat1 *cat1) + (cat2 * cat2);
		
		double resultado = Math.sqrt(hipote);
	
	
	txtS.setText("la HIPOTENUSA ES :" + decimalFormat (resultado) +  "\n");
	
	
	}
	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}	
}
