package packj2;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaMoldura extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtApelido;
	private JTextField txtMorada;
	private JLabel lblNome;
	private JLabel lblApelido;
	private JLabel lblMorada;
	private JLabel lblEmail;
	private JFormattedTextField ftxtEmail;
	private JLabel lblTelemovel;
	private JFormattedTextField ftxtTelemovel;
	private JLabel lblDataNasc;
	private JFormattedTextField jtxtDataNasc;
	private JLabel lbldade;
	private JFormattedTextField ftxtIdade;
	private JMenuBar menuBar; 
	private JLabel lblSexo;
	private JFormattedTextField ftxtSexo;
	private JMenuItem mntm1 ;
	private JMenuItem mntm1_1 ;
	private JRadioButtonMenuItem radioMasculino;
	private JRadioButtonMenuItem radioFeminino;
	private JTextField txtResultado;
	private JButton btnInserir; 
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaMoldura frame = new JavaMoldura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public JavaMoldura() {
		Dimension tam = new Dimension(820,350);
		
		setTitle("Moldura de Cliente");
		getContentPane().setLayout(null);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 116, 41, 33);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(71, 118, 143, 28);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		lblApelido = new JLabel("Apelido");
		lblApelido.setBounds(223, 116, 47, 33);
		getContentPane().add(lblApelido);
		
		txtApelido = new JTextField();
		txtApelido.setBounds(280, 116, 125, 28);
		getContentPane().add(txtApelido);
		txtApelido.setColumns(10);
		
		lblMorada = new JLabel("Morada");
		lblMorada.setBounds(415, 116, 47, 28);
		getContentPane().add(lblMorada);
		
		txtMorada = new JTextField();
		txtMorada.setBounds(465, 116, 322, 28);
		getContentPane().add(txtMorada);
		txtMorada.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(20, 171, 41, 14);
		getContentPane().add(lblEmail);
		
		ftxtEmail = new JFormattedTextField();
		ftxtEmail.setBounds(71, 164, 191, 28);
		getContentPane().add(ftxtEmail);
		
		lblTelemovel = new JLabel("Telemóvel");
		lblTelemovel.setBounds(291, 164, 58, 28);
		getContentPane().add(lblTelemovel);
		
		ftxtTelemovel = new JFormattedTextField();
		ftxtTelemovel.setBounds(358, 164, 110, 28);
		getContentPane().add(ftxtTelemovel);
		
		lblDataNasc = new JLabel("Data de Nascimento");
		lblDataNasc.setBounds(478, 168, 125, 21);
		getContentPane().add(lblDataNasc);
		
		jtxtDataNasc = new JFormattedTextField();
		jtxtDataNasc.setBounds(606, 167, 181, 25);
		getContentPane().add(jtxtDataNasc);
		
		lbldade = new JLabel("Idade");
		lbldade.setBounds(20, 211, 41, 14);
		getContentPane().add(lbldade);
		
		ftxtIdade = new JFormattedTextField();
		ftxtIdade.setBounds(71, 203, 61, 28);
		getContentPane().add(ftxtIdade);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(20, 11, 690, 58);
		getContentPane().add(menuBar);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(142, 211, 36, 14);
		getContentPane().add(lblSexo);
		
		ftxtSexo = new JFormattedTextField();
		ftxtSexo.setBounds(188, 203, 71, 26);
		getContentPane().add(ftxtSexo);
		
		mntm1 = new JMenuItem("1");
		mntm1.setBounds(25, 18, 125, 26);
		getContentPane().add(mntm1);
		
		mntm1_1 = new JMenuItem("1");
		mntm1_1.setBounds(151, 18, 125, 26);
		getContentPane().add(mntm1_1);
		
		radioMasculino = new JRadioButtonMenuItem("Masculino");
		radioMasculino.setBounds(301, 205, 133, 26);
		getContentPane().add(radioMasculino);
		
		radioFeminino = new JRadioButtonMenuItem("Feminino");
		radioFeminino.setBounds(301, 232, 133, 26);
		getContentPane().add(radioFeminino);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(0, 319, 804, 28);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInserir.setBounds(20, 268, 89, 23);
		getContentPane().add(btnInserir);
		
		setSize( new Dimension(820, 386) );
		setVisible(true);
	}
}

















