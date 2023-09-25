import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class calculardaños extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtViento;
	private JLabel lblNewLabel;
	private JButton btnCalcular;
	private JTextArea txtA;
	private JButton btnBorrar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculardaños frame = new calculardaños();
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
	public calculardaños() {
		setTitle("Da\u00F1os causados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Ingrese la velocidad del viento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 264, 42);
		contentPane.add(lblNewLabel);
		
		txtViento = new JTextField();
		txtViento.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtViento.setBounds(10, 48, 264, 51);
		contentPane.add(txtViento);
		txtViento.setColumns(10);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(this);
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalcular.setBounds(294, 48, 130, 51);
		contentPane.add(btnCalcular);
		
		txtA = new JTextArea();
		txtA.setFont(new Font("Monospaced", Font.PLAIN, 28));
		txtA.setBounds(10, 107, 414, 143);
		contentPane.add(txtA);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(this);
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBorrar.setBounds(295, 0, 129, 53);
		contentPane.add(btnBorrar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}
		if (arg0.getSource() == btnCalcular) {
			actionPerformedBtnCalcular(arg0);
		}
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtViento.setText("");
		txtA.setText("");
		txtViento.requestFocus();
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		
		double viento;
		viento=Double.parseDouble(txtViento.getText());
		
		if(txtViento.getText().length() ==0) {
			txtA.setText("Deve ingresar la velocidad del viento");
			txtViento.requestFocus();
			return;
		}
		else if (viento>=250) {
			txtA.setText("DAÑOS CATASTRÓFICOS");
			txtViento.requestFocus();
			return;
		}
		else if (viento>210 && viento<250){
			txtA.setText("DAÑOS MUY IMPORTANTES");
			txtViento.requestFocus();
			return;
		}
		else if (viento>178 && viento<210) {
			txtA.setText("DAÑOS IMPORTANTES");
			txtViento.requestFocus();
			return;
		}
		else if (viento>154 && viento<178) {
			txtA.setText("DAÑOS MODERADOS");
			txtViento.requestFocus();
			return;
		}
		else if (viento>120&&viento<154) {
			txtA.setText("DAÑOS MINIMOS");
			txtViento.requestFocus();
			return;
		}
		else {
			txtA.setText("DAÑOS NINGUNO");
			txtViento.requestFocus();
			return;
		}
	}
	
}
	

