package universitymanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Login {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		ArrayList<String> user = new ArrayList<String>();
		user.add("admin");
		user.add("ateeb");
		user.add("shayan");
		user.add("saad");
		user.add("fabeha");
		ArrayList<String> pass = new ArrayList<String>();
		pass.add("admin");
		pass.add("1234");
		pass.add("miniclip-100");
		pass.add("54321");
		pass.add("4321");
		Iterator useritr = user.iterator();
		Iterator passitr = pass.iterator();

		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\SCD Project\\Logo.png"));
		frmLogin.setBackground(Color.BLACK);
		frmLogin.setResizable(false);
		frmLogin.getContentPane().setBackground(Color.WHITE);
		frmLogin.getContentPane().setForeground(Color.WHITE);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 545, 236);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					int index = 0;
					try {
						while (useritr.hasNext()) {
							if (textField.getText().equalsIgnoreCase(user.get(index))
									&& passwordField.getText().equalsIgnoreCase(pass.get(index))) {
								textField.setText(null);
								passwordField.setText(null);
								UniversityManagement.main(null);
								frmLogin.dispose();
								return;
							}
							index++;
						}
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
								JOptionPane.ERROR_MESSAGE);
						textField.setText(null);
						passwordField.setText(null);
					}
				}
			}
		});
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					int index = 0;
					try {
						while (useritr.hasNext()) {
							if (textField.getText().equalsIgnoreCase(user.get(index))
									&& passwordField.getText().equalsIgnoreCase(pass.get(index))) {
								textField.setText(null);
								passwordField.setText(null);
								UniversityManagement.main(null);
								frmLogin.dispose();
								return;
							}
							index++;
						}
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
								JOptionPane.ERROR_MESSAGE);
						textField.setText(null);
						passwordField.setText(null);
					}
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = 0;
				try {
					while (useritr.hasNext()) {
						if (textField.getText().equalsIgnoreCase(user.get(index))
								&& passwordField.getText().equalsIgnoreCase(pass.get(index))) {
							textField.setText(null);
							passwordField.setText(null);
							UniversityManagement.main(null);
							frmLogin.dispose();
							return;
						}
						index++;
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}

			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBackground(Color.WHITE);

		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		GroupLayout groupLayout = new GroupLayout(frmLogin.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(30).addComponent(lblNewLabel_1).addGap(30)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGap(10).addGroup(
								groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 208,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 208,
												GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup().addGap(153)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(23)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(27)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addGap(10).addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 28,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGap(27).addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_1)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10).addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)))))
				.addGap(19)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))));
		frmLogin.getContentPane().setLayout(groupLayout);
	}
}
