package universitymanagement;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import jdk.jfr.Percentage;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowResult {

	private JFrame frmResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowResult window = new ShowResult();
					window.frmResult.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowResult() {
		initialize();
	}

	public String str1;
	JTable marksTable;
	String marksString[];

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResult = new JFrame();
		frmResult.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmResult.setTitle("Result");
		frmResult.setResizable(false);
		frmResult.getContentPane().setBackground(Color.WHITE);
		frmResult.setBounds(100, 100, 450, 486);
		frmResult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmResult.getContentPane().setLayout(null);
		frmResult.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Select Student Roll Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 27, 262, 30);
		frmResult.getContentPane().add(lblNewLabel);

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
		frmResult.getContentPane().setLayout(null);
		frmResult.getContentPane().add(c2);

		JButton btnCheck = new JButton("Check");
		btnCheck.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCheck.setBackground(Color.WHITE);
		btnCheck.setBounds(155, 107, 115, 28);
		frmResult.getContentPane().add(btnCheck);

		String x[] = { "Subjects", "Marks" };
		String y[][] = new String[5][2];

		marksTable = new JTable(y, x);
		marksTable.setRowSelectionAllowed(false);
		JScrollPane sp = new JScrollPane(marksTable);
		sp.setBounds(10, 143, 419, 106);
		frmResult.getContentPane().add(sp);

		JLabel lblGrade = new JLabel("Grade:");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGrade.setBounds(45, 266, 71, 30);
		frmResult.getContentPane().add(lblGrade);

		JLabel lblPercentage = new JLabel("Percentage:");
		lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPercentage.setBounds(10, 306, 106, 30);
		frmResult.getContentPane().add(lblPercentage);

		JLabel perlbl = new JLabel("");
		perlbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		perlbl.setBounds(129, 306, 291, 30);
		frmResult.getContentPane().add(perlbl);

		JLabel gradelbl = new JLabel("");
		gradelbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		gradelbl.setBounds(129, 266, 291, 30);
		frmResult.getContentPane().add(gradelbl);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmResult.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(97, 346, 115, 28);
		frmResult.getContentPane().add(btnCancel);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int marks[] = new int[marksString.length];
				double total = 0;
				for (int i = 0; i < marksString.length; i++) {
					marks[i] = Integer.parseInt(marksString[i]);
				}
				for (int i = 0; i < marks.length; i++) {
					total = total + marks[i];
				}
				double percentage = (total * 100) / 500;
				perlbl.setVisible(false);
				gradelbl.setVisible(false);

				JLabel perlbl = new JLabel(String.valueOf(percentage));
				perlbl.setFont(new Font("Tahoma", Font.BOLD, 18));
				perlbl.setBounds(129, 306, 291, 30);
				frmResult.getContentPane().add(perlbl);

				JLabel gradelbl;
				if (percentage <= 100 && percentage >= 90) {
					gradelbl = new JLabel("A+");
				} else if (percentage < 90 && percentage >= 80) {
					gradelbl = new JLabel("A");
				} else if (percentage < 80 && percentage >= 70) {
					gradelbl = new JLabel("B");
				} else if (percentage < 70 && percentage >= 60) {
					gradelbl = new JLabel("C");
				} else if (percentage < 60 && percentage >= 50) {
					gradelbl = new JLabel("D");
				} else {
					gradelbl = new JLabel("Fail");
				}
				gradelbl.setFont(new Font("Tahoma", Font.BOLD, 18));
				gradelbl.setBounds(129, 266, 291, 30);
				frmResult.getContentPane().add(gradelbl);
			}
		});
		btnCalculate.setEnabled(false);
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.setBounds(226, 346, 115, 28);
		frmResult.getContentPane().add(btnCalculate);

		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalculate.setEnabled(true);

				sp.setVisible(false);
				c2.enable(false);
				int i = 0, j = 0;
				str1 = "select * from marks where rollno = '" + c2.getSelectedItem() + "';";
				try {
					MySQLConnection con = new MySQLConnection();
					java.sql.ResultSet rs = con.stmt.executeQuery(str1);
					while (rs.next()) {
						y[i][j++] = rs.getString("subject");
						y[i][j++] = rs.getString("marks");
						i++;
						j = 0;
						marksTable = new JTable(y, x);
						marksTable.setRowSelectionAllowed(false);
						JScrollPane sp = new JScrollPane(marksTable);
						sp.setBounds(10, 143, 419, 106);
						frmResult.getContentPane().add(sp);
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				marksString = new String[5];
				try {
					int k = 0;
					MySQLConnection con = new MySQLConnection();
					java.sql.ResultSet rs = con.stmt.executeQuery(str1);
					while (rs.next()) {
						marksString[k] = rs.getString("marks");
						k++;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
	}

}
