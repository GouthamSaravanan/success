package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Font;
import java.util.Random;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class ticket {

	private JFrame frame;
	private JTextField name;
	private JTextField ptax;
	private JTextField psubtotal;
	private JTextField ptotal;
	private JTextField pname;
	private JTextField pfrom;
	private JTextField pticket;
	private JTextField pto;
	private JTextField pdate;
	private JTextField ptime;
	private JTextField pprice;
	private JTextField proute;
	private JTable table;
	
	String t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
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
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(25, 25, 112));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 926, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setForeground(Color.WHITE);
		lblTicketBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 22));
		Border blackline = BorderFactory.createLineBorder(Color.white);
		lblTicketBooking.setBounds(297, 34, 273, 40);
		frame.getContentPane().add(lblTicketBooking);
		lblTicketBooking.setBorder(blackline);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new LineBorder(Color.WHITE));
		panel.setForeground(Color.GRAY);
		panel.setBounds(10, 101, 425, 372);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(10, 11, 46, 31);
		panel.add(lblName);
		
		name = new JTextField();
		name.setBounds(87, 11, 281, 31);
		panel.add(name);
		name.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(10, 53, 405, 2);
		panel.add(separator);
		
		JRadioButton standard = new JRadioButton("Standard");
		standard.setBackground(new Color(192, 192, 192));
		standard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		standard.setBounds(294, 99, 93, 23);
		panel.add(standard);
		
		JRadioButton adult = new JRadioButton("Adult");
		adult.setBackground(new Color(192, 192, 192));
		adult.setFont(new Font("Tahoma", Font.PLAIN, 13));
		adult.setBounds(10, 70, 109, 23);
		panel.add(adult);
		
		ButtonGroup G1=new ButtonGroup();
		
		G1.add(adult);
	
		
		
		JRadioButton firstclass = new JRadioButton("First Class");
		firstclass.setBackground(new Color(192, 192, 192));
		firstclass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		firstclass.setBounds(6, 99, 93, 23);
		panel.add(firstclass);
		
		JRadioButton ac = new JRadioButton("Ac");
		ac.setBackground(new Color(192, 192, 192));
		ac.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ac.setBounds(117, 99, 84, 23);
		panel.add(ac);
		
		JRadioButton sleeper = new JRadioButton("Sleeper");
		sleeper.setBackground(new Color(192, 192, 192));
		sleeper.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sleeper.setBounds(204, 99, 93, 23);
		panel.add(sleeper);
		
		JRadioButton child = new JRadioButton("Child");
		child.setBackground(new Color(192, 192, 192));
		child.setFont(new Font("Tahoma", Font.PLAIN, 13));
		child.setBounds(204, 70, 100, 23);
		panel.add(child);
		
		ButtonGroup G2=new ButtonGroup();
		G2.add(firstclass);
		G2.add(ac);
		G2.add(sleeper);
		G2.add(standard);
		G1.add(child);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.GRAY);
		separator_1.setBounds(10, 178, 405, 2);
		panel.add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setForeground(new Color(0, 0, 0));
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTax.setBounds(10, 191, 89, 21);
		panel.add(lblTax);
		
		JComboBox from = new JComboBox();
		from.setModel(new DefaultComboBoxModel(new String[] {"Kollam", "Thiruvalla", "Kottayam"}));
		from.setBounds(10, 135, 145, 23);
		panel.add(from);
		
		JComboBox to = new JComboBox();
		to.setModel(new DefaultComboBoxModel(new String[] {"Kollam", "Thiruvalla", "Kottayam"}));
		to.setBounds(165, 135, 145, 23);
		panel.add(to);
		
		JComboBox count = new JComboBox();
		count.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		count.setBounds(320, 135, 95, 23);
		panel.add(count);
		
		ptax = new JTextField();
		ptax.setBounds(149, 189, 238, 23);
		panel.add(ptax);
		ptax.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setForeground(new Color(0, 0, 0));
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubTotal.setBounds(10, 227, 89, 21);
		panel.add(lblSubTotal);
		
		psubtotal = new JTextField();
		psubtotal.setBounds(149, 223, 238, 25);
		panel.add(psubtotal);
		psubtotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(new Color(0, 0, 0));
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotal.setBounds(10, 263, 89, 23);
		panel.add(lblTotal);
		
		ptotal = new JTextField();
		ptotal.setBounds(148, 259, 238, 27);
		panel.add(ptotal);
		ptotal.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.GRAY);
		separator_2.setBounds(10, 304, 405, 2);
		panel.add(separator_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setBounds(46, 323, 109, 29);
		panel.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		
		btnReset.setBounds(165, 323, 100, 29);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(275, 321, 100, 31);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_1.setBounds(445, 101, 455, 372);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setForeground(new Color(255, 255, 255));
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName_1.setBounds(10, 45, 79, 19);
		panel_1.add(lblName_1);
		
		pname = new JTextField();
		pname.setBounds(111, 44, 238, 26);
		panel_1.add(pname);
		pname.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(new Color(255, 255, 255));
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFrom.setBounds(10, 104, 46, 19);
		panel_1.add(lblFrom);
		
		pfrom = new JTextField();
		pfrom.setBounds(66, 104, 130, 26);
		panel_1.add(pfrom);
		pfrom.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No.");
		lblTicketNo.setForeground(new Color(255, 255, 255));
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTicketNo.setBounds(219, 106, 75, 14);
		panel_1.add(lblTicketNo);
		
		pticket = new JTextField();
		pticket.setBounds(315, 101, 130, 26);
		panel_1.add(pticket);
		pticket.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("To");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 146, 46, 14);
		panel_1.add(lblNewLabel);
		
		pto = new JTextField();
		pto.setBounds(66, 141, 130, 26);
		panel_1.add(pto);
		pto.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(new Color(255, 255, 255));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(10, 189, 46, 14);
		panel_1.add(lblDate);
		
		pdate = new JTextField();
		pdate.setBounds(66, 181, 130, 26);
		panel_1.add(pdate);
		pdate.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setForeground(new Color(255, 255, 255));
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTime.setBounds(10, 229, 46, 14);
		panel_1.add(lblTime);
		
		ptime = new JTextField();
		ptime.setBounds(66, 221, 130, 26);
		panel_1.add(ptime);
		ptime.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(219, 147, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setForeground(new Color(255, 255, 255));
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRoute.setBounds(219, 190, 46, 14);
		panel_1.add(lblRoute);
		
		pprice = new JTextField();
		pprice.setBounds(315, 138, 130, 26);
		panel_1.add(pprice);
		pprice.setColumns(10);
		
		proute = new JTextField();
		proute.setBounds(315, 181, 130, 23);
		panel_1.add(proute);
		proute.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
                model.addRow(new String[]
                        {
                                pname.getText(),
                                pticket.getText(),
                                pfrom.getText(),
                                pto.getText(),
                                (String)count.getSelectedItem(),
                                ptime.getText(),
                                pdate.getText(),
                                t,
                                pprice.getText()
                        });
			}
		});
		btnNewButton.setBounds(160, 293, 134, 26);
		panel_1.add(btnNewButton);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(255, 255, 255)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No.", "From", "To", "No. of Seats", "Time", "Date", "Ac/Non AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setForeground(new Color(0, 0, 128));
		table.setBackground(new Color(192, 192, 192));
		table.setBounds(10, 500, 890, 80);
		frame.getContentPane().add(table);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name.getText().equals(" ")||!G1.isSelected(null) || (!G2.isSelected(null)))
                {
					 String a=(String)from.getSelectedItem();
		             String b=(String)to.getSelectedItem();
		             float c=Float.parseFloat((String)count.getSelectedItem());
		             float tax=0;
	                 float total=0;
	                 float fa=0;
	                if((a.equals("Kollam")) && (b.equals("Thiruvalla"))||(a.equals("Thiruvalla")) && (b.equals("Kollam")))
	                {
	                 fa=50f;
	                }
	                if((a.equals("Kollam")) && (b.equals("Kottayam"))||(a.equals("Kottayam")) && (b.equals("Kollam")))
	                {
	                 fa=100f;
	                }
	                if((a.equals("Thiruvalla")) && (b.equals("Kottayam"))||(a.equals("Kottayam")) && (b.equals("Thiruvalla")))
	                {
	                 fa=50f;
	                }
	                //checking location and assign fare above
	                if(adult.isSelected())
	                {
	                  if(standard.isSelected())
	                    {
	                      t="Standard";
	                      tax=fa*5/100;
	                      total=(fa+tax)*c;
	                    }
	                    else if(ac.isSelected())
	                    {
	                      t="Ac";
	                      fa=fa*150/100;
	                      tax=fa*10/100;
	                      total=(fa+tax)*c;
	                    }
	                    else if(sleeper.isSelected())
	                    {
	                      t="Sleeper";
	                     fa=fa*130/100;
	                     tax=fa*7/100;
	                     total=(fa+tax)*c;
	                    }
	                    else if(firstclass.isSelected())
	                    {
	                      t="FirstClass";
	                      fa=fa*180/100;
	                      tax=fa*15/100;
	                      total=(fa+tax)*c;
	                    }
	                }
	                else
	                {
	                
	                	if(standard.isSelected())
	                    {
	                         t="Standard";
	                      fa=fa*50/100;
	                      tax=fa*2/100;
	                      total=(fa+tax)*c;
	                    }
	                    else if(ac.isSelected())
	                    {
	                         t="Ac";
	                      fa=(fa*50/100)*50/100;
	                      tax=fa*5/100;
	                      total=(fa+tax)*c;
	                    }
	                    else if(sleeper.isSelected())
	                    {
	                         t="Sleeper";
	                     fa=(fa*50/100)*30/100;
	                      tax=fa*3/100;
	                      total=(fa+tax)*c;
	                    }
	                    else if(firstclass.isSelected())
	                    {
	                         t="First Class";
	                      fa=(fa*50/100)*80/100;
	                      tax=fa*10/100;
	                      total=(fa+tax)*c;
	                    }
	                }
	                pname.setText(name.getText());
	                 ptax.setText(String.valueOf(tax));
	                 psubtotal.setText(String.valueOf(fa));
	                 ptotal.setText(String.valueOf(total));
	                 Random rand = new Random();
	                 int rand_int1 = rand.nextInt(10000);
	                 pticket.setText(String.valueOf(rand_int1));
	                 ptotal.setText(String.valueOf(total));
	                 proute.setText("any");
	                 pfrom.setText((String)from.getSelectedItem());
	                 pto.setText((String)to.getSelectedItem());
	                 pprice.setText(String.valueOf(total));
	                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	                 DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
	                 LocalDateTime now = LocalDateTime.now();
	                 pdate.setText(dtf.format(now));
	                 ptime.setText(tf.format(now));
	                
	                
                }
			}
		});
	}
	}
