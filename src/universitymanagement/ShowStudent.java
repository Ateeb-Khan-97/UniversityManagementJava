package universitymanagement;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;

import javax.swing.table.DefaultTableModel;

import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowStudent extends Thread {

	private JFrame frmStudentDetails;
	private JTextField rollField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStudent window = new ShowStudent();
					window.frmStudentDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ShowStudent() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmStudentDetails = new JFrame();
		frmStudentDetails.setTitle("Student Details");
		frmStudentDetails.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\Logo.png"));
		frmStudentDetails.setResizable(false);
		frmStudentDetails.getContentPane().setBackground(Color.WHITE);
		frmStudentDetails.setBounds(100, 100, 1253, 522);
		frmStudentDetails.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmStudentDetails.getContentPane().setLayout(null);
		frmStudentDetails.setLocationRelativeTo(null);

		JLabel lblStudents = new JLabel("Students List");
		lblStudents.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudents.setForeground(Color.BLACK);
		lblStudents.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblStudents.setBounds(515, 20, 137, 38);
		frmStudentDetails.getContentPane().add(lblStudents);

		JTable t1;
		String x[] = { "Name", "Father's Name", "Roll Number", "Gender", "Age", "Address", "Phone Number",
				"Email Address", "Matric %", "Inter %", "Department" };
		String y[][] = new String[20][11];
		int i = 0, j = 0;
		try {
			MySQLConnection con = new MySQLConnection();
			String str1 = "select * from student";
			ResultSet rs = con.stmt.executeQuery(str1);
			while (rs.next()) {
				y[i][j++] = rs.getString("name");
				y[i][j++] = rs.getString("fatherName");
				y[i][j++] = rs.getString("rollno");
				y[i][j++] = rs.getString("gender");
				y[i][j++] = rs.getString("age");
				y[i][j++] = rs.getString("address");
				y[i][j++] = rs.getString("phoneNumber");
				y[i][j++] = rs.getString("email");
				y[i][j++] = rs.getString("matricper");
				y[i][j++] = rs.getString("interper");
				y[i][j++] = rs.getString("department");
				i++;
				j = 0;
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		t1 = new JTable(y, x);
		t1.setRowSelectionAllowed(false);
		JScrollPane sp = new JScrollPane(t1);
		sp.setBounds(22, 68, 1195, 330);
		frmStudentDetails.getContentPane().add(sp);

		JLabel lblEnterRollNumber = new JLabel("Enter Roll Number:");
		lblEnterRollNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterRollNumber.setForeground(Color.BLACK);
		lblEnterRollNumber.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblEnterRollNumber.setBounds(22, 419, 195, 38);
		frmStudentDetails.getContentPane().add(lblEnterRollNumber);

		rollField = new JTextField();
		rollField.setBounds(227, 422, 195, 38);
		frmStudentDetails.getContentPane().add(rollField);
		rollField.setColumns(10);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					MySQLConnection conn = new MySQLConnection();
					String query = "delete from student where rollno='" + rollField.getText() + "'";
					conn.stmt.executeUpdate(query);
					frmStudentDetails.dispose();
					universitymanagement.ShowStudent.main(null);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(432, 426, 115, 28);
		frmStudentDetails.getContentPane().add(btnDelete);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStudentDetails.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(682, 426, 115, 28);
		frmStudentDetails.getContentPane().add(btnBack);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentDetails.dispose();
				universitymanagement.UpdateStudent.main(null);
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(557, 426, 115, 28);
		frmStudentDetails.getContentPane().add(btnUpdate);
	}
}