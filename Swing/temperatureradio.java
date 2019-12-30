package Swing;


import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import java.awt.Color;
public class temperatureradio {
	private JFrame frame;
	private JTextField tf;
	public String in,out;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temperatureradio window = new temperatureradio();
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
	public temperatureradio() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInput.setBounds(119, 22, 88, 24);
		frame.getContentPane().add(lblInput);
		tf = new JTextField();
		tf.setBounds(195, 24, 86, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		JLabel lblInputScale = new JLabel("Input Scale");
		lblInputScale.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInputScale.setBounds(27, 66, 104, 24);
		frame.getContentPane().add(lblInputScale);
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutputScale.setBounds(283, 69, 120, 18);
		frame.getContentPane().add(lblOutputScale);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(216, 218, 104, 19);
		frame.getContentPane().add(lblNewLabel);
		JRadioButton rdbtnCelcius = new JRadioButton("Celcius");
		rdbtnCelcius.setBounds(27, 114, 120, 24);
		frame.getContentPane().add(rdbtnCelcius);
		rdbtnCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in="cel";
				if((in.equals("cel"))&&(out.equals("cel")))
				{
					lblNewLabel.setText(tf.getText());
				}
				if((in.equals("cel"))&&(out.equals("fah")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)((x*9)/5)+32;
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
				if((in.equals("cel"))&&(out.equals("kel")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)(x+273.15);
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
			}
		});
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setBounds(27, 189, 120, 24);
		frame.getContentPane().add(rdbtnKelvin);
		rdbtnKelvin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in="kel";
				if((in.equals("kel"))&&(out.equals("kel")))
				{
					lblNewLabel.setText(tf.getText());
				}
				if((in.equals("kel"))&&(out.equals("cel")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)(x-273.15);
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
				if((in.equals("kel"))&&(out.equals("fah")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)(((x-273.15)*9)/5)+32;
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
			}
		});
		JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit.setBounds(27, 152, 120, 24);
		frame.getContentPane().add(rdbtnFahrenheit);
		rdbtnFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in="fah";
				if((in.equals("fah"))&&(out.equals("fah")))
				{
					lblNewLabel.setText(tf.getText());
				}
				if((in.equals("fah"))&&(out.equals("cel")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)((x-32)*5)/9;
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
				if((in.equals("fah"))&&(out.equals("kel")))
				{
				float x=Float.parseFloat(tf.getText());
				double a=(((x-32)*5)/9)+273.15;
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
			}
		});
	    ButtonGroup G1=new ButtonGroup();
		G1.add(rdbtnCelcius);
		G1.add(rdbtnKelvin);
		G1.add(rdbtnFahrenheit);
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutput.setBounds(119, 214, 101, 24);
		frame.getContentPane().add(lblOutput);
		JRadioButton rdbtnCelcius_1 = new JRadioButton("Celcius");
		rdbtnCelcius_1.setBounds(283, 115, 109, 23);
		frame.getContentPane().add(rdbtnCelcius_1);
		rdbtnCelcius_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				out="cel";
				if((in.equals("cel"))&&(out.equals("cel")))
				{
					lblNewLabel.setText(tf.getText());
				}
				if((in.equals("kel"))&&(out.equals("cel")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)(x-273.15);
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
				if((in.equals("fah"))&&(out.equals("cel")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)((x-32)*5)/9;
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
			}
		});
		JRadioButton rdbtnFahrenheit_1 = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit_1.setBounds(283, 153, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit_1);
		rdbtnFahrenheit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				out="fah";
				if((in.equals("fah"))&&(out.equals("fah")))
				{
					lblNewLabel.setText(tf.getText());
				}
				if((in.equals("kel"))&&(out.equals("fah")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)(((x-273.15)*9)/5)+32;
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
				if((in.equals("cel"))&&(out.equals("fah")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)((x*9)/5)+32;
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
			}
		});
		JRadioButton rdbtnKelvin_1 = new JRadioButton("Kelvin");
		rdbtnKelvin_1.setBounds(283, 188, 109, 23);
		frame.getContentPane().add(rdbtnKelvin_1);
		rdbtnKelvin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				out="kel";
				if((in.equals("kel"))&&(out.equals("kel")))
				{
					lblNewLabel.setText(tf.getText());
				}
				if((in.equals("cel"))&&(out.equals("kel")))
				{
				float x=Float.parseFloat(tf.getText());
				float a=(float)(x+273.15);
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
				if((in.equals("fah"))&&(out.equals("kel")))
				{
				float x=Float.parseFloat(tf.getText());
				double a=(((x-32)*5)/9)+273.15;
				String res=String.valueOf(a);
				lblNewLabel.setText(res);
				}
			}
		});
		ButtonGroup G2=new ButtonGroup();
		G2.add(rdbtnCelcius_1);
		G2.add(rdbtnKelvin_1);
		G2.add(rdbtnFahrenheit_1);
	}
}