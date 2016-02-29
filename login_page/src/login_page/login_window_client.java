package login_page;

import java.awt.Color;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class login_window_client extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	public login_window_client() throws UnknownHostException, IOException {
		@SuppressWarnings("resource")
		Socket socket = new Socket("127.0.0.1",7777);
		PrintStream printstream = new PrintStream(socket.getOutputStream());
		@SuppressWarnings("resource")
		Scanner sc_serv = new Scanner(socket.getInputStream());
		getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(72, 80, 81, 30);
		getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(163, 85, 135, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(72, 134, 70, 14);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(163, 131, 135, 20);
		getContentPane().add(passwordField);
		String usr= textField.getText();
		String passwd = passwordField.getPassword().toString();
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent on_click) {
			printstream.println(usr);
			printstream.println(passwd);
			}
		});
		btnLogin.setBounds(173, 187, 89, 23);
		getContentPane().add(btnLogin);
		
		JTextPane txtpn = new JTextPane();
		txtpn.setEnabled(false);
		txtpn.setEditable(false);
		txtpn.setForeground(Color.RED);
		txtpn.setBackground(new Color(248, 248, 248));
		txtpn.setDropMode(DropMode.INSERT);
		txtpn.setBounds(208, 105, 209, 17);
		txtpn.setBorder(null);
		getContentPane().add(txtpn);
		
		String temp = sc_serv.nextLine();
		txtpn.setText(temp);
	}

	public static void main(String[] args) {
		try {
			
			login_window_client obj1 = new login_window_client();
			obj1.setVisible(true);
			
			
			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
}
