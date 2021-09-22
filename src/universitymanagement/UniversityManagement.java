package universitymanagement;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;

public class UniversityManagement {

	private JFrame frmUniversityManagement;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UniversityManagement window = new UniversityManagement();
					window.frmUniversityManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UniversityManagement() {
		initialize();
	}

	private void initialize() {
		frmUniversityManagement = new JFrame();
		frmUniversityManagement.setResizable(false);
		frmUniversityManagement.setAlwaysOnTop(true);
		frmUniversityManagement.getContentPane().setBackground(Color.WHITE);
		frmUniversityManagement.setTitle("Sir Syed University of Engineering and Technology");
		frmUniversityManagement
				.setIconImage(Toolkit.getDefaultToolkit().getImage("/logo.png"));
		frmUniversityManagement.setBounds(100, 100, 708, 450);
		frmUniversityManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUniversityManagement.getContentPane().setLayout(null);
		frmUniversityManagement.setLocationRelativeTo(null);
		Image img = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();

		JButton btnNewButton = new JButton("");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					frmUniversityManagement.dispose();
					universitymanagement.Login.main(null);
				}

			}
		});
		btnNewButton.setSelectedIcon(new ImageIcon("/logout.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmUniversityManagement.dispose();
				universitymanagement.Login.main(null);
			}
		});
		btnNewButton.setToolTipText("Logout");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton.setIcon(new ImageIcon("/logout.png"));
		btnNewButton.setBounds(632, 326, 50, 50);
		frmUniversityManagement.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, -11, 708, 411);
		frmUniversityManagement.getContentPane().add(lblNewLabel);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		frmUniversityManagement.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Student");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("New Student");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				universitymanagement.NewStudent.main(null);
				frmUniversityManagement.dispose();
			}
		});
		mntmNewMenuItem.setBackground(Color.WHITE);
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Show Students");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				universitymanagement.ShowStudent.main(null);
				frmUniversityManagement.dispose();
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_1 = new JMenu("Faculty");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New Teacher");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUniversityManagement.dispose();
				universitymanagement.NewFaculty.main(null);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Show Teacher");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUniversityManagement.dispose();
				universitymanagement.ShowFaculty.main(null);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem_3.setBackground(Color.WHITE);
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_3 = new JMenu("Attendance");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Student Attendance");
		mntmNewMenuItem_5.setBackground(Color.WHITE);
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUniversityManagement.dispose();
				universitymanagement.StudentAttendance.main(null);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_3.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Faculty Attendance");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUniversityManagement.dispose();
				universitymanagement.FacultyAttendance.main(null);
			}
		});
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem_6.setBackground(Color.WHITE);
		mnNewMenu_3.add(mntmNewMenuItem_6);

		JMenu mnNewMenu_4 = new JMenu("Attendance Details");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Student Attendance Details");
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmUniversityManagement.dispose();
				universitymanagement.StudentAttendanceDetail.main(null);
			}
		});
		mntmNewMenuItem_7.setBackground(Color.WHITE);
		mnNewMenu_4.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Faculty Attendance Details");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmUniversityManagement.dispose();
				universitymanagement.FacultyAttendanceDetails.main(null);
			}
		});
		mntmNewMenuItem_8.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem_8.setBackground(Color.WHITE);
		mnNewMenu_4.add(mntmNewMenuItem_8);

		JMenu mnNewMenu_5 = new JMenu("Examination");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_5.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_5);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Enter Marks");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUniversityManagement.dispose();
				universitymanagement.StudentMarks.main(null);
			}
		});
		mntmNewMenuItem_9.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem_9.setBackground(Color.WHITE);
		mnNewMenu_5.add(mntmNewMenuItem_9);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Show Result");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUniversityManagement.dispose();
				universitymanagement.ShowResult.main(null);
			}
		});
		mntmNewMenuItem_10.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem_10.setBackground(Color.WHITE);
		mnNewMenu_5.add(mntmNewMenuItem_10);

		JMenu mnNewMenu_6 = new JMenu("Fee Details");
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_6);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Fee Structure");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmUniversityManagement.dispose();
				universitymanagement.FeeDetails.main(null);
			}
		});
		mntmNewMenuItem_11.setBackground(Color.WHITE);
		mntmNewMenuItem_11.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_6.add(mntmNewMenuItem_11);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Student Fee Form");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUniversityManagement.dispose();
				universitymanagement.SubmitFees.main(null);
			}
		});
		mntmNewMenuItem_12.setBackground(Color.WHITE);
		mntmNewMenuItem_12.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_6.add(mntmNewMenuItem_12);

		JMenu mnNewMenu_2 = new JMenu("About");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About Us");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UNDEFINED, 0));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUniversityManagement.dispose();
				universitymanagement.AboutUs.main(null);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNewMenuItem_4.setBackground(Color.WHITE);
		mnNewMenu_2.add(mntmNewMenuItem_4);
	}
}
