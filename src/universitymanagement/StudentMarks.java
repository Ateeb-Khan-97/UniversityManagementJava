package universitymanagement;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frmMarks;
	private JTextField subject1Field;
	private JTextField subject2Field;
	private JTextField subjectField3;
	private JTextField subjectField4;
	private JTextField subjectField5;
	private JTextField markField1;
	private JTextField markField2;
	private JTextField markField3;
	private JTextField markField4;
	private JTextField markField5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
					window.frmMarks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMarks = new JFrame();
		frmMarks.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmMarks.setTitle("Marks");
		frmMarks.setResizable(false);
		frmMarks.getContentPane().setBackground(Color.WHITE);
		frmMarks.setBounds(100, 100, 450, 486);
		frmMarks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMarks.getContentPane().setLayout(null);
		frmMarks.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Select Student Roll Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 27, 262, 30);
		frmMarks.getContentPane().add(lblNewLabel);

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
			JOptionPane.showMessageDialog(null, e);
		}
		frmMarks.getContentPane().setLayout(null);
		frmMarks.getContentPane().add(c2);

		JLabel lblEnterMarks = new JLabel("Enter Subjects");
		lblEnterMarks.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterMarks.setBounds(10, 110, 195, 30);
		frmMarks.getContentPane().add(lblEnterMarks);

		JLabel lblEnterMarks_1 = new JLabel("Enter Marks");
		lblEnterMarks_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterMarks_1.setBounds(241, 110, 195, 30);
		frmMarks.getContentPane().add(lblEnterMarks_1);

		subject1Field = new JTextField();
		subject1Field.setBounds(10, 150, 195, 30);
		frmMarks.getContentPane().add(subject1Field);
		subject1Field.setColumns(10);

		subject2Field = new JTextField();
		subject2Field.setColumns(10);
		subject2Field.setBounds(10, 189, 195, 30);
		frmMarks.getContentPane().add(subject2Field);

		subjectField3 = new JTextField();
		subjectField3.setColumns(10);
		subjectField3.setBounds(10, 229, 195, 30);
		frmMarks.getContentPane().add(subjectField3);

		subjectField4 = new JTextField();
		subjectField4.setColumns(10);
		subjectField4.setBounds(10, 269, 195, 30);
		frmMarks.getContentPane().add(subjectField4);

		subjectField5 = new JTextField();
		subjectField5.setColumns(10);
		subjectField5.setBounds(10, 309, 195, 30);
		frmMarks.getContentPane().add(subjectField5);

		markField1 = new JTextField();
		markField1.setColumns(10);
		markField1.setBounds(225, 150, 195, 30);
		frmMarks.getContentPane().add(markField1);

		markField2 = new JTextField();
		markField2.setColumns(10);
		markField2.setBounds(225, 189, 195, 30);
		frmMarks.getContentPane().add(markField2);

		markField3 = new JTextField();
		markField3.setColumns(10);
		markField3.setBounds(225, 229, 195, 30);
		frmMarks.getContentPane().add(markField3);

		markField4 = new JTextField();
		markField4.setColumns(10);
		markField4.setBounds(225, 269, 195, 30);
		frmMarks.getContentPane().add(markField4);

		markField5 = new JTextField();
		markField5.setColumns(10);
		markField5.setBounds(225, 309, 195, 30);
		frmMarks.getContentPane().add(markField5);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 100, 410, 2);
		frmMarks.getContentPane().add(separator);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j = 0;
				try {
					MySQLConnection con = new MySQLConnection();
					ResultSet rs = con.stmt.executeQuery("select * from marks");
					while (rs.next()) {
						if (rs.getString("rollno").equalsIgnoreCase(c2.getSelectedItem())) {
							JOptionPane.showMessageDialog(null, "Student Marks are already inserted!");
							j = 1;
							break;
						}
						break;
					}

				} catch (Exception ex) {
				}
				if (j == 0) {
					if (subject1Field.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (subject2Field.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (subjectField3.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (subjectField4.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (subjectField5.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (markField1.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (markField2.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (markField3.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (markField4.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else if (markField5.getText().length() == 0) {
						JOptionPane.showMessageDialog(null, "Please Fill details!");
					} else {
						String subjects[] = { subject1Field.getText(), subject2Field.getText(), subjectField3.getText(),
								subjectField4.getText(), subjectField5.getText() };
						String marks[] = { markField1.getText(), markField2.getText(), markField3.getText(),
								markField4.getText(), markField5.getText() };

						try {
							MySQLConnection con = new MySQLConnection();
							for (int i = 0; i < marks.length; i++) {
								String query = "insert into marks values('" + c2.getSelectedItem() + "','" + subjects[i]
										+ "','" + marks[i] + "')";
								con.stmt.executeUpdate(query);
							}
							JOptionPane.showMessageDialog(null, "Marks Added Successfully!");
							frmMarks.dispose();
							universitymanagement.UniversityManagement.main(null);
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1);
						}

					}
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(220, 385, 115, 28);
		frmMarks.getContentPane().add(btnSubmit);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMarks.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(95, 385, 115, 28);
		frmMarks.getContentPane().add(btnCancel);
	}
}
