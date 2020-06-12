
 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Information {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information window = new Information();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Information() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		textField = new JTextField();
		textField.setBounds(128, 28, 116, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(65, 31, 76, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setBounds(65, 68, 76, 14);
		frame.getContentPane().add(lblDateOfBirth);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Date");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.addItem("6");
		comboBox.addItem("7");
		comboBox.addItem("8");
		comboBox.addItem("9");
		comboBox.addItem("10");
		comboBox.addItem("11");
		comboBox.addItem("12");
		comboBox.addItem("13");
		comboBox.addItem("14");
		comboBox.addItem("15");
		comboBox.addItem("16");
		comboBox.addItem("17");
		comboBox.addItem("18");
		comboBox.addItem("19");
		comboBox.addItem("20");
		comboBox.addItem("21");
		comboBox.addItem("22");
		comboBox.addItem("23");
		comboBox.addItem("24");
		comboBox.addItem("25");
		comboBox.addItem("26");
		comboBox.addItem("27");
		comboBox.addItem("28");
		comboBox.addItem("29");
		comboBox.addItem("30");
		comboBox.addItem("31");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(158, 65, 81, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox<String> comboBox2 = new JComboBox<String>();
		comboBox2.addItem("Month");
		for(int i = 1 ; i < 13; i++) {
			comboBox2.addItem(String.valueOf(i));
		}
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox2.setBounds(250, 65, 91, 20);
		frame.getContentPane().add(comboBox2);
		
		JComboBox<String> comboBox3 = new JComboBox<String>();
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
		comboBox3.addItem("Year");
		for (int i = year; i >= 1930; i--) {
			comboBox3.addItem(String.valueOf(i));
		}
		
		comboBox3.setBounds(355, 65, 91, 20);
		frame.getContentPane().add(comboBox3);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(65, 100, 46, 14);
		frame.getContentPane().add(lblPhone);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 98, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblEmailId = new JLabel("Email");
		lblEmailId.setBounds(65, 130, 46, 17);
		frame.getContentPane().add(lblEmailId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 130, 247, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(65, 162, 55, 14);
		frame.getContentPane().add(lblAddress);
				
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(126, 157, 212, 40);
		frame.getContentPane().add(textArea_1);
		
		
		
		JButton btnClear = new JButton("Clear");
		
		btnClear.setBounds(312, 387, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setBounds(65, 228, 46, 14);
		frame.getContentPane().add(lblSex);
		
		JLabel lblMale = new JLabel("Male");
		lblMale.setBounds(128, 228, 46, 14);
		frame.getContentPane().add(lblMale);
		
		JLabel lblFemale = new JLabel("Female");
		lblFemale.setBounds(292, 228, 46, 14);
		frame.getContentPane().add(lblFemale);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(337, 224, 109, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(162, 224, 109, 23);
		frame.getContentPane().add(radioButton_1);
		
		JLabel lblType = new JLabel("Type Of Employee");
		lblType.setBounds(65, 265, 107, 14);
		frame.getContentPane().add(lblType);
		
		JComboBox<String> comboBox1 = new JComboBox<String>();
		comboBox1.addItem("Select");
		comboBox1.addItem("Coder");
		comboBox1.addItem("Tester");
		comboBox1.addItem("Dancer");
		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox1.setBounds(180, 260, 91, 20);
		frame.getContentPane().add(comboBox1);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setBounds(65, 295, 88, 14);
		frame.getContentPane().add(lblBasicSalary);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180, 295, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		JButton btnSubmit = new JButton("Submit");
		
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setBounds(65, 387, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty())||
						(textArea_1.getText().isEmpty())||((radioButton_1.isSelected())&&(radioButton.isSelected()))||
						(comboBox1.getSelectedItem().equals("Select")))
					JOptionPane.showMessageDialog(null, "Data Missing");
				else		
				JOptionPane.showMessageDialog(null, "Data Submitted");
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
				textArea_1.setText(null);
				radioButton.setSelected(false);
				radioButton_1.setSelected(false);
				comboBox1.setSelectedItem("Select");
				
				
			}
		});
		
	}
}