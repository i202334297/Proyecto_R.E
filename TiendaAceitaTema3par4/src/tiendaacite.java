import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class tiendaacite extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtcantidad;
	private JComboBox Cboxcodigo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextArea txtA;
	private JButton btnProcesar;
	private JButton btnBorar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tiendaacite frame = new tiendaacite();
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
	public tiendaacite() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Cboxcodigo = new JComboBox();
		Cboxcodigo.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));
		Cboxcodigo.setToolTipText("");
		Cboxcodigo.setBounds(123, 11, 88, 22);
		contentPane.add(Cboxcodigo);

		lblNewLabel = new JLabel("Codigo del aceite");
		lblNewLabel.setBounds(10, 15, 103, 14);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(10, 59, 88, 14);
		contentPane.add(lblNewLabel_1);

		txtcantidad = new JTextField();
		txtcantidad.setBounds(123, 56, 86, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);

		txtA = new JTextArea();
		txtA.setBounds(10, 83, 414, 167);
		contentPane.add(txtA);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(334, 11, 89, 23);
		contentPane.add(btnProcesar);

		btnBorar = new JButton("Borrar");
		btnBorar.addActionListener(this);
		btnBorar.setBounds(334, 55, 89, 23);
		contentPane.add(btnBorar);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
		if (arg0.getSource() == btnBorar) {
			actionPerformedBtnBorar(arg0);
		}

	}

	protected void actionPerformedBtnBorar(ActionEvent arg0) {
		txtcantidad.setText("");
		txtA.setText("");
		txtcantidad.requestFocus();
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		double impC,impD,impP;
		int cant,tipo;
		
		
		if(txtcantidad.getText().length() == 0 ){
			txtA.setText("Ingrese el dato la cantidad ");
			return;
		}
		
		tipo = Cboxcodigo.getSelectedIndex();
		cant=Integer.parseInt(txtcantidad.getText());
		

		
		
		
		
		switch (tipo) {
			case 0:
				impC = 6.0 * cant;
				break;
			case 1:
				impC = 5.5 *cant;
				break;

			case 2:
				impC = 4.5 * cant;
				break;
			
			default:
				impC=4.7*cant;
				
		}
		if (cant >0)  {
			
			
			
		switch (cant) {
		case 1:
		case 2:
		case 3:
			impD = 0.05 * impC;
			break;
		case 4:
		case 5:
		case 6:
			impD = 0.075*impC;
			break;
		case 7:
		case 8:
		case 9:
			impD = 0.10*impC;
			break;
		default:
			impD = 0.125*impC;
			
		}
			
			

		
		
		impP = impC-impD;
		
		txtA.setText("Importe de la compra     : S/. " + impC + "\n");
		    imprimo ("Importe del descuento    : S/. " + impD );
		    imprimo ("Importe a pagar          : S/. " + impP );
		}		
		
	}

	public String decimalFormat(double p) {
		return String.format("%.2f", p);
	}

	public void imprimo(String s) {
		txtA.append(s + "\n");
	}
}