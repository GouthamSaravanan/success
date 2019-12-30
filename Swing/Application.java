package Swing;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Application {

	private JFrame frame;
	private JTextField usename;
	private JTextField pswd;
	private JLabel label;
	private JLabel label1;
	private JTextField user;
	private JPasswordField psw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 562, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(66, 70, 85, 34);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(66, 126, 85, 34);
		frame.getContentPane().add(lblPassword);
		
	
		
		label = new JLabel("");
		label.setForeground(Color.RED);
		label.setBounds(90, 245, 142, 24);
		frame.getContentPane().add(label);
		
		label1 = new JLabel("");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label1.setForeground(Color.GREEN);
		label1.setBounds(173, 245, 143, 24);
		frame.getContentPane().add(label1);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String use=user.getText();
				String pass=psw.getText();
				if(use.equals("Albin7175")&& pass.contentEquals("AlpAlp"))
				{
					label.setVisible(false);
					label1.setText("Valid credential");
					label1.setVisible(true);

				}
				else
				{	label1.setVisible(false);
					label.setText("Inalid credential");
					label.setVisible(true);
				}
			}
		});
		login.setForeground(Color.BLACK);
		login.setBackground(Color.WHITE);
		login.setBounds(174, 192, 102, 34);
		frame.getContentPane().add(login);
		
		user = new JTextField();
		user.setBounds(190, 70, 198, 34);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		psw = new JPasswordField();
		psw.setBounds(190, 126, 198, 34);
		frame.getContentPane().add(psw);
		
		
		
		
		
		
		
	}
}
