package caja;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class caja extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textlargo;
	private JTextField textancho;
	private JTextField textalto;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblLargo;	
	private JTextArea txtS;
	private JButton btnProcesar;
	private JButton btnBorrar;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caja frame = new caja();
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
	public caja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLargo = new JLabel("Largo");
		lblLargo.setBounds(10, 35, 46, 14);
		contentPane.add(lblLargo);
		
		textlargo = new JTextField();
		textlargo.setColumns(10);
		textlargo.setBounds(66, 32, 86, 20);
		contentPane.add(textlargo);
		
		lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(10, 60, 46, 14);
		contentPane.add(lblAncho);
		
		textancho = new JTextField();
		textancho.setColumns(10);
		textancho.setBounds(66, 57, 86, 20);
		contentPane.add(textancho);
		
		lblAlto = new JLabel("Alto");
		lblAlto.setBounds(10, 85, 46, 14);
		contentPane.add(lblAlto);
		
		textalto = new JTextField();
		textalto.setColumns(10);
		textalto.setBounds(66, 82, 86, 20);
		contentPane.add(textalto);
		
		txtS = new JTextArea();
		txtS.setBounds(11, 114, 412, 90);
		contentPane.add(txtS);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 56, 89, 23);
		contentPane.add(btnBorrar);
						
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 31, 89, 23);
		contentPane.add(btnProcesar);		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		textlargo.setText("");
		textancho.setText("");
		textalto.setText("");
		txtS.setText("");
		textlargo.requestFocus();
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		double Largo,ancho,alto,area,volu;
		
		if(textlargo.getText().length() ==0) {
			txtS.setText("　DEBE INGRESAR EL DATO DE LARGO!!");
			textlargo.requestFocus();
			return;
		}
		else {
			Largo=Double.parseDouble(textlargo.getText());
			if(Largo<0) {
				txtS.setText("　OE DEBE SER UN NUMERO POSITIVO!!");
				textlargo.requestFocus();
				return;
			}
		}
		
		
		
		if(textancho.getText().length() ==0) {
			txtS.setText("　DEBE INGRESAR EL DATO DE ANCHO!!");
			textancho.requestFocus();
			return;
		}
		else {
			ancho=Double.parseDouble(textancho.getText());
			if(ancho<0) {
				txtS.setText("OE TU NO APRENDES NO, TE DIJE POSITIVO");
				textancho.requestFocus();
				return;
				
			}
		}
		
		
		
		if(textalto.getText().length() ==0) {
			txtS.setText("　DEBE INGRESAR EL DATO DE ALTO!!");
			textalto.requestFocus();
			return;
		}
		else {
			alto=Double.parseDouble(textalto.getText());
			if(alto<0) {
				txtS.setText("QUE FUE MANO, ES POSITIVO");
				textalto.requestFocus();
				return;
			}
		}
		
		// Probando cambios para git
		
		Largo=Double.parseDouble(textlargo.getText());
		ancho=Double.parseDouble(textancho.getText());
		alto =Double.parseDouble(textalto. getText());
		
		
		volu=Largo*ancho*alto;
		area=2*(Largo*ancho+Largo*alto+ancho*alto);
		
		txtS.setText("Volumen  : " + decimalFormat (volu) +"\n");   
			 imprimo("Area     : " + decimalFormat (area));			

	}

	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}	
}
