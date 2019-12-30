package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class studentreport {

	private JFrame frame;
	private JTextField sid;
	private JTextField fname;
	private JTextField sname;
	private JTextField m1;
	private JTextField m2;
	private JTextField m3;
	private JTextField m4;
	private JTextField m5;
	private JTextField m6;
	private JTextField m7;
	private JTextField m8;
	private JTextField total;
	private JTextField avg;
	private JTextField rank;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentreport window = new studentreport();
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
	public studentreport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(100, 100, 883, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 392, 287);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setBounds(10, 30, 60, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(10, 61, 60, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblSurName = new JLabel("Sur Name");
		lblSurName.setBounds(10, 86, 60, 14);
		panel.add(lblSurName);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setBounds(10, 111, 70, 14);
		panel.add(lblCourseCode);
		
		sid = new JTextField();
		sid.setBounds(80, 27, 101, 20);
		panel.add(sid);
		sid.setColumns(10);
		
		fname = new JTextField();
		fname.setBounds(80, 55, 101, 20);
		panel.add(fname);
		fname.setColumns(10);
		
		sname = new JTextField();
		sname.setBounds(80, 83, 101, 20);
		panel.add(sname);
		sname.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose One....", "111032A", "111032B", "111032C", "111032D", "111032E", "111032F"}));
		comboBox.setBounds(80, 108, 101, 20);
		panel.add(comboBox);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(199, 30, 60, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setBounds(199, 61, 46, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setBounds(199, 86, 46, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setBounds(199, 121, 60, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setBounds(199, 152, 60, 14);
		panel.add(lblChemistry);
		
  		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setBounds(199, 180, 60, 14);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(199, 212, 60, 14);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setBounds(199, 237, 70, 14);
		panel.add(lblMalayalam);
		
		m1 = new JTextField();
		m1.setBounds(269, 27, 113, 20);
		panel.add(m1);
		m1.setColumns(10);
		
		m2 = new JTextField();
		m2.setBounds(269, 58, 113, 20);
		panel.add(m2);
		m2.setColumns(10);
		
		m3 = new JTextField();
		m3.setBounds(269, 87, 113, 20);
		panel.add(m3);
		m3.setColumns(10);
		
		m4 = new JTextField();
		m4.setBounds(269, 118, 113, 20);
		panel.add(m4);
		m4.setColumns(10);
		
		m5 = new JTextField();
		m5.setBounds(269, 149, 113, 20);
		panel.add(m5);
		m5.setColumns(10);
		
		m7 = new JTextField();
		m7.setBounds(269, 208, 113, 20);
		panel.add(m7);
		m7.setColumns(10);
		
		m6 = new JTextField();
		m6.setBounds(269, 177, 113, 20);
		panel.add(m6);
		m6.setColumns(10);
		
		m8 = new JTextField();
		m8.setBounds(269, 234, 113, 20);
		panel.add(m8);
		m8.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 152, 171, 2);
		panel.add(separator);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setBounds(10, 174, 60, 14);
		panel.add(lblTotalScore);
		
		total = new JTextField();
		total.setBounds(80, 174, 101, 20);
		panel.add(total);
		total.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(10, 206, 60, 14);
		panel.add(lblAverage);
		
		avg = new JTextField();
		avg.setBounds(80, 203, 101, 20);
		panel.add(avg);
		avg.setColumns(10);
		
		JLabel lblRank = new JLabel("Ranking");
		lblRank.setBounds(10, 237, 46, 14);
		panel.add(lblRank);
		
		rank = new JTextField();
		rank.setFont(new Font("Tahoma", Font.BOLD, 11));
		rank.setBounds(80, 234, 101, 20);
		panel.add(rank);
		rank.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(412, 11, 319, 287);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 28, 299, 248);
		panel_1.add(textArea);
		
		JButton add = new JButton("Add Report");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rank.setBackground(Color.white);
				rank.setForeground(Color.black);
				double[] R=new double[15];
				R[0]=Double.parseDouble(m1.getText());
				R[1]=Double.parseDouble(m2.getText());
				R[2]=Double.parseDouble(m3.getText());
				R[3]=Double.parseDouble(m4.getText());
				R[4]=Double.parseDouble(m5.getText());
				R[5]=Double.parseDouble(m6.getText());
				R[6]=Double.parseDouble(m7.getText());
				R[7]=Double.parseDouble(m8.getText());

				R[8]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7])/8;
				R[9]=R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7];
				total.setText(String.valueOf(R[9]));
				avg.setText(String.valueOf(R[8]));
				 if(R[9]>=700)
				    rank.setText("1");
				   else if(R[9]>=600)
				    rank.setText("2");
				   else if(R[9]>=500)
				    rank.setText("3");
				   else if(R[9]>=400)
				    rank.setText("4");
				   else if(R[9]>=300)
				    rank.setText("5");
				   else
				   {
				 rank.setText("Fail");
				 rank.setBackground(Color.red);
				 rank.setForeground(Color.white);
				   }
				 
				 
				 DefaultTableModel model=(DefaultTableModel) table.getModel();
					model.addRow(new String[] {sid.getText(),
												(String)comboBox.getSelectedItem(),
												m1.getText(),
												m2.getText(),
												m3.getText(),
												m4.getText(),
												m5.getText(),
												m6.getText(),
												m7.getText(),
												m8.getText(),
												total.getText(),
												avg.getText(),
												rank.getText(),
							
					});
			}  
		});
		add.setBounds(119, 434, 89, 23);
		frame.getContentPane().add(add);
		
		JButton delete = new JButton("Delete");
		
		
		delete.setBounds(218, 434, 89, 23);
		frame.getContentPane().add(delete);
		
		JButton report = new JButton("Show Report");
		report.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
						+ "Student Name :\t\t"+fname.getText()+" "+sname.getText()+"\n"
						+ "======================================\n"
						+ "Math:\t\t" + m1.getText()
						+ "\nEnglish:\t\t" + m2.getText()
						+ "\nBiology:\t\t" + m3.getText()
						+ "\nComputer:\t\t" + m4.getText()
						+ "\nChemistry:\t\t" + m5.getText()
						+ "\nPysics:\t\t" + m6.getText()
						+ "\nTamil:\t\t" + m7.getText()
						+ "\nMalayalam:\t\t" + m8.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + total.getText()
						+ "\nAverage:\t\t" + avg.getText()
						+ "\nRanking:\t\t" + rank.getText() + "\n"
						);
				
			}
		});
		report.setBounds(313, 434, 95, 23);
		frame.getContentPane().add(report);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(415, 434, 89, 23);
		frame.getContentPane().add(exit);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp=null;
				for(java.awt.Component c:panel.getComponents()) {
				if(c.getClass().toString().contains("javax.swing.JTextField")) {
				temp=(JTextField)c;
				temp.setText(null);
				}
			}
		
			}});
		reset.setBounds(512, 434, 89, 23);
		frame.getContentPane().add(reset);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student-Id", "Course Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"Student ID", "Course Name", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 334, 739, 89);
		frame.getContentPane().add(table);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
			
		});
		btnClear.setBounds(610, 434, 89, 23);
		frame.getContentPane().add(btnClear);
		
		
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1)
				{
				if(table.getRowCount()==0)
				{
				JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
				JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
				model.removeRow(table.getSelectedRow());
				}

				}
				});
	}
}
