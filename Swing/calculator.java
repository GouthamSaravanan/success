package Swing;
import java.lang.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class calculator {

	private JFrame frame;
	private JTextField value;
	private String a;
	private String b;
	private String o;
	private Float ans;
	int fs=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 565, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		value = new JTextField();
		
		value.setHorizontalAlignment(SwingConstants.RIGHT);
		value.setFont(new Font("Tahoma", Font.PLAIN, 19));
		value.setEditable(false);
		value.setBounds(10, 27, 529, 42);
		frame.getContentPane().add(value);
		value.setColumns(10);
		
		JButton btnNewButton = new JButton("sqrt");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float a1=Float.parseFloat(value.getText());
				 ans=(float)Math.sqrt(a1);
				 value.setText(String.valueOf(ans));
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 111, 82, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("%");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 a=value.getText();
					value.setText("");
					 o="%";
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(10, 155, 82, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x^y");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=value.getText();
					value.setText("");
					 o="x^y";
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(10, 199, 82, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x^2");
	
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float a1=Float.parseFloat(value.getText());
				 ans=(float)(a1*a1);
				 value.setText(String.valueOf(ans));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(10, 242, 82, 34);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exp");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a1=Float.parseFloat(value.getText());
				ans=(float)Math.exp(a1);
				value.setText(String.valueOf(ans));
			}
		});
		btnNewButton_4.setBounds(102, 155, 76, 33);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("1/x");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float a1=Float.parseFloat(value.getText());
				 ans=(float)(1/a1);
				 value.setText(String.valueOf(ans));
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(102, 111, 76, 32);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("ln");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a1=Float.parseFloat(value.getText());
				ans=(float)Math.log(a1);
				value.setText(String.valueOf(ans));
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_6.setBounds(102, 199, 76, 32);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("n!");
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a1=Float.parseFloat(value.getText());
				int f=1,i;
				 for(i=1;i<=a1;i++)
					 f=f*i;
				 value.setText(String.valueOf(f));
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_7.setBounds(102, 242, 76, 34);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("sin");
		
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a1=Float.parseFloat(value.getText());
				float radian=(float)Math.toRadians(a1);
				ans=(float)Math.sin(radian);
				value.setText(String.valueOf(ans));
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8.setBounds(188, 111, 76, 32);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("cos");
		
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a1=Float.parseFloat(value.getText());
				float radian=(float)Math.toRadians(a1);
				ans=(float)Math.cos(radian);
				value.setText(String.valueOf(ans));
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_9.setBounds(188, 155, 76, 33);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("tan");
		
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float a1=Float.parseFloat(value.getText());
				float radian=(float)Math.toRadians(a1);
				ans=(float)Math.tan(radian);
				value.setText(String.valueOf(ans));
			}
		});
		btnNewButton_10.setBounds(188, 199, 76, 32);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("sec");
	
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			float a1=Float.parseFloat(value.getText());
			float radian=(float)Math.toRadians(a1);
			ans=(float)(1/Math.cos(radian));
			value.setText(String.valueOf(ans));
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_11.setBounds(188, 242, 76, 34);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton b7 = new JButton("7");
	
		b7.setFont(new Font("Tahoma", Font.BOLD, 14));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(285, 111, 59, 33);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b8.getText()));
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 14));
		b8.setBounds(354, 111, 51, 33);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b9.getText()));
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 14));
		b9.setBounds(415, 111, 51, 33);
		frame.getContentPane().add(b9);
		
		JButton btnNewButton_15 = new JButton("/");
		
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=value.getText();
				value.setText("");
				fs=0;
				 o="/";
				
				
				
				
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_15.setBounds(476, 111, 51, 33);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton b4 = new JButton("4");
	
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b4.getText()));
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 14));
		b4.setBounds(285, 155, 59, 33);
		frame.getContentPane().add(b4);
		
		JButton b1 = new JButton("1");
	
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b1.getText()));
			
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.setBounds(284, 199, 59, 32);
		frame.getContentPane().add(b1);
		
		JButton b5 = new JButton("5");
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b5.getText()));
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 14));
		b5.setBounds(354, 155, 51, 33);
		frame.getContentPane().add(b5);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value.setText(value.getText().concat(b0.getText()));
				
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 14));
		b0.setBounds(285, 242, 59, 34);
		frame.getContentPane().add(b0);
		
		JButton b2 = new JButton("2");
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value.setText(value.getText().concat(b2.getText()));
				
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.setBounds(353, 199, 52, 33);
		frame.getContentPane().add(b2);
		
		JButton b10 = new JButton(".");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fs==0)
				{
				value.setText(value.getText().concat(b10.getText()));
				fs=1;
				}
			}
		});
		b10.setFont(new Font("Tahoma", Font.BOLD, 14));
		b10.setBounds(354, 242, 51, 34);
		frame.getContentPane().add(b10);
		
		JButton b6 = new JButton("6");
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value.setText(value.getText().concat(b6.getText()));
				
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 14));
		b6.setBounds(415, 155, 51, 33);
		frame.getContentPane().add(b6);
		
		JButton b3 = new JButton("3");
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b3.getText()));
			}
			
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		b3.setBounds(415, 199, 51, 32);
		frame.getContentPane().add(b3);
		
		JButton btnNewButton_24 = new JButton("=");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 b=value.getText();
				 float a1=Float.parseFloat(a);
					float b1=Float.parseFloat(b);
					switch(o)
					{
					case "*":
						ans=a1*b1;
						value.setText(String.valueOf(ans));
						
						break;
					case "/":
						ans=a1/b1;
						value.setText(String.valueOf(ans));
						break;
					case "+":
						ans=a1+b1;
						value.setText(String.valueOf(ans));
						break;
					case "-":
						ans=a1-b1;
						value.setText(String.valueOf(ans));
						break;
					case "%":
						ans=(a1*b1)/100;
						value.setText(String.valueOf(ans));
						break;
					case "x^y":
						ans=(float)Math.pow(a1,b1);
						value.setText(String.valueOf(ans));
						break;
					
					

						
					}
				 
			}
		});
		btnNewButton_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_24.setBounds(415, 242, 51, 34);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("*");
		
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=value.getText();
					value.setText("");
					fs=0;
					 o="*";
				
			}
		});
		btnNewButton_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_25.setBounds(476, 155, 51, 33);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("-");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=value.getText();
					value.setText("");
					fs=0;
					 o="-";
			}
		});
		btnNewButton_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_26.setBounds(476, 199, 51, 32);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("+");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=value.getText();
					value.setText("");
					 o="+";
					 fs=0;
			}
		});
		btnNewButton_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_27.setBounds(476, 242, 51, 34);
		frame.getContentPane().add(btnNewButton_27);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setForeground(Color.WHITE);
		lblScientific.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblScientific.setBounds(10, 89, 64, 14);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setForeground(Color.WHITE);
		lblStandard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStandard.setBounds(285, 89, 82, 14);
		frame.getContentPane().add(lblStandard);
		
		JButton btnClear = new JButton("Clear");
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(" ");
			}
		});
		btnClear.setBounds(415, 77, 112, 23);
		frame.getContentPane().add(btnClear);
		
	
}
}
