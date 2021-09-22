package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Choice;
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
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class UpdateStudent {

	private JFrame frmUpdateStudentDetails;
	private JTextField fieldName;
	private JTextField fieldFathersName;
	private JTextField fieldAge;
	private JTextField fieldAddress;
	private JTextField fieldPhoneNumber;
	private JTextField fieldEmail;
	private JTextField fieldMatricPer;
	private JTextField fieldInterPer;
	private JTextField fieldGender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent window = new UpdateStudent();
					window.frmUpdateStudentDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateStudentDetails = new JFrame();
		frmUpdateStudentDetails.getContentPane().setBackground(Color.WHITE);
		frmUpdateStudentDetails
				.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmUpdateStudentDetails.setTitle("Update Student Details");
		frmUpdateStudentDetails.setResizable(false);
		frmUpdateStudentDetails.setBounds(100, 100, 575, 695);
		frmUpdateStudentDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateStudentDetails.getContentPane().setLayout(null);

		JLabel lblUpdateDetails = new JLabel("Update Details");
		lblUpdateDetails.setForeground(Color.BLACK);
		lblUpdateDetails.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblUpdateDetails.setBounds(197, 10, 171, 38);
		frmUpdateStudentDetails.getContentPane().add(lblUpdateDetails);

		String department[] = { "Software Engineering", "Computer Science", "Civil Engineering", "Computer Engineering",
				"Biomedical Engineering", "Telecommunication" };
		JComboBox comboBox = new JComboBox(department);
		comboBox.setBounds(187, 531, 323, 27);
		frmUpdateStudentDetails.getContentPane().add(comboBox);
		comboBox.setEnabled(false);

		Choice c2 = new Choice();
		c2.setBounds(234, 65, 276, 18);
		try {
			MySQLConnection conn = new MySQLConnection();
			String query = "select * from student";
			java.sql.ResultSet rs = conn.stmt.executeQuery(query);
			while (rs.next()) {
				c2.add(rs.getString("rollno"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		frmUpdateStudentDetails.getContentPane().setLayout(null);
		frmUpdateStudentDetails.getContentPane().add(c2);

		JLabel lblName = new JLabel("Name: ");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(48, 189, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblName);

		JLabel lblFathersName = new JLabel("Fathers Name:");
		lblFathersName.setForeground(Color.BLACK);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFathersName.setBounds(48, 227, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblFathersName);

		JLabel lblRollNumber = new JLabel("Enter Roll Number:");
		lblRollNumber.setForeground(Color.BLACK);
		lblRollNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRollNumber.setBounds(48, 60, 210, 28);
		frmUpdateStudentDetails.getContentPane().add(lblRollNumber);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGender.setBounds(48, 265, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblGender);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(48, 303, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblAge);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddress.setBounds(48, 341, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblAddress);

		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.BLACK);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhoneNumber.setBounds(48, 379, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblPhoneNumber);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setForeground(Color.BLACK);
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmailAddress.setBounds(48, 417, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblEmailAddress);

		JLabel lblMatricPercentage = new JLabel("Matric %");
		lblMatricPercentage.setForeground(Color.BLACK);
		lblMatricPercentage.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMatricPercentage.setBounds(48, 455, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblMatricPercentage);

		JLabel lblInter = new JLabel("Inter %");
		lblInter.setForeground(Color.BLACK);
		lblInter.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInter.setBounds(48, 493, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblInter);

		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setForeground(Color.BLACK);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepartment.setBounds(48, 531, 129, 28);
		frmUpdateStudentDetails.getContentPane().add(lblDepartment);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MySQLConnection con = new MySQLConnection();
					String query = "update student set name='" + fieldName.getText() + "',fatherName='"
							+ fieldFathersName.getText() + "',gender='" + fieldGender.getText() + "',age='"
							+ fieldAge.getText() + "',address='" + fieldAddress.getText() + "',phoneNumber='"
							+ fieldPhoneNumber.getText() + "',email='" + fieldEmail.getText() + "',matricper='"
							+ fieldMatricPer.getText() + "',interper='" + fieldInterPer.getText() + "',department='"
							+ (String) comboBox.getSelectedItem() + "';";
					con.stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Updated Successfully");
					frmUpdateStudentDetails.dispose();
					universitymanagement.UpdateStudent.main(null);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(277, 614, 115, 28);
		frmUpdateStudentDetails.getContentPane().add(btnUpdate);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdateStudentDetails.dispose();
				universitymanagement.ShowStudent.main(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(152, 614, 115, 28);
		frmUpdateStudentDetails.getContentPane().add(btnCancel);

		fieldName = new JTextField();
		fieldName.setEnabled(false);
		fieldName.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldName.setColumns(10);
		fieldName.setBounds(187, 189, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldName);

		fieldFathersName = new JTextField();
		fieldFathersName.setEnabled(false);
		fieldFathersName.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldFathersName.setColumns(10);
		fieldFathersName.setBounds(187, 227, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldFathersName);

		fieldAge = new JTextField();
		fieldAge.setEnabled(false);
		fieldAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldAge.setColumns(10);
		fieldAge.setBounds(187, 303, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldAge);

		fieldAddress = new JTextField();
		fieldAddress.setEnabled(false);
		fieldAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldAddress.setColumns(10);
		fieldAddress.setBounds(187, 341, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldAddress);

		fieldPhoneNumber = new JTextField();
		fieldPhoneNumber.setEnabled(false);
		fieldPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldPhoneNumber.setColumns(10);
		fieldPhoneNumber.setBounds(187, 379, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldPhoneNumber);

		fieldEmail = new JTextField();
		fieldEmail.setEnabled(false);
		fieldEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldEmail.setColumns(10);
		fieldEmail.setBounds(187, 417, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldEmail);

		fieldMatricPer = new JTextField();
		fieldMatricPer.setEnabled(false);
		fieldMatricPer.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldMatricPer.setColumns(10);
		fieldMatricPer.setBounds(187, 455, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldMatricPer);

		fieldInterPer = new JTextField();
		fieldInterPer.setEnabled(false);
		fieldInterPer.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldInterPer.setColumns(10);
		fieldInterPer.setBounds(187, 493, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldInterPer);

		JButton btnFetch = new JButton("Fetch");
		btnFetch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c2.setEnabled(false);
				fieldName.setEnabled(true);
				fieldFathersName.setEnabled(true);
				fieldAge.setEnabled(true);
				fieldAddress.setEnabled(true);
				comboBox.setEnabled(true);
				fieldGender.setEnabled(true);
				fieldEmail.setEnabled(true);
				fieldInterPer.setEnabled(true);
				fieldPhoneNumber.setEnabled(true);
				fieldMatricPer.setEnabled(true);
				try {
					MySQLConnection con = new MySQLConnection();
					String query = "select * from student where rollno = '" + c2.getSelectedItem() + "'";
					java.sql.ResultSet rs = con.stmt.executeQuery(query);

					while (rs.next()) {
						fieldName.setText(rs.getString("name"));
						fieldFathersName.setText(rs.getString("fatherName"));
						fieldAge.setText(rs.getString("age"));
						fieldAddress.setText(rs.getString("address"));
						fieldGender.setText(rs.getString("gender"));
						fieldEmail.setText(rs.getString("email"));
						fieldInterPer.setText(rs.getString("interper"));
						fieldPhoneNumber.setText(rs.getString("phoneNumber"));
						fieldMatricPer.setText(rs.getString("matricper"));
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				btnUpdate.setEnabled(true);
			}
		});
		btnFetch.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnFetch.setBackground(Color.WHITE);
		btnFetch.setBounds(234, 93, 115, 28);
		frmUpdateStudentDetails.getContentPane().add(btnFetch);
		frmUpdateStudentDetails.setLocationRelativeTo(null);

		fieldGender = new JTextField();
		fieldGender.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldGender.setEnabled(false);
		fieldGender.setColumns(10);
		fieldGender.setBounds(187, 265, 324, 28);
		frmUpdateStudentDetails.getContentPane().add(fieldGender);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(48, 142, 462, 2);
		frmUpdateStudentDetails.getContentPane().add(separator);

	}
}
