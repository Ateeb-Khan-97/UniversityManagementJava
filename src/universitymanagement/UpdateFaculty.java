package universitymanagement;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JComboBox;

public class UpdateFaculty {

	private JTextField fieldName;
	private JTextField fieldFathersName;
	private JTextField fieldAge;
	private JTextField fieldAddress;
	private JTextField fieldPhoneNumber;
	private JTextField fieldEmail;
	private JTextField fieldEducation;
	private JTextField fieldGender;
	private JFrame frmUpdateFacultyDetails;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateFaculty window = new UpdateFaculty();
					window.frmUpdateFacultyDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateFaculty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateFacultyDetails = new JFrame();
		frmUpdateFacultyDetails.getContentPane().setBackground(Color.WHITE);
		frmUpdateFacultyDetails
				.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmUpdateFacultyDetails.setResizable(false);
		frmUpdateFacultyDetails.setTitle("Update Faculty Details");
		frmUpdateFacultyDetails.setBounds(100, 100, 575, 644);
		frmUpdateFacultyDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateFacultyDetails.getContentPane().setLayout(null);
		frmUpdateFacultyDetails.setLocationRelativeTo(null);

		String department[] = { "Software Engineering", "Computer Science", "Civil Engineering", "Computer Engineering",
				"Biomedical Engineering", "Telecommunication" };
		JComboBox comboBox = new JComboBox(department);
		comboBox.setBounds(187, 493, 323, 27);
		frmUpdateFacultyDetails.getContentPane().add(comboBox);
		comboBox.setEnabled(false);

		JLabel lblUpdateDetails = new JLabel("Update Details");
		lblUpdateDetails.setForeground(Color.BLACK);
		lblUpdateDetails.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblUpdateDetails.setBounds(197, 10, 171, 38);
		frmUpdateFacultyDetails.getContentPane().add(lblUpdateDetails);

		Choice c2 = new Choice();
		c2.setBounds(234, 65, 276, 18);
		try {
			MySQLConnection conn = new MySQLConnection();
			String query = "select * from faculty";
			java.sql.ResultSet rs = conn.stmt.executeQuery(query);
			while (rs.next()) {
				c2.add(rs.getString("empId"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		frmUpdateFacultyDetails.getContentPane().setLayout(null);
		frmUpdateFacultyDetails.getContentPane().add(c2);

		JLabel lblName = new JLabel("Name: ");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(48, 189, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblName);

		JLabel lblFathersName = new JLabel("Fathers Name:");
		lblFathersName.setForeground(Color.BLACK);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFathersName.setBounds(48, 227, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblFathersName);

		JLabel lblRollNumber = new JLabel("Enter Roll Number:");
		lblRollNumber.setForeground(Color.BLACK);
		lblRollNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRollNumber.setBounds(48, 60, 210, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblRollNumber);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGender.setBounds(48, 265, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblGender);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(48, 303, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblAge);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddress.setBounds(48, 341, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblAddress);

		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.BLACK);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhoneNumber.setBounds(48, 379, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblPhoneNumber);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setForeground(Color.BLACK);
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmailAddress.setBounds(48, 417, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblEmailAddress);

		JLabel lblMatricPercentage = new JLabel("Education:");
		lblMatricPercentage.setForeground(Color.BLACK);
		lblMatricPercentage.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMatricPercentage.setBounds(48, 455, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblMatricPercentage);

		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setForeground(Color.BLACK);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepartment.setBounds(48, 493, 129, 28);
		frmUpdateFacultyDetails.getContentPane().add(lblDepartment);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MySQLConnection con = new MySQLConnection();
					String query = "update faculty set name='" + fieldName.getText() + "',fatherName='"
							+ fieldFathersName.getText() + "',gender='" + fieldGender.getText() + "',age='"
							+ fieldAge.getText() + "',address='" + fieldAddress.getText() + "',phoneNumber='"
							+ fieldPhoneNumber.getText() + "',email='" + fieldEmail.getText() + "',education='"
							+ fieldEducation.getText() + "',department='" + (String) comboBox.getSelectedItem() + "';";
					con.stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Updated Successfully");
					frmUpdateFacultyDetails.dispose();
					universitymanagement.UpdateFaculty.main(null);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(268, 554, 115, 28);
		frmUpdateFacultyDetails.getContentPane().add(btnUpdate);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdateFacultyDetails.dispose();
				universitymanagement.ShowFaculty.main(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(143, 554, 115, 28);
		frmUpdateFacultyDetails.getContentPane().add(btnCancel);

		fieldName = new JTextField();
		fieldName.setEnabled(false);
		fieldName.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldName.setColumns(10);
		fieldName.setBounds(187, 189, 324, 28);
		frmUpdateFacultyDetails.getContentPane().add(fieldName);

		fieldFathersName = new JTextField();
		fieldFathersName.setEnabled(false);
		fieldFathersName.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldFathersName.setColumns(10);
		fieldFathersName.setBounds(187, 227, 324, 28);
		frmUpdateFacultyDetails.getContentPane().add(fieldFathersName);

		fieldAge = new JTextField();
		fieldAge.setEnabled(false);
		fieldAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldAge.setColumns(10);
		fieldAge.setBounds(187, 303, 324, 28);
		frmUpdateFacultyDetails.getContentPane().add(fieldAge);

		fieldAddress = new JTextField();
		fieldAddress.setEnabled(false);
		fieldAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldAddress.setColumns(10);
		fieldAddress.setBounds(187, 341, 324, 28);
		frmUpdateFacultyDetails.getContentPane().add(fieldAddress);

		fieldPhoneNumber = new JTextField();
		fieldPhoneNumber.setEnabled(false);
		fieldPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldPhoneNumber.setColumns(10);
		fieldPhoneNumber.setBounds(187, 379, 324, 28);
		frmUpdateFacultyDetails.getContentPane().add(fieldPhoneNumber);

		fieldEmail = new JTextField();
		fieldEmail.setEnabled(false);
		fieldEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldEmail.setColumns(10);
		fieldEmail.setBounds(187, 417, 324, 28);
		frmUpdateFacultyDetails.getContentPane().add(fieldEmail);

		fieldEducation = new JTextField();
		fieldEducation.setEnabled(false);
		fieldEducation.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldEducation.setColumns(10);
		fieldEducation.setBounds(187, 455, 324, 28);
		frmUpdateFacultyDetails.getContentPane().add(fieldEducation);

		JButton btnFetch = new JButton("Fetch");
		btnFetch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c2.setEnabled(false);
				try {
					MySQLConnection con = new MySQLConnection();
					String query = "select * from faculty where empId = '" + c2.getSelectedItem() + "'";
					java.sql.ResultSet rs = con.stmt.executeQuery(query);

					while (rs.next()) {
						fieldName.setText(rs.getString("name"));
						fieldFathersName.setText(rs.getString("fatherName"));
						fieldAge.setText(rs.getString("age"));
						fieldAddress.setText(rs.getString("address"));
						fieldGender.setText(rs.getString("gender"));
						fieldEmail.setText(rs.getString("email"));
						fieldPhoneNumber.setText(rs.getString("phoneNumber"));
						fieldEducation.setText(rs.getString("education"));
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				fieldName.setEnabled(true);
				fieldFathersName.setEnabled(true);
				fieldAge.setEnabled(true);
				fieldAddress.setEnabled(true);
				comboBox.setEnabled(true);
				fieldGender.setEnabled(true);
				fieldEmail.setEnabled(true);
				fieldPhoneNumber.setEnabled(true);
				fieldEducation.setEnabled(true);
				btnUpdate.setEnabled(true);
			}
		});
		btnFetch.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnFetch.setBackground(Color.WHITE);
		btnFetch.setBounds(234, 93, 115, 28);
		frmUpdateFacultyDetails.getContentPane().add(btnFetch);
		frmUpdateFacultyDetails.setLocationRelativeTo(null);

		fieldGender = new JTextField();
		fieldGender.setFont(new Font("Tahoma", Font.BOLD, 16));
		fieldGender.setEnabled(false);
		fieldGender.setColumns(10);
		fieldGender.setBounds(187, 265, 324, 28);
		frmUpdateFacultyDetails.getContentPane().add(fieldGender);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(48, 142, 462, 2);
		frmUpdateFacultyDetails.getContentPane().add(separator);

	}

}
