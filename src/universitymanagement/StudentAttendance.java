package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


import java.awt.Toolkit;
import java.awt.Choice;
import java.awt.Color;
import java.sql.*;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentAttendance {

	private JFrame frmStudentAttendance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAttendance window = new StudentAttendance();
					window.frmStudentAttendance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentAttendance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentAttendance = new JFrame();
		frmStudentAttendance.getContentPane().setBackground(Color.WHITE);
		frmStudentAttendance
				.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmStudentAttendance.setTitle("Student Attendance");
		frmStudentAttendance.setResizable(false);
		frmStudentAttendance.setBounds(100, 100, 450, 268);
		frmStudentAttendance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentAttendance.setLocationRelativeTo(null);

		Choice c2 = new Choice();
		c2.setBounds(10, 63, 410, 18);
		try {
			MySQLConnection conn = new MySQLConnection();
			String query = "select * from student";
			java.sql.ResultSet rs = conn.stmt.executeQuery(query);
			while (rs.next()) {
				c2.add(rs.getString("rollno"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(frmStudentAttendance, e);
		}
		frmStudentAttendance.getContentPane().setLayout(null);
		frmStudentAttendance.getContentPane().add(c2);

		JLabel lblNewLabel = new JLabel("Select Roll Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 27, 174, 30);
		frmStudentAttendance.getContentPane().add(lblNewLabel);

		JRadioButton rdbtnPresent = new JRadioButton("Present");
		rdbtnPresent.setSelected(true);
		rdbtnPresent.setBackground(Color.WHITE);
		rdbtnPresent.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnPresent.setBounds(6, 110, 414, 21);
		frmStudentAttendance.getContentPane().add(rdbtnPresent);

		JRadioButton rdbtnAbsent = new JRadioButton("Absent");
		rdbtnAbsent.setBackground(Color.WHITE);
		rdbtnAbsent.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnAbsent.setBounds(6, 133, 414, 21);
		frmStudentAttendance.getContentPane().add(rdbtnAbsent);

		JRadioButton rdbtnLeave = new JRadioButton("Leave\r\n\t");
		rdbtnLeave.setBackground(Color.WHITE);
		rdbtnLeave.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnLeave.setBounds(6, 156, 414, 21);
		frmStudentAttendance.getContentPane().add(rdbtnLeave);

		ButtonGroup attendanceGroup = new ButtonGroup();
		attendanceGroup.add(rdbtnLeave);
		attendanceGroup.add(rdbtnAbsent);
		attendanceGroup.add(rdbtnPresent);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String date = new java.util.Date().toString();
					String rollNo = c2.getSelectedItem();
					String attendance;
					if (rdbtnPresent.isSelected()) {
						attendance = "Present";
					} else if (rdbtnLeave.isSelected()) {
						attendance = "Leave";
					} else {
						attendance = "Absent";
					}
					String query = "insert into attendance_student values('" + rollNo + "','" + date + "','"
							+ attendance + "')";
					MySQLConnection conn = new MySQLConnection();
					conn.stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(frmStudentAttendance, "Attendance Confirmed");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(113, 183, 85, 35);
		frmStudentAttendance.getContentPane().add(btnNewButton);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentAttendance.dispose();
				universitymanagement.UniversityManagement.main(null);

			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(208, 183, 85, 35);
		frmStudentAttendance.getContentPane().add(btnCancel);
	}

}
