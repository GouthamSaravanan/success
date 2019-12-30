package Swing;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class hotel {
float ss;
float stax;
float pp;
float z;
	private JFrame frame;
	private String a;
	private String b;
	private String o;
	private Float ans;
	private JTextField c1;
	private JTextField c2;
	private JTextField c3;
	private JTextField convert;
	private JTextField cost1;
	private JTextField cost2;
	private JTextField cost3;
	private JTextField tax;
	private JTextField subtotal;
	private JTextField total;
	private JTextField value;
	int fs=0;
	float a1,a2,a3,a4,a5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotel window = new hotel();
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
	public hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 935, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotelManagement = new JLabel("Hotel Management System ");
		lblHotelManagement.setBackground(new Color(25, 25, 112));
		lblHotelManagement.setForeground(new Color(255, 255, 255));
		Border blackline = BorderFactory.createLineBorder(Color.white);
		lblHotelManagement.setBorder(blackline);
		lblHotelManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelManagement.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		lblHotelManagement.setBounds(288, 26, 379, 55);
		frame.getContentPane().add(lblHotelManagement);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 121, 349, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChickenBurger.setBounds(10, 23, 139, 22);
		panel.add(lblChickenBurger);
		
		c1 = new JTextField();
		c1.setBounds(168, 23, 171, 22);
		panel.add(c1);
		c1.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChickenBurgerMeal.setBounds(10, 56, 139, 22);
		panel.add(lblChickenBurgerMeal);
		
		c2 = new JTextField();
		c2.setBounds(168, 58, 171, 22);
		panel.add(c2);
		c2.setColumns(10);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCheeseBurger.setBounds(10, 89, 139, 22);
		panel.add(lblCheeseBurger);
		
		c3 = new JTextField();
		c3.setBounds(168, 91, 171, 22);
		panel.add(c3);
		c3.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 131, 329, 2);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDrink.setBounds(10, 151, 64, 22);
		panel.add(lblDrink);
		
		JComboBox drink = new JComboBox();
		drink.setModel(new DefaultComboBoxModel(new String[] {"JD", "magic"}));
		drink.setBounds(60, 153, 104, 20);
		panel.add(drink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblQty.setBounds(185, 155, 46, 18);
		panel.add(lblQty);
		
		JComboBox d1 = new JComboBox();
		d1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		d1.setBounds(229, 153, 110, 20);
		panel.add(d1);
		
		JRadioButton rhome = new JRadioButton("Home Delivery");
		rhome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rhome.setBackground(new Color(192, 192, 192));
		rhome.setBounds(10, 186, 121, 23);
		panel.add(rhome);
		
		JRadioButton rtax = new JRadioButton("Tax");
		rtax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rtax.setBackground(new Color(192, 192, 192));
		rtax.setBounds(217, 186, 121, 23);
		panel.add(rtax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(369, 121, 242, 227);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(new Color(25, 25, 112));
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurrencyConverter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrencyConverter.setBounds(27, 23, 181, 27);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox combo = new JComboBox();
		combo.setModel(new DefaultComboBoxModel(new String[] {"----select----", "INR", "GBP", "JPY"}));
		combo.setBounds(27, 69, 181, 27);
		panel_1.add(combo);
		
		convert = new JTextField();
		convert.setBounds(27, 110, 181, 27);
		panel_1.add(convert);
		convert.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		
		btnConvert.setForeground(new Color(255, 255, 255));
		btnConvert.setBackground(new Color(25, 25, 112));
		btnConvert.setBounds(27, 165, 89, 23);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBackground(new Color(25, 25, 112));
		btnClose.setForeground(new Color(255, 255, 255));
		btnClose.setBounds(119, 165, 89, 23);
		panel_1.add(btnClose);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(10, 359, 349, 110);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCostOfDrinking = new JLabel("Cost of Drinking");
		lblCostOfDrinking.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCostOfDrinking.setBounds(10, 11, 107, 21);
		panel_3.add(lblCostOfDrinking);
		
		cost1 = new JTextField();
		cost1.setBounds(162, 12, 177, 20);
		panel_3.add(cost1);
		cost1.setColumns(10);
		
		JLabel lblCostOfMetal = new JLabel("Cost of Meal");
		lblCostOfMetal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCostOfMetal.setBounds(10, 42, 107, 21);
		panel_3.add(lblCostOfMetal);
		
		cost2 = new JTextField();
		cost2.setBounds(162, 43, 177, 21);
		panel_3.add(cost2);
		cost2.setColumns(10);
		
		JLabel lblCostlOyfDeliver = new JLabel("Cost of Deliver");
		lblCostlOyfDeliver.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCostlOyfDeliver.setBounds(10, 74, 107, 14);
		panel_3.add(lblCostlOyfDeliver);
		
		cost3 = new JTextField();
		cost3.setBounds(162, 72, 177, 20);
		panel_3.add(cost3);
		cost3.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setBounds(369, 359, 242, 110);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTax.setBounds(10, 11, 71, 21);
		panel_4.add(lblTax);
		
		tax = new JTextField();
		tax.setBounds(96, 12, 136, 20);
		panel_4.add(tax);
		tax.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sub Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 43, 71, 14);
		panel_4.add(lblNewLabel);
		
		subtotal = new JTextField();
		subtotal.setBounds(95, 41, 137, 20);
		panel_4.add(subtotal);
		subtotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotal.setBounds(10, 73, 71, 14);
		panel_4.add(lblTotal);
		
		total = new JTextField();
		total.setBounds(96, 72, 136, 20);
		panel_4.add(total);
		total.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setBounds(10, 480, 899, 55);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(25, 25, 112));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(132, 11, 108, 33);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Receipt");
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(25, 25, 112));
		btnNewButton_1.setBounds(278, 11, 108, 33);
		panel_5.add(btnNewButton_1);
		
		JButton btnReset = new JButton("Reset");
		
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(25, 25, 112));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnReset.setBounds(426, 11, 108, 33);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(25, 25, 112));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExit.setBounds(580, 11, 108, 33);
		panel_5.add(btnExit);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(621, 121, 288, 348);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_2, null);
		panel_2.setLayout(null);
		
		value = new JTextField();
		value.setFont(new Font("Tahoma", Font.BOLD, 14));
		value.setHorizontalAlignment(SwingConstants.RIGHT);
		value.setBounds(10, 11, 263, 44);
		panel_2.add(value);
		value.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("B");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(10, 74, 61, 36);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(" ");
				
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(25, 25, 112));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(79, 74, 61, 36);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("%");
		btnNewButton_4.setBackground(new Color(25, 25, 112));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(150, 74, 55, 36);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("+");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=value.getText();
				value.setText("");
				fs=0;
				 o="+";
			}
			
		});
		btnNewButton_5.setBackground(new Color(25, 25, 112));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBounds(218, 74, 55, 36);
		panel_2.add(btnNewButton_5);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b7.getText()));
			}
		});
		b7.setBackground(new Color(25, 25, 112));
		b7.setForeground(new Color(255, 255, 255));
		b7.setFont(new Font("Tahoma", Font.BOLD, 13));
		b7.setBounds(10, 121, 61, 36);
		panel_2.add(b7);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b4.getText()));
			}
		});
		b4.setForeground(new Color(255, 255, 255));
		b4.setBackground(new Color(25, 25, 112));
		b4.setFont(new Font("Tahoma", Font.BOLD, 13));
		b4.setBounds(10, 168, 61, 36);
		panel_2.add(b4);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b1.getText()));
			}
		});
		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(25, 25, 112));
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBounds(10, 215, 61, 36);
		panel_2.add(b1);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b0.getText()));
			}
		});
		b0.setBackground(new Color(25, 25, 112));
		b0.setForeground(new Color(255, 255, 255));
		b0.setFont(new Font("Tahoma", Font.BOLD, 13));
		b0.setBounds(10, 261, 61, 36);
		panel_2.add(b0);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b8.getText()));
			}
		});
		b8.setBackground(new Color(0, 0, 128));
		b8.setForeground(new Color(255, 255, 255));
		b8.setFont(new Font("Tahoma", Font.BOLD, 13));
		b8.setBounds(79, 121, 61, 36);
		panel_2.add(b8);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b5.getText()));
			}
		});
		b5.setForeground(new Color(255, 255, 255));
		b5.setBackground(new Color(25, 25, 112));
		b5.setFont(new Font("Tahoma", Font.BOLD, 13));
		b5.setBounds(79, 168, 61, 36);
		panel_2.add(b5);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b2.getText()));
			}
		});
		b2.setBackground(new Color(25, 25, 112));
		b2.setForeground(new Color(255, 255, 255));
		b2.setFont(new Font("Tahoma", Font.BOLD, 13));
		b2.setBounds(79, 215, 61, 36);
		panel_2.add(b2);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fs==0)
				{
				value.setText(value.getText().concat(btnNewButton_13.getText()));
				fs=1;
				}
			
			}
		});
		btnNewButton_13.setBackground(new Color(25, 25, 112));
		btnNewButton_13.setForeground(new Color(255, 255, 255));
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_13.setBounds(79, 261, 61, 36);
		panel_2.add(btnNewButton_13);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b9.getText()));
			}
		});
		b9.setBackground(new Color(25, 25, 112));
		b9.setForeground(new Color(255, 255, 255));
		b9.setFont(new Font("Tahoma", Font.BOLD, 13));
		b9.setBounds(150, 121, 55, 36);
		panel_2.add(b9);
		
		JButton b6 = new JButton("6");
		b6.setBackground(new Color(25, 25, 112));
		b6.setForeground(new Color(255, 255, 255));
		b6.setFont(new Font("Tahoma", Font.BOLD, 13));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(150, 168, 55, 36);
		panel_2.add(b6);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b3.getText()));
			}
		});
		b3.setBackground(new Color(25, 25, 112));
		b3.setForeground(new Color(255, 255, 255));
		b3.setFont(new Font("Tahoma", Font.BOLD, 13));
		b3.setBounds(150, 215, 55, 36);
		panel_2.add(b3);
		
		JButton b00 = new JButton("00");
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value.setText(value.getText().concat(b00.getText()));
			}
		});
		b00.setBackground(new Color(25, 25, 112));
		b00.setForeground(new Color(255, 255, 255));
		b00.setFont(new Font("Tahoma", Font.BOLD, 13));
		b00.setBounds(150, 261, 55, 36);
		panel_2.add(b00);
		
		JButton btnNewButton_18 = new JButton("-");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=value.getText();
				value.setText("");
				fs=0;
				 o="-";;
			}
		});
		btnNewButton_18.setForeground(new Color(255, 255, 255));
		btnNewButton_18.setBackground(new Color(25, 25, 112));
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_18.setBounds(218, 121, 55, 36);
		panel_2.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("*");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=value.getText();
				value.setText("");
				fs=0;
				 o="*";
			}
			
		});
		btnNewButton_19.setForeground(new Color(255, 255, 255));
		btnNewButton_19.setBackground(new Color(25, 25, 112));
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_19.setBounds(218, 168, 55, 36);
		panel_2.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("/");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=value.getText();
				value.setText("");
				fs=0;
				 o="/";
			}
		});
		btnNewButton_20.setBackground(new Color(25, 25, 112));
		btnNewButton_20.setForeground(new Color(255, 255, 255));
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_20.setBounds(218, 215, 55, 36);
		panel_2.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("=");
		btnNewButton_21.addActionListener(new ActionListener() {
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1=Float.parseFloat(c1.getText())*1f;
				a2=Float.parseFloat(c2.getText())*2f;
				a3=Float.parseFloat(c3.getText())*3f;
				pp=Float.parseFloat((String)d1.getSelectedItem());
				String drinks=(String)drink.getSelectedItem();
				if(drinks.equals("JD")) 
				{z=1;
				 a4=pp*Float.parseFloat( (String)d1.getSelectedItem())*1f;
				}
				if(drinks.contentEquals("Magic"))
				{
					z=2;
					a4=pp*Float.parseFloat((String) d1.getSelectedItem())*2f;
				}
				float a6=a1+a2+a3+a4;
				if(rhome.isSelected())
				cost3.setText("1.5");	
				else
				cost3.setText("0.0");
				cost2.setText(String.valueOf(a1+a2+a3));
				cost1.setText(String.valueOf(a4));
				 ss=Float.parseFloat(cost3.getText())+Float.parseFloat(cost1.getText())+Float.parseFloat(cost2.getText());
				subtotal.setText(String.valueOf(ss));
				 stax=(ss*20)/100;
				tax.setText(String.valueOf(stax));
				total.setText(String.valueOf(stax+ss));
				
			}
		});
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(combo.getSelectedItem().equals("----select----"))			
					convert.setText("Select Currency");
					if(combo.getSelectedItem().equals("GBP") )
						convert.setText(String.valueOf((ss+stax)*0.011));
					else if(combo.getSelectedItem().equals("INR") )
						convert.setText(String.valueOf((ss+stax)*71));
					else if(combo.getSelectedItem().equals("JPY") )
						convert.setText(String.valueOf((ss+stax)*1.51));	
			}
		});
		
		btnNewButton_21.setForeground(new Color(255, 255, 255));
		btnNewButton_21.setBackground(new Color(25, 25, 112));
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_21.setBounds(218, 261, 55, 36);
		panel_2.add(btnNewButton_21);
		tabbedPane.setBackgroundAt(0, new Color(192, 192, 192));
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 263, 298);
		panel_6.add(textArea);
		tabbedPane.setBackgroundAt(1, new Color(192, 192, 192));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp=null;
				for(java.awt.Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
					temp=(JTextField)c;
					temp.setText(null);
				}}
				for(java.awt.Component c:panel_1.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
					temp=(JTextField)c;
					temp.setText(null);
				}}
				for(java.awt.Component c:panel_3.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
					temp=(JTextField)c;
					temp.setText(null);
				}}
				for(java.awt.Component c:panel_4.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
					temp=(JTextField)c;
					temp.setText(null);
				}}
				textArea.setText("");
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.append("Order Record\n"
								+"Order Item                     Quantity        Unit price\n"
								+"--------------------------------------------------------------\n\n"
								+"Chicken Burger:              "+c1.getText()+"                      1 \n"
								+"Chicken Burger Meal:     "+c2.getText()+"                      2 \n"
								+"Cheese Burger:               "+c3.getText()+"                      1 \n"
								+"--------------------------------------------------------------\n\n"
								+"Drinks:"+drink.getSelectedItem()+"                           "+d1.getSelectedItem()+"                  "+z+"\n"
								+"--------------------------------------------------------------\n\n"
								+"Sub Total:                                               "+(ss)+"\n"
								+"Tax:                                                         "+(stax)+"\n"
								+"Total:                                                       "+(stax+ss)+"\n"
						);
			}
		});
	}
}
