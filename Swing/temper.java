package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class temper {

	private JFrame frame;
	private JTextField value;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temper window = new temper();
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
	public temper() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel ffff = new JLabel("Temperature              :");
		ffff.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ffff.setBounds(55, 37, 167, 34);
		frame.getContentPane().add(ffff);
		
		value = new JTextField();
		value.setBounds(256, 39, 206, 34);
		frame.getContentPane().add(value);
		value.setColumns(10);
		
		JLabel answer = new JLabel("");
		answer.setBounds(256, 152, 206, 34);
		frame.getContentPane().add(answer);
		
		JButton ff = new JButton("F");
		ff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float k = Float.parseFloat(value.getText());
				
							
				float p=(float)((k*1.8)-459.67);
				answer.setText(String.valueOf(p));
		
					
			}
		});
		ff.setBounds(256, 107, 97, 34);
		frame.getContentPane().add(ff);
		
		JButton cc = new JButton("C");
		cc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float k = Float.parseFloat(value.getText());
				float q=k-273;
				answer.setText(String.valueOf(q));
			}
		});
		cc.setBounds(374, 107, 97, 34);
		frame.getContentPane().add(cc);
		
		
	}

}
