package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewFaculty {

	private JFrame frmNewFaculty;
	private JTextField nameField;
	private JTextField fathersNameField;
	private JTextField empIdField;
	private JTextField ageField;
	private JTextField addressField;
	private JTextField phoneNumberField;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewFaculty window = new NewFaculty();
					window.frmNewFaculty.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewFaculty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewFaculty = new JFrame();
		frmNewFaculty.getContentPane().setBackground(Color.WHITE);
		frmNewFaculty.setResizable(false);
		frmNewFaculty.setBackground(Color.WHITE);
		frmNewFaculty.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmNewFaculty.setTitle("New Faculty");
		frmNewFaculty.setBounds(100, 100, 575, 625);
		frmNewFaculty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNewFaculty.getContentPane().setLayout(null);
		frmNewFaculty.setLocationRelativeTo(null);

		JLabel lblNewFaculty = new JLabel("New Faculty");
		lblNewFaculty.setForeground(Color.BLACK);
		lblNewFaculty.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewFaculty.setBounds(206, 10, 137, 38);
		frmNewFaculty.getContentPane().add(lblNewFaculty);

		JLabel lblName = new JLabel("Name: ");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(51, 76, 129, 28);
		frmNewFaculty.getContentPane().add(lblName);

		JLabel lblFathersName = new JLabel("Fathers Name:");
		lblFathersName.setForeground(Color.BLACK);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFathersName.setBounds(51, 114, 129, 28);
		frmNewFaculty.getContentPane().add(lblFathersName);

		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setForeground(Color.BLACK);
		lblEmployeeId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmployeeId.setBounds(51, 152, 129, 28);
		frmNewFaculty.getContentPane().add(lblEmployeeId);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGender.setBounds(51, 190, 129, 28);
		frmNewFaculty.getContentPane().add(lblGender);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(51, 228, 129, 28);
		frmNewFaculty.getContentPane().add(lblAge);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddress.setBounds(51, 266, 129, 28);
		frmNewFaculty.getContentPane().add(lblAddress);

		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.BLACK);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhoneNumber.setBounds(51, 304, 129, 28);
		frmNewFaculty.getContentPane().add(lblPhoneNumber);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setForeground(Color.BLACK);
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmailAddress.setBounds(51, 342, 129, 28);
		frmNewFaculty.getContentPane().add(lblEmailAddress);

		JLabel lblEducation = new JLabel("Education");
		lblEducation.setForeground(Color.BLACK);
		lblEducation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEducation.setBounds(51, 380, 129, 28);
		frmNewFaculty.getContentPane().add(lblEducation);

		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setForeground(Color.BLACK);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepartment.setBounds(51, 418, 129, 28);
		frmNewFaculty.getContentPane().add(lblDepartment);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(280, 539, 115, 28);
		frmNewFaculty.getContentPane().add(btnSubmit);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmNewFaculty.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(155, 539, 115, 28);
		frmNewFaculty.getContentPane().add(btnCancel);

		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.BOLD, 16));
		nameField.setColumns(10);
		nameField.setBounds(190, 76, 324, 28);
		frmNewFaculty.getContentPane().add(nameField);

		fathersNameField = new JTextField();
		fathersNameField.setFont(new Font("Tahoma", Font.BOLD, 16));
		fathersNameField.setColumns(10);
		fathersNameField.setBounds(190, 114, 324, 28);
		frmNewFaculty.getContentPane().add(fathersNameField);

		empIdField = new JTextField();
		empIdField.setFont(new Font("Tahoma", Font.BOLD, 16));
		empIdField.setColumns(10);
		empIdField.setBounds(190, 152, 324, 28);
		frmNewFaculty.getContentPane().add(empIdField);

		ageField = new JTextField();
		ageField.setFont(new Font("Tahoma", Font.BOLD, 16));
		ageField.setColumns(10);
		ageField.setBounds(190, 228, 324, 28);
		frmNewFaculty.getContentPane().add(ageField);

		addressField = new JTextField();
		addressField.setFont(new Font("Tahoma", Font.BOLD, 16));
		addressField.setColumns(10);
		addressField.setBounds(190, 266, 324, 28);
		frmNewFaculty.getContentPane().add(addressField);

		phoneNumberField = new JTextField();
		phoneNumberField.setFont(new Font("Tahoma", Font.BOLD, 16));
		phoneNumberField.setColumns(10);
		phoneNumberField.setBounds(190, 304, 324, 28);
		frmNewFaculty.getContentPane().add(phoneNumberField);

		emailField = new JTextField();
		emailField.setFont(new Font("Tahoma", Font.BOLD, 16));
		emailField.setColumns(10);
		emailField.setBounds(190, 342, 324, 28);
		frmNewFaculty.getContentPane().add(emailField);

		String department[] = { "Software Engineering", "Computer Science", "Civil Engineering", "Computer Engineering",
				"Biomedical Engineering", "Telecommunication" };
		JComboBox departmentComboBox = new JComboBox(department);
		departmentComboBox.setBackground(Color.WHITE);
		departmentComboBox.setBounds(190, 424, 324, 21);
		frmNewFaculty.getContentPane().add(departmentComboBox);

		JRadioButton male = new JRadioButton("Male");
		male.setSelected(true);
		male.setFont(new Font("Tahoma", Font.BOLD, 12));
		male.setBackground(Color.WHITE);
		male.setBounds(191, 196, 103, 21);
		frmNewFaculty.getContentPane().add(male);

		JRadioButton female = new JRadioButton("Female");
		female.setFont(new Font("Tahoma", Font.BOLD, 12));
		female.setBackground(Color.WHITE);
		female.setBounds(296, 196, 103, 21);
		frmNewFaculty.getContentPane().add(female);

		String education[] = { "Phd", "B.Tech", "Bsc", "Msc", "MBA", "MCA", "BA", "BCom" };
		JComboBox educationComboBox = new JComboBox(education);
		educationComboBox.setBackground(Color.WHITE);
		educationComboBox.setBounds(190, 386, 324, 21);
		frmNewFaculty.getContentPane().add(educationComboBox);

		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(female);
		genderGroup.add(male);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String fatherName = fathersNameField.getText();
				String empId = empIdField.getText();
				String gender = null;
				if (male.isSelected()) {
					gender = "Male";
				} else {
					gender = "Female";
				}
				String age = ageField.getText();
				String address = addressField.getText();
				String phoneNumber = phoneNumberField.getText();
				String email = emailField.getText();
				String education = (String) educationComboBox.getSelectedItem();
				String department = (String) departmentComboBox.getSelectedItem();
				try {
					MySQLConnection con = new MySQLConnection();
					String query = "insert into faculty values('" + name + "','" + fatherName + "','" + empId + "','"
							+ gender + "','" + age + "','" + address + "','" + phoneNumber + "','" + email + "','"
							+ education + "','" + department + "')";
					con.stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Faculty Details Added Successfully!", "Success",
							JOptionPane.DEFAULT_OPTION);
					universitymanagement.UniversityManagement.main(null);
					frmNewFaculty.dispose();
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(null, exc);
				}
			}
		});

	}
}
