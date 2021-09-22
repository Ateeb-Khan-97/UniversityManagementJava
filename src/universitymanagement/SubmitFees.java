package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class SubmitFees {

	private JFrame frmSubmitFees;
	private JTextField fieldName;
	private JTextField fieldFathersName;
	private JTextField fieldDepartment;
	private JTextField fieldfee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubmitFees window = new SubmitFees();
					window.frmSubmitFees.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SubmitFees() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubmitFees = new JFrame();
		frmSubmitFees.setTitle("Submit Fees");
		frmSubmitFees.setResizable(false);
		frmSubmitFees.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmSubmitFees.getContentPane().setBackground(Color.WHITE);
		frmSubmitFees.setBounds(100, 100, 450, 300);
		frmSubmitFees.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubmitFees.getContentPane().setLayout(null);
		frmSubmitFees.setLocationRelativeTo(null);

		Choice c2 = new Choice();
		c2.setSize(181, 18);
		c2.setLocation(196, 25);
		try {
			MySQLConnection con = new MySQLConnection();
			ResultSet rs = con.stmt.executeQuery("select * from student");
			while (rs.next()) {
				c2.add(rs.getString("rollno"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		frmSubmitFees.getContentPane().add(c2);

		JLabel lblNewLabel = new JLabel("Select Roll Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(29, 30, 143, 13);
		frmSubmitFees.getContentPane().add(lblNewLabel);

		JButton btnSubmit = new JButton("Submit");
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSubmit.setEnabled(true);
				c2.setEnabled(false);
				try {
					MySQLConnection con = new MySQLConnection();
					String query = "select * from student where rollno = '" + c2.getSelectedItem() + "'";
					java.sql.ResultSet rs = con.stmt.executeQuery(query);
					while (rs.next()) {
						fieldName.setText(rs.getString("name"));
						fieldFathersName.setText(rs.getString("fatherName"));
						fieldDepartment.setText(rs.getString("department"));
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
				String department = fieldDepartment.getText();
				if (department.equalsIgnoreCase("Software Engineering")
						|| department.equalsIgnoreCase("Computer Science")
						|| department.equalsIgnoreCase("Computer Engineering")) {
					fieldfee.setText("84000");
				} else {
					fieldfee.setText("120000");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Eclipse\\SCD Project\\img\\check (1).png"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(383, 25, 25, 21);
		frmSubmitFees.getContentPane().add(btnNewButton);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(29, 90, 143, 13);
		frmSubmitFees.getContentPane().add(lblName);

		JLabel lblFathersName = new JLabel("Fathers Name:");
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFathersName.setBounds(29, 113, 143, 13);
		frmSubmitFees.getContentPane().add(lblFathersName);

		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDepartment.setBounds(29, 136, 143, 13);
		frmSubmitFees.getContentPane().add(lblDepartment);

		JLabel lblSemester = new JLabel("Semester:");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSemester.setBounds(29, 159, 143, 13);
		frmSubmitFees.getContentPane().add(lblSemester);

		JLabel lblTotalPayable = new JLabel("Total Payable:");
		lblTotalPayable.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalPayable.setBounds(29, 182, 143, 13);
		frmSubmitFees.getContentPane().add(lblTotalPayable);

		fieldName = new JTextField();
		fieldName.setEditable(false);
		fieldName.setBounds(182, 89, 195, 19);
		frmSubmitFees.getContentPane().add(fieldName);
		fieldName.setColumns(10);

		fieldFathersName = new JTextField();
		fieldFathersName.setEditable(false);
		fieldFathersName.setColumns(10);
		fieldFathersName.setBounds(182, 112, 195, 19);
		frmSubmitFees.getContentPane().add(fieldFathersName);

		fieldDepartment = new JTextField();
		fieldDepartment.setEditable(false);
		fieldDepartment.setColumns(10);
		fieldDepartment.setBounds(182, 135, 195, 19);
		frmSubmitFees.getContentPane().add(fieldDepartment);

		fieldfee = new JTextField();
		fieldfee.setEditable(false);
		fieldfee.setColumns(10);
		fieldfee.setBounds(182, 181, 195, 19);
		frmSubmitFees.getContentPane().add(fieldfee);

		String sem[] = { "First Sem", "Second Sem", "Third Sem", "Fourth Sem", "Fifth Sem", "Sixth Sem", "Seventh Sem",
				"Eighth Sem" };
		JComboBox comboBox = new JComboBox(sem);
		comboBox.setBounds(182, 157, 195, 21);
		frmSubmitFees.getContentPane().add(comboBox);

		btnSubmit.setEnabled(false);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MySQLConnection con = new MySQLConnection();
					String query = "insert into fee values('" + c2.getSelectedItem() + "','" + fieldName.getText()
							+ "','" + fieldFathersName.getText() + "','" + fieldDepartment.getText() + "','"
							+ (String) comboBox.getSelectedItem() + "','" + fieldfee.getText() + "')";
					con.stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Fees Submitted!", "Success", JOptionPane.DEFAULT_OPTION);
					frmSubmitFees.dispose();
					universitymanagement.SubmitFees.main(null);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(216, 210, 115, 28);
		frmSubmitFees.getContentPane().add(btnSubmit);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmSubmitFees.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(91, 210, 115, 28);
		frmSubmitFees.getContentPane().add(btnCancel);
	}
}
