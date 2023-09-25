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

public class Fabrica extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textcantidad;
	private JTextField textprecio;
	private JLabel lblCantidad;
	private JLabel lblPrecio;
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
					Fabrica frame = new Fabrica();
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
	public Fabrica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textcantidad = new JTextField();
		textcantidad.setColumns(10);
		textcantidad.setBounds(101, 65, 86, 20);
		contentPane.add(textcantidad);
		
		textprecio = new JTextField();
		textprecio.setColumns(10);
		textprecio.setBounds(101, 34, 86, 20);
		contentPane.add(textprecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(20, 68, 71, 14);
		contentPane.add(lblCantidad);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(20, 37, 71, 14);
		contentPane.add(lblPrecio);
		
		txtS = new JTextArea();
		txtS.setBounds(11, 91, 412, 159);
		contentPane.add(txtS);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(335, 58, 89, 23);
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
		textcantidad.setText("");
		textprecio.setText("");
		txtS.setText("");
		textcantidad.requestFocus();
	}
	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		double pre,impC,desc,impP;
		int cant,lapi;
		
		// 1

		//if(textprecio.getText().length() ==0) {
		//	txtS.setText("Debe ingresar un precio");
		//	textprecio.requestFocus();
		//	return;
		// }
		//else {
		//	pre=Double.parseDouble(textprecio.getText());
			
		//	if (pre<0) {
		//		txtS.setText("DEBE SER POSITIVO");
		//		textprecio.requestFocus();
		//		return;
		//	}			
		//}
			
		
		// 2
		
		if(textprecio.getText().length() ==0) {
			txtS.setText("Debe ingresar un precio");
			textprecio.requestFocus();
			return;
		}
		else if(Double.parseDouble(textprecio.getText())<0){			
			txtS.setText("DEBE SER POSITIVO");
			textprecio.requestFocus();
			return;			
		}
		else if(textcantidad.getText().length()==0 ) {
			txtS.setText("Debe ingresar cantidad");
			textcantidad.requestFocus();
			return;
		}						
		else if(Integer.parseInt(textcantidad.getText()) <0){
			txtS.setText("DEBE SER POSITIVO");
			textcantidad.requestFocus();
			return;
		}
		else {
			pre = Double.parseDouble(textprecio.getText());
			cant = Integer.parseInt(textcantidad.getText());
			
			impC= pre*cant;
			desc=impC*0.07;
			impP=impC-desc;
			lapi=cant*2;
													
			switch (cant) { 
		    case 10:
		    	txtS.setText("Ingresaste 10 como cantidad");
		     break;
		    case 20:
		    	txtS.setText("Ingresaste 20 como cantidad");
		     break;	   		    
		    default:
		    	txtS.setText("Ingresaste mayor a 10 como cantidad");
		  }
			
					
		}					
	}

	public String decimalFormat(double p) {
		return String.format("%.2f",p);
	}
	public void imprimo (String s) {
		txtS.append(s +"\n");
	}	
}
			