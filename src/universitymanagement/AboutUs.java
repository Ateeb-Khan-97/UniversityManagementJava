package universitymanagement;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class AboutUs {

	private JFrame frmAboutUs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs window = new AboutUs();
					window.frmAboutUs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutUs = new JFrame();
		frmAboutUs.setResizable(false);
		frmAboutUs.setType(Type.POPUP);
		frmAboutUs.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmAboutUs.getContentPane().setBackground(Color.WHITE);
		frmAboutUs.setTitle("About Us");
		frmAboutUs.setBounds(100, 100, 584, 754);
		frmAboutUs.setLocationRelativeTo(null);
		frmAboutUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));

		JLabel lblNewLabel = new JLabel("Sir Syed University of Engineering & Technology (SSUET)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JLabel lblSoftwareEngineeringDepartment = new JLabel("Software Engineering Department");
		lblSoftwareEngineeringDepartment.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoftwareEngineeringDepartment.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JLabel lblUniversityManagementSystme = new JLabel("University Management System\r\n\t\r\n");
		lblUniversityManagementSystme.setHorizontalAlignment(SwingConstants.CENTER);
		lblUniversityManagementSystme.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JLabel lblDevelopedBy = new JLabel("Developed By:");
		lblDevelopedBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevelopedBy.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JLabel lblAteebKhanse = new JLabel("Ateeb Khan (2019-SE-097)");
		lblAteebKhanse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAteebKhanse.setFont(new Font("Times New Roman", Font.BOLD, 18));

		JLabel lblShayanSheikhse = new JLabel("Shayan Sheikh (2019-SE-094)");
		lblShayanSheikhse.setHorizontalAlignment(SwingConstants.CENTER);
		lblShayanSheikhse.setFont(new Font("Times New Roman", Font.BOLD, 18));

		JLabel lblSaadAzharse = new JLabel("Saad Azhar (2019-SE-074)");
		lblSaadAzharse.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaadAzharse.setFont(new Font("Times New Roman", Font.BOLD, 18));

		JLabel lblFabehaQadirse = new JLabel("Fabeha Qadir (2019-SE-076)");
		lblFabehaQadirse.setHorizontalAlignment(SwingConstants.CENTER);
		lblFabehaQadirse.setFont(new Font("Times New Roman", Font.BOLD, 18));

		JLabel lblProject = new JLabel("Project");
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JLabel lblCourseTeacher = new JLabel("Course Teacher:");
		lblCourseTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseTeacher.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

		JLabel lblMissNudhrat = new JLabel("Miss Nudhrat");
		lblMissNudhrat.setHorizontalAlignment(SwingConstants.CENTER);
		lblMissNudhrat.setFont(new Font("Times New Roman", Font.BOLD, 18));

		JLabel lblMissFatima = new JLabel("Miss Fatima");
		lblMissFatima.setHorizontalAlignment(SwingConstants.CENTER);
		lblMissFatima.setFont(new Font("Times New Roman", Font.BOLD, 18));

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					frmAboutUs.dispose();
					universitymanagement.UniversityManagement.main(null);
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAboutUs.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		GroupLayout groupLayout = new GroupLayout(frmAboutUs.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout
				.createParallelGroup(
						Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
								.addComponent(lblSoftwareEngineeringDepartment, GroupLayout.DEFAULT_SIZE, 469,
										Short.MAX_VALUE))
						.addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE).addGap(43))
				.addGroup(
						groupLayout.createSequentialGroup().addGap(58)
								.addComponent(lblUniversityManagementSystme, GroupLayout.DEFAULT_SIZE, 469,
										Short.MAX_VALUE)
								.addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDevelopedBy, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
								.addComponent(lblProject, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
						.addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addComponent(lblAteebKhanse, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE).addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addComponent(lblShayanSheikhse, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE).addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addComponent(lblSaadAzharse, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE).addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addComponent(lblFabehaQadirse, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE).addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addComponent(lblCourseTeacher, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE).addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addComponent(lblMissNudhrat, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE).addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(58)
						.addComponent(lblMissFatima, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE).addGap(43))
				.addGroup(groupLayout.createSequentialGroup().addGap(223)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(207, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(10)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE).addGap(38))
						.addGroup(groupLayout.createSequentialGroup().addGap(55).addComponent(
								lblSoftwareEngineeringDepartment, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
				.addGap(10).addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE).addGap(10)
				.addComponent(lblUniversityManagementSystme, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE).addGap(20)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(15).addComponent(lblDevelopedBy,
								GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
						.addComponent(lblProject, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGap(10).addComponent(lblAteebKhanse, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE).addGap(10)
				.addComponent(lblShayanSheikhse, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE).addGap(10)
				.addComponent(lblSaadAzharse, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE).addGap(10)
				.addComponent(lblFabehaQadirse, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE).addGap(54)
				.addComponent(lblCourseTeacher, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE).addGap(3)
				.addComponent(lblMissNudhrat, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE).addGap(10)
				.addComponent(lblMissFatima, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE).addGap(26)
				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE).addGap(47)));
		frmAboutUs.getContentPane().setLayout(groupLayout);
	}

}
