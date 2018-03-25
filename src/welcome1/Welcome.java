package welcome1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import attendance.Attendance;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;

public class Welcome {

	private JFrame frame;
	private JTextField textusername;
	private JPasswordField textpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 487, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("w"+dim.getWidth());
		System.out.println("h"+dim.getHeight());
		frame.setBounds(0,0,(int) dim.getWidth(), (int) dim.getHeight());
		frame.getContentPane().setLayout(null);
		frame.setPreferredSize(dim);
		frame.setMinimumSize(dim);
		
		JLabel lblLOGINSYSTEM = new JLabel("LOGIN SYSTEM");
		lblLOGINSYSTEM.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLOGINSYSTEM.setBounds(160, 11, 193, 34);
		frame.getContentPane().add(lblLOGINSYSTEM);
		frame.getContentPane().setMinimumSize(dim);
		JLabel ldlUsername = new JLabel("USERNAME");
		ldlUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		ldlUsername.setBounds(115, 87, 112, 20);
		frame.getContentPane().add(ldlUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(115, 138, 97, 14);
		frame.getContentPane().add(lblPassword);
		
		textusername = new JTextField();
		textusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textusername.setBounds(237, 87, 133, 20);
		frame.getContentPane().add(textusername);
		textusername.setColumns(10);
		
		JButton btnLOGIN = new JButton("LOGIN");
		btnLOGIN.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=textpassword.getText();
				String username=textusername.getText();
				if(password.contains("queen") && username.contains("rrce"))
				{
					textusername.setText(null);
					textpassword.setText(null);
					Attendance attend = new Attendance();
					Attendance.main(null);
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid login details","login error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		btnLOGIN.setBounds(37, 224, 89, 23);
		frame.getContentPane().add(btnLOGIN);
		
		JButton btnRESET = new JButton("RESET");
		btnRESET.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textusername.setText(null);
				textpassword.setText(null);
			}
		});
		btnRESET.setBounds(180, 224, 89, 23);
		frame.getContentPane().add(btnRESET);
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem,"confirm if you want to exit","login system",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnEXIT.setBounds(340, 224, 89, 23);
		frame.getContentPane().add(btnEXIT);
		
		textpassword = new JPasswordField();
		textpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textpassword.setBounds(237, 135, 133, 20);
		frame.getContentPane().add(textpassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 187, 1, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 187, 389, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(37, 56, 389, -4);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(40, 56, 389, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\lenovo\\Documents\\technical connection\\1.jpg"));
		label.setBounds(0, 0, 1350, 730);
		frame.getContentPane().add(label);
	}
}


