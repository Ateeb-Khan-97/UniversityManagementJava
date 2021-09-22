package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;



import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentAttendanceDetail {

	private JFrame frmStudentAttendance;
	private JTextField rollField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAttendanceDetail window = new StudentAttendanceDetail();
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
	public StudentAttendanceDetail() {
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
		frmStudentAttendance.setResizable(false);
		frmStudentAttendance.setTitle("Student Attendance");
		frmStudentAttendance.setBounds(450, 150, 800, 331);
		frmStudentAttendance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentAttendance.getContentPane().setLayout(null);
		frmStudentAttendance.setLocationRelativeTo(null);

		JTable studentTable;
		String x[] = { "Roll Number", "Date Time", "Attendance" };
		String y[][] = new String[20][3];
		int i = 0, j = 0;
		try {
			MySQLConnection con = new MySQLConnection();
			String str1 = "select * from attendance_student;";
			java.sql.ResultSet rs = con.stmt.executeQuery(str1);
			while (rs.next()) {
				y[i][j++] = rs.getString("rollno");
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
				frmStudentAttendance.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(641, 247, 128, 33);
		frmStudentAttendance.getContentPane().add(btnNewButton);
		studentTable = new JTable(y, x);
		studentTable.setRowSelectionAllowed(false);
		JScrollPane sp = new JScrollPane(studentTable);
		sp.setBounds(0, 0, 786, 237);
		frmStudentAttendance.getContentPane().add(sp);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MySQLConnection conn = new MySQLConnection();
					String query = "delete from attendance_student where rollno='" + rollField.getText() + "'";
					conn.stmt.executeUpdate(query);
					frmStudentAttendance.dispose();
					universitymanagement.StudentAttendanceDetail.main(null);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(503, 247, 128, 33);
		frmStudentAttendance.getContentPane().add(btnDelete);

		JLabel lblEnterRollNumber = new JLabel("Enter Roll Number:");
		lblEnterRollNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterRollNumber.setBounds(10, 247, 172, 30);
		frmStudentAttendance.getContentPane().add(lblEnterRollNumber);

		rollField = new JTextField();
		rollField.setBounds(192, 247, 301, 33);
		frmStudentAttendance.getContentPane().add(rollField);
		rollField.setColumns(10);

	}
}
