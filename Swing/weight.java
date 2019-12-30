package Swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class weight {

	private JFrame frame;
	private JTextField textField;
	private JTextField w;
	private JTextField h;
	private JTable table_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weight window = new weight();
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
	public weight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 357, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 347, 63);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Body Mass Index");
		lblNewLabel.setFont(new Font("Aharoni", Font.PLAIN, 20));
		lblNewLabel.setBounds(85, 11, 171, 33);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(0, 68, 347, 207);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m)         :");
		lblHeightm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHeightm.setBounds(26, 21, 111, 27);
		panel_1.add(lblHeightm);
		
		
		
		JLabel lblWeightkg = new JLabel("Weight(kg)       :");
		lblWeightkg.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWeightkg.setBounds(26, 74, 111, 27);
		panel_1.add(lblWeightkg);
		
		w = new JTextField();
		w.setBounds(152, 70, 167, 31);
		panel_1.add(w);
		w.setColumns(10);
		
		h = new JTextField();
		h.setBounds(152, 21, 167, 30);
		panel_1.add(h);
		h.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBmi.setBounds(26, 122, 31, 18);
		panel_1.add(lblBmi);
		
		JLabel value = new JLabel("");
		value.setBackground(new Color(218, 165, 32));
		value.setBounds(70, 123, 67, 18);
		panel_1.add(value);
		
		JLabel prin = new JLabel("");
		prin.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		prin.setBounds(152, 120, 167, 23);
		panel_1.add(prin);
		
		JButton cal = new JButton("Calculate");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float he=Float.parseFloat(h.getText());
				float we=Float.parseFloat(w.getText());
				float index=(float)(we/(he*he));
				if(index<18.5)
				{
					value.setText(String.valueOf(index));
					prin.setText(String.valueOf("Underweight"));
					prin.setForeground(Color.yellow);
				}
				else if(index<24.0 &&index>=18.5)
				{
					value.setText(String.valueOf(index));
					prin.setText(String.valueOf("Normal Weight"));
					prin.setForeground(Color.green);
				}
				else if(index<=29.9 &&index>=25)
				{
					value.setText(String.valueOf(index));
					prin.setText(String.valueOf("Over Weight"));
					prin.setForeground(Color.orange);
				}
				else
				{
					value.setText(String.valueOf(index));
					prin.setText(String.valueOf("obese"));
					prin.setForeground(Color.red);
				}
				
			}
		});
		cal.setBounds(26, 161, 89, 23);
		panel_1.add(cal);
		
		JButton cl = new JButton("Clear");
		cl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h.setText(" ");
				w.setText(" ");
				
			}
		});
		cl.setBounds(125, 161, 89, 23);
		panel_1.add(cl);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(230, 161, 89, 23);
		panel_1.add(btnExit);
		
		table_1 = new JTable();
		table_1.setBounds(152, 337, 1, 1);
		frame.getContentPane().add(table_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(154, 205, 50));
		panel_2.setBounds(0, 280, 347, 110);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"UnderWeight", "Normal Weight", "Under Weight", "Obese"},
				{"<18.5", "18.5 to 24.9", "25 to 29.9", ">29.9"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(37, 29, 267, 32);
		panel_2.add(table);
	}
}
