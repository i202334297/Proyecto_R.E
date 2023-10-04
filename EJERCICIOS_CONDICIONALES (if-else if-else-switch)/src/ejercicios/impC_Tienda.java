package ejercicios;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class impC_Tienda extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textprecio;
	private JTextField textcantidad;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
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
					impC_Tienda frame = new impC_Tienda();
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
	public impC_Tienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 25, 73, 14);
		contentPane.add(lblPrecio);
		
		textprecio = new JTextField();
		textprecio.setColumns(10);
		textprecio.setBounds(93, 22, 86, 20);
		contentPane.add(textprecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 69, 73, 14);
		contentPane.add(lblCantidad);
		
		textcantidad = new JTextField();
		textcantidad.setColumns(10);
		textcantidad.setBounds(93, 66, 86, 20);
		contentPane.add(textcantidad);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 109, 414, 141);
		contentPane.add(txtS);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 46, 89, 23);
		contentPane.add(btnBorrar);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 21, 89, 23);
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
		textprecio.setText("");
		textcantidad.setText("");
		txtS.setText("");
		textprecio.requestFocus();
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		
		
		double pre,desc,impP,impC;
		int cant,cara,gomi  ;
		
		
		
		if(textprecio.getText().length() ==0) {
			txtS.setText("debe ingresar un precio");
			textprecio.requestFocus();
			return;
		}
		else {
			 Double prec = Double.parseDouble(textprecio.getText());
			if(prec<0) {
				txtS.setText("¡¡DEBE INGRESAR UN PRECIO POSITIVO PARA PRECIO!!");
				textprecio.requestFocus();
				return;	
			}

		}
		
		
	
		
		
		if(textcantidad.getText().length()==0) {
			txtS.setText("Debe ingresar una cantidad");
			textcantidad.requestFocus();
			return;
		}
		else {
			Double cantd = Double.parseDouble(textcantidad.getText());
			if(cantd<0) {
				txtS.setText("¡¡DEBE INGRESAR UN PRECIO POSITIVO PARA CANTIDAD!!");
				return;
			}
		}
		
		
		
	
		
		
		
		pre= Double.parseDouble(textprecio.getText());
		cant=Integer.parseInt(textcantidad.getText());
		
		
		impC=pre*cant;
		desc=impC * 0.05;
		impP=impC-desc;
		cara=cant*2;
		gomi=cant*3;
		
		
		
		
		txtS.setText ("IMPORTE DE COMPRA    : " + decimalFormat(impC) + "\n" );
		     imprimo ("IMPORTE DESCUENTO    : " + decimalFormat(desc));
		     imprimo ("IMPORTE PAGAR        : " + decimalFormat(impP));
		     imprimo ("CARAMELOS            : " + cara);
		     imprimo ("GOMITAS              : " + gomi);
	


	
		     
	
	} 
	
	
	
	
	
	
	

	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}	
}
		
		
		