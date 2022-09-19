package packj2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.io.File;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class JavaPainel extends JPanel  implements WindowListener, WindowFocusListener, WindowStateListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar; 
	private JLabel lblRotuloUtilizador;
	private JFormattedTextField ftxtUtilizador;
	private final JLabel lblPassWord;
	private JPasswordField passwordField;
	private JButton btnCancelar;
	private JButton btnLogin;
	private JFrame moldura ;
	private JPanel painel;
	private JTextField txtResultado;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	/* public boolean abreFicheiro() {
		JFileChooser j = new JFileChooser( new File( "C:\\Users\\Utilizador\\Documents\\" ) );
		
		j.showSaveDialog(null);
	} */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public JavaPainel() {
		setLayout(null);
		
		lblRotuloUtilizador = new JLabel("Utilizador");
		lblRotuloUtilizador.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblRotuloUtilizador.setBounds(10, 125, 170, 31);
		this.add(lblRotuloUtilizador);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(52, 22, 647, 59);
		this.add(menuBar);
		
		ftxtUtilizador = new JFormattedTextField();
		ftxtUtilizador.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost ( FocusEvent e ) {
				if (ftxtUtilizador.getText().equals("") ) {
					ftxtUtilizador.requestFocus();
					txtResultado.setText("Utilizador está em branco");
				}
			}
		});
		ftxtUtilizador.setBounds(179, 125, 316, 31);
		this.add(ftxtUtilizador);
		
		lblPassWord = new JLabel("Palavra-Passe");
		lblPassWord.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPassWord.setBounds(10, 167, 170, 32);
		this.add(lblPassWord);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if ( passwordField.getText().equals("") ) {
					 passwordField.requestFocus();
					 txtResultado.setText("PassWord está em branco");
				}
			}
		} );	
		passwordField.setBounds(179, 167, 316, 32);
		this.add(passwordField);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			txtResultado.setText("clicou no botão Cancelar");
			ftxtUtilizador.setText(null);
			lblPassWord.setText(null);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnCancelar.setBounds(10, 204, 159, 41);
		this.add(btnCancelar);
		
		btnLogin = new JButton("Iniciar Sessão");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			JOptionPane.showMessageDialog(null, "clicou no botão iniciar sessão:" 
					+ ftxtUtilizador.getText() +"\n "+ lblPassWord.getText() ,
					"Clique do Iniciar", JOptionPane.INFORMATION_MESSAGE);
			
			txtResultado.setText("clicou no botão iniciar sessão");
			
			//this.abreFicheiro();
			
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnLogin.setBounds(179, 204, 316, 41);
		this.add(btnLogin);
		
		Dimension tam = new Dimension(850,550);
		moldura = new JFrame("Autenticação");
		//moldura.setLocationRelativeTo(null);
		moldura.setSize(new Dimension(877, 551) );
		//moldura.setLayout( this.getLayout() );
		moldura.getContentPane().add(this);
		
		painel = new JPanel();
		painel.setBounds(10, 256, 841, 245);
		add(painel);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setText(TOOL_TIP_TEXT_KEY);
		GroupLayout gl_Painel = new GroupLayout(painel);
		gl_Painel.setHorizontalGroup(
			gl_Painel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Painel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtResultado, GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_Painel.setVerticalGroup(
			gl_Painel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Painel.createSequentialGroup()
					.addContainerGap(212, Short.MAX_VALUE)
					.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		painel.setLayout(gl_Painel);
		moldura.setVisible(true);
	}
///////////////////////////////////////////////////////////////////////////////////////////		

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}











































