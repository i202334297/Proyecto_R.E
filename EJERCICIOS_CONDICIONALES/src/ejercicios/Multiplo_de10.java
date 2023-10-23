package ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiplo_de10 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnu1;
	private JButton btnProcesar;
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
					Multiplo_de10 frame = new Multiplo_de10();
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
	public Multiplo_de10() {
		setTitle("Multiplo de 10?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnu1 = new JTextField();
		txtnu1.setBounds(339, 17, 86, 20);
		contentPane.add(txtnu1);
		txtnu1.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(336, 48, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 82, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 17, 315, 233);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}

	
	public void actionPerformed( ActionEvent arg0) {
		
		if (arg0.getSource()==btnBorrar) {
			actionPerformedBtnBorrar(arg0);
			
		}
		if (arg0.getSource()==btnProcesar) {
			actionPerformedBtnProcesar(arg0);
			
		}
	}
	
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtnu1.setText("");
		txtS.setText("");
		txtnu1.requestFocus();
		
	}
	
	
	protected void actionPerformedBtnProcesar (ActionEvent arg0){
		
		int num1;
		
		num1= Integer.parseInt(txtnu1.getText());
		
		if (num1 % 10 == 0) {
			
			txtS.setText("el número "+num1+" es multiplo de 10");
		}
		
		else {
			
			txtS.setText("el número "+num1+" no es multiplo de 10 ");
		}
		
		
		
	}
}
