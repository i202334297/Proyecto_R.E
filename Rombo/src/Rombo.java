import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rombo extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textDiagonalmenor;
	private JTextField textDiagonalmayor;
	private JLabel lblDiagonalMayor;
	private JLabel lblDiagonalMenor;
	private JTextArea txtS;
	private JButton btnBorrar;
	private JButton btnProcesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rombo frame = new Rombo();
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
	public Rombo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDiagonalMayor = new JLabel("Diagonal mayor");
		lblDiagonalMayor.setBounds(10, 38, 89, 14);
		contentPane.add(lblDiagonalMayor);
		
		lblDiagonalMenor = new JLabel("Diagonal menor");
		lblDiagonalMenor.setBounds(10, 63, 89, 14);
		contentPane.add(lblDiagonalMenor);
		
		textDiagonalmenor = new JTextField();
		textDiagonalmenor.setColumns(10);
		textDiagonalmenor.setBounds(109, 60, 86, 20);
		contentPane.add(textDiagonalmenor);
		
		textDiagonalmayor = new JTextField();
		textDiagonalmayor.setColumns(10);
		textDiagonalmayor.setBounds(109, 35, 86, 20);
		contentPane.add(textDiagonalmayor);
		
		txtS = new JTextArea();
		txtS.setBounds(11, 92, 412, 115);
		contentPane.add(txtS);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 59, 89, 23);
		contentPane.add(btnBorrar);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 34, 89, 23);
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
		textDiagonalmayor.setText("");
		textDiagonalmenor.setText("");
		txtS.setText("");
		textDiagonalmayor.requestFocus();
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		double mayor,menor,area;
		
		if(textDiagonalmayor.getText().length() == 0 ){
			txtS.setText("Ingrese el dato de Diagonal mayor ");
			return;
		}
		else {
			mayor=Double.parseDouble(textDiagonalmayor.getText());
			if (mayor<0) {
				txtS.setText("¡¡DEBE INGRESAR UN NUMERO POSITIVO!!");
				textDiagonalmayor.requestFocus();
				return;
			}
		}
		
		if(textDiagonalmenor.getText().length()==0) {
			txtS.setText("Ingrese el dato de Diagonal menor");
			return;
		}
		else {
			menor=Double.parseDouble(textDiagonalmenor.getText());
			if (menor<0) {
				txtS.setText("¡¡DEBE INGRESAR UN NUMERO POSITIVO!!");
				textDiagonalmenor.requestFocus();
				return;
			}
		}
		
		mayor=Double.parseDouble(textDiagonalmayor.getText());
		menor=Double.parseDouble(textDiagonalmenor.getText());
		
		area=mayor*menor/2;
		
		txtS.setText("EL AREA ES : " +decimalFormat(area) + "\n");
		
	}

	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}	
}
	
	
	
