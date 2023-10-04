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
import java.awt.Color;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Suma_Consecutiva extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;
	private JLabel lblTiltle;
	
	private JScrollPane scrollPane;
	private JTextArea txtA;
	private JButton btnCalcular;
	private JButton btnBorrar;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suma_Consecutiva frame = new Suma_Consecutiva();
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
	public Suma_Consecutiva() {
		setTitle("Suma Consecutiva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 75, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTiltle = new JLabel("Ingrese el numero que \r\nquieres que se sume:");
		lblTiltle.setForeground(Color.WHITE);
		lblTiltle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTiltle.setBounds(10, 11, 311, 42);
		contentPane.add(lblTiltle);
		
		txtNum = new JTextField();
		txtNum.setBounds(10, 52, 123, 27);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 102, 414, 148);
		contentPane.add(scrollPane);
		
		txtA = new JTextArea();
		scrollPane.setViewportView(txtA);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(180, 54, 89, 23);
		contentPane.add(btnCalcular);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(290, 54, 89, 23);
		contentPane.add(btnBorrar);
	}
	public void actionPerformed(ActionEvent arg0){
		if (arg0.getSource()==btnBorrar) {
			actionPerformedBtnBorrar(arg0);
			
		}
		if (arg0.getSource()==btnCalcular) {
			actionPerformedBtnCalcular(arg0);
		}
		
	}
	
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		
		txtNum.setText("");
		txtA.setText("");
		txtNum.requestFocus();	
	}
	
	
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		
		int num,total;
		
		num=Integer.parseInt(txtNum.getText());
		
		total = 0;
		
		for (int  i=1 ; i<=num; i++ ) {
			
			 total = total + i;
			
		}
		
		
		
		txtA.setText("la suma es:" + (total) );
		
	}
	
	
	
	
	
}
