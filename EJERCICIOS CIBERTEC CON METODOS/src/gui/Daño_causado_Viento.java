package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Da�o_causado_Viento extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDano;
	private JLabel lblIngreseDa�os;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnProcesar;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Da�o_causado_Viento frame = new Da�o_causado_Viento();
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
	public Da�o_causado_Viento() {
		setTitle("CALCULA DA\u00D1O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblIngreseDa�os = new JLabel("Ingrese el da\u00F1o causado");
		lblIngreseDa�os.setBounds(10, 11, 174, 42);
		contentPane.add(lblIngreseDa�os);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 414, 186);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		txtDano = new JTextField();
		txtDano.setBounds(167, 22, 86, 20);
		contentPane.add(txtDano);
		txtDano.setColumns(10);
		
		btnProcesar = new JButton("PROCESAR");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(294, 21, 93, 23);
		contentPane.add(btnProcesar);
	}
	
	double da�o;
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		leerDatos();
		da�ocausado();
	}
	
	void leerDatos() {
		da�o=Double.parseDouble(txtDano.getText());
	}
	void da�ocausado() {
		if 		(da�o>=250) 			{txtS.setText("DA�OS CATASTROFICOS");}
		else if (da�o>=210 && da�o<250) {txtS.setText("DA�OS MUY IMPORTANTES");}
		else if (da�o>=178 && da�o<210) {txtS.setText("DA�OS IMPORTANTES");}
		else if (da�o>=154 && da�o<178) {txtS.setText("DA�OS MODERADOS");}
		else if (da�o>=120 && da�o<154) {txtS.setText("DA�OS MINIMOS");}
		else							{txtS.setText("NINGUNO");}
	}
	
	
}
