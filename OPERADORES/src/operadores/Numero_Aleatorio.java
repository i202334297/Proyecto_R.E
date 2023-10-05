package operadores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Numero_Aleatorio extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private JPanel contentPane;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numero_Aleatorio frame = new Numero_Aleatorio();
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
	public Numero_Aleatorio() {
		setTitle("Redondear Numero");
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
		txtS.setFont(new Font("Monospaced", Font.BOLD, 17));
		scrollPane.setViewportView(txtS);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(297, 34, 89, 23);
		contentPane.add(btnProcesar);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource()== btnProcesar ) {
			actionPerformedBtnProcesar(arg0);
		}

		
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		
		
		double decimal;
		int entero;
		
		//random en decimal
		
		 decimal=Math.random();
		 
		 //random en entero int conviert en entero al random 
		 
		 entero= (int) (Math. floor (Math.random()*(23-1+17)+5));
		 
		
	
		
		
		
		
	
	txtS.setText("-----LOS NUMEROS RANDOM----- \n");
	imprimo("numero random en decimal    : " + decimal);
	imprimo("numero random en entero     : " + entero);
	}
	
	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}
	
	
	
}



