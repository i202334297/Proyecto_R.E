package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tienda_combobox extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCant;
	private JPanel contentPane_1;
	private JLabel lblCodigo;
	private JLabel lblCantidad;
	private JButton btnProcesar;
	private JButton btnBorar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	@SuppressWarnings("rawtypes")
	private JComboBox CboCod;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda_combobox frame = new Tienda_combobox();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Tienda_combobox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 0, 414, 261);
		contentPane.add(contentPane_1);
		
		CboCod = new JComboBox();
		CboCod.setModel (new DefaultComboBoxModel (new String[] {"0", "1", "2", "3"}));
		CboCod.setToolTipText("");
		CboCod.setBounds(123, 11, 88, 22);
		contentPane_1.add(CboCod);
		
		lblCodigo = new JLabel("Codigo del aceite");
		lblCodigo.setBounds(10, 15, 103, 14);
		contentPane_1.add(lblCodigo);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 59, 88, 14);
		contentPane_1.add(lblCantidad);
		
		txtCant = new JTextField();
		txtCant.setColumns(10);
		txtCant.setBounds(123, 56, 86, 20);
		contentPane_1.add(txtCant);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(273, 11, 89, 23);
		contentPane_1.add(btnProcesar);
		
		btnBorar = new JButton("Borrar");
		btnBorar.addActionListener(this);
		btnBorar.setBounds(273, 55, 89, 23);
		contentPane_1.add(btnBorar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 87, 404, 163);
		contentPane_1.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed( ActionEvent arg0) {
		if(arg0.getSource()==btnBorar) {
			actionPerformedBtnBorar(arg0);
		}
		if(arg0.getSource()==btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
		
	}
	
	protected void actionPerformedBtnBorar(ActionEvent arg0) {
		
		txtCant.setText("");
		txtS.setText("");
		txtCant.requestFocus();
		
		
	}
	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		double impC,impD,impP;
		int cant,tipo;
		
		
		if(txtCant.getText().length() == 0 ){
			txtS.setText("Ingrese el dato la cantidad ");
			return;
		}
		
		tipo = CboCod.getSelectedIndex();
		cant=Integer.parseInt(txtCant.getText());
		

		
		
		
		
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
		
		txtS.setText("Importe de la compra     : S/. " + impC + "\n");
		    imprimo ("Importe del descuento    : S/. " + impD );
		    imprimo ("Importe a pagar          : S/. " + impP );
		}		
		
	}

	public String decimalFormat(double p) {
		return String.format("%.2f", p);
	}

	public void imprimo(String s) {
		txtS.append(s + "\n");
	}
}