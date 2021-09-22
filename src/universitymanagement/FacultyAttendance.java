package universitymanagement;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Choice;
import java.awt.Color;

public class FacultyAttendance {

	private JFrame frmFacultyAttendance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyAttendance window = new FacultyAttendance();
					window.frmFacultyAttendance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FacultyAttendance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFacultyAttendance = new JFrame();
		frmFacultyAttendance.getContentPane().setBackground(Color.WHITE);
		frmFacultyAttendance.getContentPane().setLayout(null);
		frmFacultyAttendance
				.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmFacultyAttendance.setResizable(false);
		frmFacultyAttendance.setTitle("Faculty Attendance");
		frmFacultyAttendance.setBounds(100, 100, 450, 268);
		frmFacultyAttendance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFacultyAttendance.setLocationRelativeTo(null);

		Choice c2 = new Choice();
		c2.setBounds(10, 63, 410, 18);
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
		frmFacultyAttendance.getContentPane().setLayout(null);
		frmFacultyAttendance.getContentPane().add(c2);

		JLabel lblNewLabel = new JLabel("Select Employee Id:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 27, 174, 30);
		frmFacultyAttendance.getContentPane().add(lblNewLabel);

		JRadioButton rdbtnPresent = new JRadioButton("Present");
		rdbtnPresent.setSelected(true);
		rdbtnPresent.setBackground(Color.WHITE);
		rdbtnPresent.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnPresent.setBounds(6, 110, 414, 21);
		frmFacultyAttendance.getContentPane().add(rdbtnPresent);

		JRadioButton rdbtnAbsent = new JRadioButton("Absent");
		rdbtnAbsent.setBackground(Color.WHITE);
		rdbtnAbsent.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnAbsent.setBounds(6, 133, 414, 21);
		frmFacultyAttendance.getContentPane().add(rdbtnAbsent);

		JRadioButton rdbtnLeave = new JRadioButton("Leave\r\n\t");
		rdbtnLeave.setBackground(Color.WHITE);
		rdbtnLeave.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnLeave.setBounds(6, 156, 414, 21);
		frmFacultyAttendance.getContentPane().add(rdbtnLeave);

		ButtonGroup attendanceGroup = new ButtonGroup();
		attendanceGroup.add(rdbtnLeave);
		attendanceGroup.add(rdbtnAbsent);
		attendanceGroup.add(rdbtnPresent);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String date = new java.util.Date().toString();
					String empId = c2.getSelectedItem();
					String attendance;
					if (rdbtnPresent.isSelected()) {
						attendance = "Present";
					} else if (rdbtnLeave.isSelected()) {
						attendance = "Leave";
					} else {
						attendance = "Absent";
					}
					String query = "insert into attendance_faculty values('" + empId + "','" + date + "','" + attendance
							+ "')";
					MySQLConnection conn = new MySQLConnection();
					conn.stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Attendance Confirmed");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(113, 183, 85, 35);
		frmFacultyAttendance.getContentPane().add(btnNewButton);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFacultyAttendance.dispose();
				universitymanagement.UniversityManagement.main(null);

			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(208, 183, 85, 35);
		frmFacultyAttendance.getContentPane().add(btnCancel);
	}

}
