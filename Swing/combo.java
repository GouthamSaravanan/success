package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class combo {

	private JFrame frame;
	private JTextField amount;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combo window = new combo();
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
	public combo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(100, 100, 395, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCurrencyConverter.setBounds(115, 33, 179, 24);
		frame.getContentPane().add(lblCurrencyConverter);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInput.setBounds(66, 80, 84, 24);
		frame.getContentPane().add(lblInput);
		
		JComboBox cb1 = new JComboBox();
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
			}
		});
		cb1.setModel(new DefaultComboBoxModel(new String[] {"----select----", "USD", "GBP", "INR", "JPY", "CAD"}));
		cb1.setBounds(160, 83, 134, 20);
		frame.getContentPane().add(cb1);
		
		JLabel lblEnter = new JLabel("Amount");
		lblEnter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnter.setBounds(66, 131, 61, 14);
		frame.getContentPane().add(lblEnter);
		
		amount = new JTextField();
		amount.setBounds(160, 129, 134, 20);
		frame.getContentPane().add(amount);
		amount.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutput.setBounds(66, 181, 61, 14);
		frame.getContentPane().add(lblOutput);
		
		JComboBox cb2 = new JComboBox();
		
		cb2.setModel(new DefaultComboBoxModel(new String[] {"----select----", "USD", "GBP", "INR", "JPY", "CAD"}));
		cb2.setBounds(160, 179, 134, 20);
		frame.getContentPane().add(cb2);
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
			}
		});
		
		result = new JTextField();
		result.setBounds(160, 226, 134, 20);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConvert.setBounds(66, 271, 89, 23);
		frame.getContentPane().add(btnConvert);
		
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cb1.getSelectedItem().equals("----select----")||cb2.getSelectedItem().equals("----select----"))			
					result.setText("Select Currency");
				
				else if(amount.getText().equals(""))
					result.setText("Enter Amount");
				else
					{
					float val=Float.parseFloat(amount.getText());
					if(cb1.getSelectedItem().equals("USD") )
						{
						if(cb2.getSelectedItem().equals("USD") )
						result.setText(String.valueOf(val));
						else if(cb2.getSelectedItem().equals("GBP") )
						result.setText(String.valueOf(val*0.77));
						else if(cb2.getSelectedItem().equals("INR") )
						result.setText(String.valueOf(val*71.91));
						else if(cb2.getSelectedItem().equals("JPY") )
						result.setText(String.valueOf(val*108.62));
						}	
					else if(cb1.getSelectedItem().equals("GBP") )
						{
						if(cb2.getSelectedItem().equals("GBP") )
							result.setText(String.valueOf(val));
						else if(cb2.getSelectedItem().equals("USD") )
							result.setText(String.valueOf(val*1.29));
						else if(cb2.getSelectedItem().equals("INR") )
							result.setText(String.valueOf(val*92.80));
						else if(cb2.getSelectedItem().equals("JPY") )
							result.setText(String.valueOf(val*140.32));
						}	
					else if(cb1.getSelectedItem().equals("INR") )
					{
						if(cb2.getSelectedItem().equals("GBP") )
							result.setText(String.valueOf(val*0.011));
						else if(cb2.getSelectedItem().equals("USD") )
							result.setText(String.valueOf(val*0.014));
						else if(cb2.getSelectedItem().equals("INR") )
							result.setText(String.valueOf(val));
						else if(cb2.getSelectedItem().equals("JPY") )
							result.setText(String.valueOf(val*1.51));
					}	
					else if(cb1.getSelectedItem().equals("JPY") )
					{
						if(cb2.getSelectedItem().equals("GBP") )
							result.setText(String.valueOf(val*0.0071));
						else if(cb2.getSelectedItem().equals("USD") )
							result.setText(String.valueOf(val*0.0092));
						else if(cb2.getSelectedItem().equals("INR") )
							result.setText(String.valueOf(val*0.66));
						else if(cb2.getSelectedItem().equals("JPY") )
							result.setText(String.valueOf(val));
					}	
				
					}
				
				
			}
		});
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBounds(196, 272, 98, 23);
		frame.getContentPane().add(btnExit);
	}
}
