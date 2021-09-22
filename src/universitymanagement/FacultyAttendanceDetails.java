package universitymanagement;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class FacultyAttendanceDetails {

	private JFrame frmFacultyAttendance;
	private JTextField empIdField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyAttendanceDetails window = new FacultyAttendanceDetails();
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
	public FacultyAttendanceDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFacultyAttendance = new JFrame();
		frmFacultyAttendance
				.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmFacultyAttendance.setResizable(false);
		frmFacultyAttendance.setTitle("Faculty Attendance");
		frmFacultyAttendance.getContentPane().setBackground(Color.WHITE);
		frmFacultyAttendance.setBounds(450, 150, 800, 331);
		frmFacultyAttendance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFacultyAttendance.getContentPane().setLayout(null);
		frmFacultyAttendance.setLocationRelativeTo(null);

		JTable facultyTable;
		String x[] = { "Employee ID", "Date Time", "Attendance" };
		String y[][] = new String[20][3];
		int i = 0, j = 0;
		try {
			MySQLConnection con = new MySQLConnection();
			String str1 = "select * from attendance_faculty;";
			java.sql.ResultSet rs = con.stmt.executeQuery(str1);
			while (rs.next()) {
				y[i][j++] = rs.getString("empId");
				y[i][j++] = rs.getString("date");
				y[i][j++] = rs.getString("attendance");
				i++;
				j = 0;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmFacultyAttendance.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(641, 247, 128, 33);
		frmFacultyAttendance.getContentPane().add(btnNewButton);
		facultyTable = new JTable(y, x);
		facultyTable.setRowSelectionAllowed(false);
		JScrollPane sp = new JScrollPane(facultyTable);
		sp.setBounds(0, 0, 786, 237);
		frmFacultyAttendance.getContentPane().add(sp);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MySQLConnection conn = new MySQLConnection();
				String query = "delete from attendance_faculty where empId='" + empIdField.getText() + "'";
				try {
					conn.stmt.executeUpdate(query);
					frmFacultyAttendance.dispose();
					universitymanagement.FacultyAttendanceDetails.main(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(503, 247, 128, 33);
		frmFacultyAttendance.getContentPane().add(btnDelete);

		empIdField = new JTextField();
		empIdField.setColumns(10);
		empIdField.setBounds(192, 247, 301, 33);
		frmFacultyAttendance.getContentPane().add(empIdField);

		JLabel lblEnterEmployeeId = new JLabel("Enter Employee ID:");
		lblEnterEmployeeId.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterEmployeeId.setBounds(10, 247, 172, 30);
		frmFacultyAttendance.getContentPane().add(lblEnterEmployeeId);
	}

}
