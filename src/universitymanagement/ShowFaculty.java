package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowFaculty {

	private JFrame frmFacultyDetails;
	private JTextField empIdField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowFaculty window = new ShowFaculty();
					window.frmFacultyDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowFaculty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFacultyDetails = new JFrame();
		frmFacultyDetails.getContentPane().setBackground(Color.WHITE);
		frmFacultyDetails.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmFacultyDetails.setResizable(false);
		frmFacultyDetails.setTitle("Faculty Details");
		frmFacultyDetails.setBounds(100, 100, 1253, 507);
		frmFacultyDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFacultyDetails.getContentPane().setLayout(null);
		frmFacultyDetails.setLocationRelativeTo(null);

		JLabel lblStudents = new JLabel("Faculty List");
		lblStudents.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudents.setForeground(Color.BLACK);
		lblStudents.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblStudents.setBounds(614, 10, 137, 38);
		frmFacultyDetails.getContentPane().add(lblStudents);

		JTable facultyTable;
		String x[] = { "Name", "Father's Name", "Employee ID", "Gender", "Age", "Address", "Phone Number",
				"Email Address", "Education", "Department" };
		String y[][] = new String[20][10];
		int i = 0, j = 0;
		try {
			MySQLConnection con = new MySQLConnection();
			String str1 = "select * from faculty";
			ResultSet rs = con.stmt.executeQuery(str1);
			while (rs.next()) {
				y[i][j++] = rs.getString("name");
				y[i][j++] = rs.getString("fatherName");
				y[i][j++] = rs.getString("empId");
				y[i][j++] = rs.getString("gender");
				y[i][j++] = rs.getString("age");
				y[i][j++] = rs.getString("address");
				y[i][j++] = rs.getString("phoneNumber");
				y[i][j++] = rs.getString("email");
				y[i][j++] = rs.getString("education");
				y[i][j++] = rs.getString("department");
				i++;
				j = 0;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		facultyTable = new JTable(y, x);
		facultyTable.setRowSelectionAllowed(false);
		JScrollPane sp = new JScrollPane(facultyTable);
		sp.setBounds(22, 68, 1195, 330);
		frmFacultyDetails.getContentPane().add(sp);

		JLabel lblEnterEmployeeId = new JLabel("Enter Employee ID:");
		lblEnterEmployeeId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterEmployeeId.setForeground(Color.BLACK);
		lblEnterEmployeeId.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblEnterEmployeeId.setBounds(22, 418, 236, 28);
		frmFacultyDetails.getContentPane().add(lblEnterEmployeeId);

		empIdField = new JTextField();
		empIdField.setColumns(10);
		empIdField.setBounds(268, 413, 195, 38);
		frmFacultyDetails.getContentPane().add(empIdField);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFacultyDetails.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(723, 420, 115, 28);
		frmFacultyDetails.getContentPane().add(btnBack);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MySQLConnection conn = new MySQLConnection();
					String query = "delete from faculty where empId='" + empIdField.getText() + "'";
					conn.stmt.executeUpdate(query);
					frmFacultyDetails.dispose();
					universitymanagement.ShowFaculty.main(null);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(473, 420, 115, 28);
		frmFacultyDetails.getContentPane().add(btnDelete);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFacultyDetails.dispose();
				universitymanagement.UpdateFaculty.main(null);
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(598, 420, 115, 28);
		frmFacultyDetails.getContentPane().add(btnUpdate);
	}
}
