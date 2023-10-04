package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Area_Triangulo_Rectangulo extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcat1;
	private JTextField txtcat2;
	private JLabel lblDatos;
	private JButton btnCalcular;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnBorrar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area_Triangulo_Rectangulo frame = new Area_Triangulo_Rectangulo();
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
	public Area_Triangulo_Rectangulo() {
		setTitle("Triangulo Rectangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDatos = new JLabel("Ingresa los Catetos:");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatos.setBounds(31, 21, 276, 28);
		contentPane.add(lblDatos);
		
		txtcat1 = new JTextField();
		txtcat1.setBounds(31, 60, 86, 20);
		contentPane.add(txtcat1);
		txtcat1.setColumns(10);
		
		txtcat2 = new JTextField();
		txtcat2.setBounds(147, 60, 86, 20);
		contentPane.add(txtcat2);
		txtcat2.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(313, 59, 89, 23);
		contentPane.add(btnCalcular);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 93, 400, 157);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(313, 26, 89, 23);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()== btnCalcular) {
			actionPerformedBtnCalcular(arg0);
		}
		if (arg0.getSource()==btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
	}
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtcat1.setText("");
		txtcat2.setText("");
		textArea.setText("");
		txtcat1.requestFocus();
		
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		
		double cat1,cat2,area;
		
		cat1=Double.parseDouble(txtcat1.getText());
		cat2=Double.parseDouble(txtcat2.getText());
	
		area=(cat1*cat2)/2;
		
		
		
		textArea.setText("EL AREA ES:  " +decimalFormat (area) + "\n");

		
	}
	
	
	
	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		textArea.append(s +"\n");
	}	
}
