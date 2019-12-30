package Swing;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemEvent;

public class checkbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox window = new checkbox();
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
	public checkbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 364, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblLabel = new JLabel("");
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLabel.setBounds(97, 155, 121, 25);
		frame.getContentPane().add(lblLabel);
		
		
		JCheckBox c = new JCheckBox("c++");
		c.setBounds(97, 45, 97, 23);
		frame.getContentPane().add(c);
		
		JCheckBox j = new JCheckBox("Java");
		j.setBounds(97, 93, 97, 23);
		frame.getContentPane().add(j);
		
		c.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				lblLabel.setText("c++"+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		j.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				lblLabel.setText("java"+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
		
		
		
		

	}
}
