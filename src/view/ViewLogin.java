package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewLogin {

	private JFrame frame;
	private JTextField textLogin;
	private JTextField txtSenha;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ViewLogin() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 13));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(31, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textLogin = new JTextField();
		textLogin.setBounds(31, 62, 192, 20);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(31, 93, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(31, 118, 192, 20);
		frame.getContentPane().add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(textLogin.getText(), new String(((JPasswordField) txtSenha).getPassword()))) {
		JOptionPane.showMessageDialog(frame,"Bem vindo ao sistema!");
				} else {
					JOptionPane.showMessageDialog(frame,"Dados inválidos!");		
					
				}
			
			}
		}); 
		btnEntrar.setBounds(88, 165, 79, 23);
		frame.getContentPane().add(btnEntrar);
		frame.setBounds(100, 100, 286, 255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public boolean checkLogin(String login, String senha) {
			return login.equals("usuario") && senha.equals("123");
		}
	
}
