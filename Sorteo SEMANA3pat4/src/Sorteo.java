import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Sorteo extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textingresa;
	private JTextField textA;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnjugar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorteo frame = new Sorteo();
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
	public Sorteo() {
		setTitle("Juega y gana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("\u00A1\u00A1\u00A1JUEGA Y GANA!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 11, 262, 40);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Ingrese su n\u00FAmero: \r\n");
		lblNewLabel_1.setBounds(10, 53, 115, 21);
		contentPane.add(lblNewLabel_1);
		
		textingresa = new JTextField();
		textingresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textingresa.setBounds(10, 78, 91, 40);
		contentPane.add(textingresa);
		textingresa.setColumns(10);
		
		btnjugar = new JButton("JUGAR");
		btnjugar.addActionListener(this);
		btnjugar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnjugar.setBounds(304, 78, 89, 40);
		contentPane.add(btnjugar);
		
		textA = new JTextField();
		textA.setBounds(0, 129, 414, 121);
		contentPane.add(textA);
		textA.setColumns(10);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnjugar) {
			actionPerformedBtnjugar(arg0);
		}
	}
	protected void actionPerformedBtnjugar(ActionEvent arg0) {
		
		int numero;
		
		numero=Integer.parseInt(textingresa.getText());
		
		String regalo;
		
		if (numero>0) {
			switch(numero) {
			case 10:
			case 48:
				regalo="Reloj";
				break;
			
			case 27:
				regalo="USB";
				break;
				
			case 36:
				regalo="Pelota";
				break;
			
			default:
				regalo="Lapicero";
				break;
			}
			textA.setText("El regalo es :" + regalo );
		}
		else 
			textA.setText("No tienes regalo F");
		
		
		
		
			
	}
}
