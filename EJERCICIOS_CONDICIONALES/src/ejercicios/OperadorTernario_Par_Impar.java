package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OperadorTernario_Par_Impar extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtn1;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperadorTernario_Par_Impar frame = new OperadorTernario_Par_Impar();
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
	public OperadorTernario_Par_Impar() {
		setTitle("Par o Impar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtn1 = new JTextField();
		txtn1.setBounds(27, 36, 86, 20);
		contentPane.add(txtn1);
		txtn1.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(215, 35, 89, 23);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 86, 377, 164);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed (ActionEvent arg0) {
		
		if (arg0.getSource()==btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		String mensaje;
		int nu1;
		
		nu1=Integer.parseInt(txtn1.getText());
		
		mensaje = (nu1%2==0) ? "es par" : "es impar";
		
		
		txtS.setText("el numero: " + mensaje);
	
	}
	

	
	
	}
	
