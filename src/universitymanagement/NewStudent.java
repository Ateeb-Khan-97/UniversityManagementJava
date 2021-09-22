package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class NewStudent {

	private JFrame frmNewStudent;
	private JTextField nameField;
	private JTextField fathersNameField;
	private JTextField enrollmentNoField;
	private JTextField ageField;
	private JTextField addressField;
	private JTextField phoneNumberField;
	private JTextField emailAddressField;
	private JTextField matricPercentageField;
	private JTextField interPercentageField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewStudent window = new NewStudent();
					window.frmNewStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewStudent = new JFrame();
		frmNewStudent.setTitle("New Student");
		frmNewStudent.getContentPane().setBackground(Color.WHITE);
		frmNewStudent.setResizable(false);
		frmNewStudent.setBackground(Color.WHITE);
		frmNewStudent.setBounds(100, 100, 575, 625);
		frmNewStudent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmNewStudent.getContentPane().setLayout(null);
		frmNewStudent.setLocationRelativeTo(null);
		JLabel lblNewStudent = new JLabel("New Student");
		lblNewStudent.setForeground(Color.BLACK);
		lblNewStudent.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewStudent.setBounds(205, 10, 137, 38);
		frmNewStudent.getContentPane().add(lblNewStudent);

		JLabel lblName = new JLabel("Name: ");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(50, 76, 129, 28);
		frmNewStudent.getContentPane().add(lblName);

		JLabel lblFathersName = new JLabel("Fathers Name:");
		lblFathersName.setForeground(Color.BLACK);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFathersName.setBounds(50, 114, 129, 28);
		frmNewStudent.getContentPane().add(lblFathersName);

		JLabel lblEnrollmentNo = new JLabel("Enrollment No:");
		lblEnrollmentNo.setForeground(Color.BLACK);
		lblEnrollmentNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnrollmentNo.setBounds(50, 152, 129, 28);
		frmNewStudent.getContentPane().add(lblEnrollmentNo);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGender.setBounds(50, 190, 129, 28);
		frmNewStudent.getContentPane().add(lblGender);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(50, 228, 129, 28);
		frmNewStudent.getContentPane().add(lblAge);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddress.setBounds(50, 266, 129, 28);
		frmNewStudent.getContentPane().add(lblAddress);

		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.BLACK);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhoneNumber.setBounds(50, 304, 129, 28);
		frmNewStudent.getContentPane().add(lblPhoneNumber);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setForeground(Color.BLACK);
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmailAddress.setBounds(50, 342, 129, 28);
		frmNewStudent.getContentPane().add(lblEmailAddress);

		JLabel lblMatricPercentage = new JLabel("Matric %");
		lblMatricPercentage.setForeground(Color.BLACK);
		lblMatricPercentage.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMatricPercentage.setBounds(50, 380, 129, 28);
		frmNewStudent.getContentPane().add(lblMatricPercentage);

		JLabel lblInter = new JLabel("Inter %");
		lblInter.setForeground(Color.BLACK);
		lblInter.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInter.setBounds(50, 418, 129, 28);
		frmNewStudent.getContentPane().add(lblInter);

		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setForeground(Color.BLACK);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepartment.setBounds(50, 456, 129, 28);
		frmNewStudent.getContentPane().add(lblDepartment);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(279, 539, 115, 28);
		frmNewStudent.getContentPane().add(btnSubmit);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				universitymanagement.UniversityManagement.main(null);
				frmNewStudent.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(154, 539, 115, 28);
		frmNewStudent.getContentPane().add(btnCancel);

		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.BOLD, 16));
		nameField.setColumns(10);
		nameField.setBounds(189, 76, 324, 28);
		frmNewStudent.getContentPane().add(nameField);

		fathersNameField = new JTextField();
		fathersNameField.setFont(new Font("Tahoma", Font.BOLD, 16));
		fathersNameField.setColumns(10);
		fathersNameField.setBounds(189, 114, 324, 28);
		frmNewStudent.getContentPane().add(fathersNameField);

		enrollmentNoField = new JTextField();
		enrollmentNoField.setFont(new Font("Tahoma", Font.BOLD, 16));
		enrollmentNoField.setColumns(10);
		enrollmentNoField.setBounds(189, 152, 324, 28);
		frmNewStudent.getContentPane().add(enrollmentNoField);

		ageField = new JTextField();
		ageField.setFont(new Font("Tahoma", Font.BOLD, 16));
		ageField.setColumns(10);
		ageField.setBounds(189, 228, 324, 28);
		frmNewStudent.getContentPane().add(ageField);

		addressField = new JTextField();
		addressField.setFont(new Font("Tahoma", Font.BOLD, 16));
		addressField.setColumns(10);
		addressField.setBounds(189, 266, 324, 28);
		frmNewStudent.getContentPane().add(addressField);

		phoneNumberField = new JTextField();
		phoneNumberField.setFont(new Font("Tahoma", Font.BOLD, 16));
		phoneNumberField.setColumns(10);
		phoneNumberField.setBounds(189, 304, 324, 28);
		frmNewStudent.getContentPane().add(phoneNumberField);

		emailAddressField = new JTextField();
		emailAddressField.setFont(new Font("Tahoma", Font.BOLD, 16));
		emailAddressField.setColumns(10);
		emailAddressField.setBounds(189, 342, 324, 28);
		frmNewStudent.getContentPane().add(emailAddressField);

		matricPercentageField = new JTextField();
		matricPercentageField.setFont(new Font("Tahoma", Font.BOLD, 16));
		matricPercentageField.setColumns(10);
		matricPercentageField.setBounds(189, 380, 324, 28);
		frmNewStudent.getContentPane().add(matricPercentageField);

		interPercentageField = new JTextField();
		interPercentageField.setFont(new Font("Tahoma", Font.BOLD, 16));
		interPercentageField.setColumns(10);
		interPercentageField.setBounds(189, 418, 324, 28);
		frmNewStudent.getContentPane().add(interPercentageField);

		String department[] = { "Software Engineering", "Computer Science", "Civil Engineering", "Computer Engineering",
				"Biomedical Engineering", "Telecommunication" };
		JComboBox departmentComboBox = new JComboBox(department);
		departmentComboBox.setBackground(Color.WHITE);
		departmentComboBox.setBounds(189, 462, 324, 21);
		frmNewStudent.getContentPane().add(departmentComboBox);

		JRadioButton male = new JRadioButton("Male");
		male.setSelected(true);
		male.setFont(new Font("Tahoma", Font.BOLD, 12));
		male.setBackground(Color.WHITE);
		male.setBounds(190, 196, 103, 21);
		frmNewStudent.getContentPane().add(male);

		JRadioButton female = new JRadioButton("Female");
		female.setFont(new Font("Tahoma", Font.BOLD, 12));
		female.setBackground(Color.WHITE);
		female.setBounds(295, 196, 103, 21);
		frmNewStudent.getContentPane().add(female);

		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(female);
		genderGroup.add(male);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				StringBuilder name = new StringBuilder(nameField.getText());
				StringBuilder fatherName = new StringBuilder(fathersNameField.getText());
				StringBuilder rollno = new StringBuilder(enrollmentNoField.getText());
				StringBuilder gender;
				if (male.isSelected()) {
					gender = new StringBuilder("Male");
				} else {
					gender = new StringBuilder("Female");
				}
				StringBuilder age = new StringBuilder(ageField.getText());
				StringBuilder address = new StringBuilder(addressField.getText());
				StringBuilder phoneNumber = new StringBuilder(phoneNumberField.getText());
				StringBuilder email = new StringBuilder(emailAddressField.getText());
				StringBuilder matricPer = new StringBuilder(matricPercentageField.getText());
				StringBuilder interPer = new StringBuilder(interPercentageField.getText());
				StringBuilder department = new StringBuilder((String) departmentComboBox.getSelectedItem());

				try {
					MySQLConnection con = new MySQLConnection();
					String query = "insert into student values('" + name + "','" + fatherName + "','" + rollno + "','"
							+ gender + "','" + age + "','" + address + "','" + phoneNumber + "','" + email + "','"
							+ matricPer + "','" + interPer + "','" + department + "')";
					con.stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Student Details Added Successfully!", "Success",
							JOptionPane.DEFAULT_OPTION);
					universitymanagement.UniversityManagement.main(null);
					frmNewStudent.dispose();
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(null, exc);
				}
			}
		});
	}
}
