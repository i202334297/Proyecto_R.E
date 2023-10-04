package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nombre_y_Salude extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JLabel lblingresaDato;
	private JButton btnprocesa;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nombre_y_Salude frame = new Nombre_y_Salude();
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
	public Nombre_y_Salude() {
		setTitle("SALUDO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblingresaDato = new JLabel("INGRESA TU NOMBRE ");
		lblingresaDato.setBounds(24, 21, 125, 27);
		contentPane.add(lblingresaDato);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(24, 59, 109, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		btnprocesa = new JButton("SSS");
		btnprocesa.addActionListener(this);
		btnprocesa.setBounds(247, 41, 89, 23);
		contentPane.add(btnprocesa);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 87, 414, 163);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.BOLD, 23));
		scrollPane.setViewportView(txtS);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnprocesa) {
			actionPerformedBtnprocesa(arg0);
		}
		
		
	}
	protected void actionPerformedBtnprocesa(ActionEvent arg0) {
		
		String nombre;
		nombre=String.valueOf(txtnombre.getText());
		
		txtS.setText("Mucho gusto" + " " + nombre);
		
		
		
	}
	
	
}
