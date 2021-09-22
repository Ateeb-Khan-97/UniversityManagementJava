package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;

public class FeeDetails {

	private JFrame frmFeeStructure;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeDetails window = new FeeDetails();
					window.frmFeeStructure.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FeeDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFeeStructure = new JFrame();
		frmFeeStructure.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\img\\Logo.png"));
		frmFeeStructure.setTitle("Fee Structure");
		frmFeeStructure.setResizable(false);
		frmFeeStructure.getContentPane().setBackground(Color.WHITE);

		JLabel lblNewLabel = new JLabel("Fee Structure");
		lblNewLabel.setBounds(351, 18, 214, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));

		JLabel lblNewLabel_1 = new JLabel("Department");
		lblNewLabel_1.setBounds(55, 65, 122, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmFeeStructure.getContentPane().setLayout(null);
		frmFeeStructure.getContentPane().add(lblNewLabel);
		frmFeeStructure.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Semester 1");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(55, 126, 122, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Semester 2");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(55, 161, 122, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("Semester 3");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(55, 196, 122, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_3 = new JLabel("Semester 4");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_3.setBounds(55, 231, 122, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_1_3);

		JLabel lblNewLabel_1_1_4 = new JLabel("Semester 5");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_4.setBounds(55, 266, 122, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_1_4);

		JLabel lblNewLabel_1_1_5 = new JLabel("Semester 6");
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_5.setBounds(55, 301, 122, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_1_5);

		JLabel lblNewLabel_1_1_6 = new JLabel("Semester 7");
		lblNewLabel_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_6.setBounds(55, 336, 122, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_1_6);

		JLabel lblNewLabel_1_1_7 = new JLabel("Semester 8");
		lblNewLabel_1_1_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_7.setBounds(55, 371, 122, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_1_7);

		JLabel lblNewLabel_1_2 = new JLabel("Software");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(203, 65, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(203, 126, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1.setBounds(203, 161, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_1);

		JLabel lblNewLabel_1_2_1_2 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2.setBounds(203, 196, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_2);

		JLabel lblNewLabel_1_2_1_3 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_3.setBounds(203, 231, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_3);

		JLabel lblNewLabel_1_2_1_4 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_4.setBounds(203, 266, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_4);

		JLabel lblNewLabel_1_2_1_5 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_5.setBounds(203, 301, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_5);

		JLabel lblNewLabel_1_2_1_6 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_6.setBounds(203, 336, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_6);

		JLabel lblNewLabel_1_2_1_7 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_7.setBounds(203, 371, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_7);

		JLabel lblNewLabel_1_2_2 = new JLabel("Com Sci");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_2.setBounds(310, 65, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_2);

		JLabel lblNewLabel_1_2_1_8 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8.setBounds(310, 126, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8);

		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1.setBounds(310, 161, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_1_1);

		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1.setBounds(310, 196, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_2_1);

		JLabel lblNewLabel_1_2_1_3_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_3_1.setBounds(310, 231, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_3_1);

		JLabel lblNewLabel_1_2_1_4_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_4_1.setBounds(310, 266, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_4_1);

		JLabel lblNewLabel_1_2_1_5_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_5_1.setBounds(310, 301, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_5_1);

		JLabel lblNewLabel_1_2_1_6_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_6_1.setBounds(310, 336, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_6_1);

		JLabel lblNewLabel_1_2_1_7_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_7_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_7_1.setBounds(310, 371, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_7_1);

		JLabel lblNewLabel_1_2_2_1 = new JLabel("Civil Eng");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_2_1.setBounds(417, 65, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_2_1);

		JLabel lblNewLabel_1_2_1_8_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1.setBounds(417, 126, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1);

		JLabel lblNewLabel_1_2_1_8_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_1.setBounds(417, 161, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_1);

		JLabel lblNewLabel_1_2_1_8_1_2 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_2.setBounds(417, 196, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_2);

		JLabel lblNewLabel_1_2_1_8_1_3 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_3.setBounds(417, 231, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_3);

		JLabel lblNewLabel_1_2_1_8_1_4 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_4.setBounds(417, 266, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_4);

		JLabel lblNewLabel_1_2_1_8_1_5 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_5.setBounds(417, 301, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_5);

		JLabel lblNewLabel_1_2_1_8_1_6 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_6.setBounds(417, 336, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_6);

		JLabel lblNewLabel_1_2_1_8_1_7 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_7.setBounds(417, 371, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_7);

		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Com Eng");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_2_1_1.setBounds(524, 65, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_2_1_1);

		JLabel lblNewLabel_1_2_1_8_2 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_8_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_2.setBounds(524, 126, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_2);

		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1_1.setBounds(524, 161, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_1_1_1);

		JLabel lblNewLabel_1_2_1_2_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_2_1_1.setBounds(524, 196, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_2_1_1);

		JLabel lblNewLabel_1_2_1_3_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_3_1_1.setBounds(524, 231, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_3_1_1);

		JLabel lblNewLabel_1_2_1_4_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_4_1_1.setBounds(524, 266, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_4_1_1);

		JLabel lblNewLabel_1_2_1_5_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_5_1_1.setBounds(524, 301, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_5_1_1);

		JLabel lblNewLabel_1_2_1_6_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_6_1_1.setBounds(524, 336, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_6_1_1);

		JLabel lblNewLabel_1_2_1_7_1_1 = new JLabel("84000\r\n");
		lblNewLabel_1_2_1_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_7_1_1.setBounds(524, 371, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_7_1_1);

		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("Bio Med");
		lblNewLabel_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_2_1_1_1.setBounds(631, 65, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_2_1_1_1);

		JLabel lblNewLabel_1_2_1_8_1_8 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_8.setBounds(631, 126, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_8);

		JLabel lblNewLabel_1_2_1_8_1_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_1_1.setBounds(631, 161, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_1_1);

		JLabel lblNewLabel_1_2_1_8_1_2_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_2_1.setBounds(631, 196, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_2_1);

		JLabel lblNewLabel_1_2_1_8_1_3_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_3_1.setBounds(631, 231, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_3_1);

		JLabel lblNewLabel_1_2_1_8_1_4_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_4_1.setBounds(631, 266, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_4_1);

		JLabel lblNewLabel_1_2_1_8_1_5_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_5_1.setBounds(631, 301, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_5_1);

		JLabel lblNewLabel_1_2_1_8_1_6_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_6_1.setBounds(631, 336, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_6_1);

		JLabel lblNewLabel_1_2_1_8_1_7_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_7_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_7_1.setBounds(631, 371, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_7_1);

		JLabel lblNewLabel_1_2_2_1_1_1_1 = new JLabel("Telecom");
		lblNewLabel_1_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_2_1_1_1_1.setBounds(738, 65, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_2_1_1_1_1);

		JLabel lblNewLabel_1_2_1_8_1_8_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_8_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_8_1.setBounds(738, 126, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_8_1);

		JLabel lblNewLabel_1_2_1_8_1_1_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_1_1_1.setBounds(738, 161, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_1_1_1);

		JLabel lblNewLabel_1_2_1_8_1_2_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_2_1_1.setBounds(738, 196, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_2_1_1);

		JLabel lblNewLabel_1_2_1_8_1_3_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_3_1_1.setBounds(738, 231, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_3_1_1);

		JLabel lblNewLabel_1_2_1_8_1_4_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_4_1_1.setBounds(738, 266, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_4_1_1);

		JLabel lblNewLabel_1_2_1_8_1_5_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_5_1_1.setBounds(738, 301, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_5_1_1);

		JLabel lblNewLabel_1_2_1_8_1_6_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_6_1_1.setBounds(738, 336, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_6_1_1);

		JLabel lblNewLabel_1_2_1_8_1_7_1_1 = new JLabel("120000");
		lblNewLabel_1_2_1_8_1_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_8_1_7_1_1.setBounds(738, 371, 97, 25);
		frmFeeStructure.getContentPane().add(lblNewLabel_1_2_1_8_1_7_1_1);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(56, 114, 779, 2);
		frmFeeStructure.getContentPane().add(separator);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					frmFeeStructure.dispose();
					universitymanagement.UniversityManagement.main(null);
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFeeStructure.dispose();
				universitymanagement.UniversityManagement.main(null);
			}
		});

		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton.setBounds(400, 421, 106, 42);
		frmFeeStructure.getContentPane().add(btnNewButton);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(55, 406, 779, 2);
		frmFeeStructure.getContentPane().add(separator_1);

		frmFeeStructure.setBounds(100, 100, 910, 535);
		frmFeeStructure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
