package attendance_register;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class Attendance_Register {

	private JFrame frame;
	private JTextField textCollegename;
	private JTextField textFname;
	private JTextField textFid;
	private JTextField textSubname;
	private JTextField textSubcode;
	private JTextField textDepname;
	private JTextField textSem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendance_Register window = new Attendance_Register();
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
	public Attendance_Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 990, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAttendanceRegister = new JLabel("Attendance Register");
		lblAttendanceRegister.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAttendanceRegister.setBounds(389, 11, 195, 22);
		frame.getContentPane().add(lblAttendanceRegister);
		
		JLabel lblCollege = new JLabel("College");
		lblCollege.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCollege.setBounds(24, 56, 46, 14);
		frame.getContentPane().add(lblCollege);
		
		textCollegename = new JTextField();
		textCollegename.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textCollegename.setBounds(80, 53, 447, 20);
		frame.getContentPane().add(textCollegename);
		textCollegename.setColumns(10);
		
		JLabel lblFacultyName = new JLabel("Faculty Name");
		lblFacultyName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFacultyName.setBounds(24, 99, 83, 14);
		frame.getContentPane().add(lblFacultyName);
		
		textFname = new JTextField();
		textFname.setBounds(111, 97, 111, 20);
		frame.getContentPane().add(textFname);
		textFname.setColumns(10);
		
		JLabel lblFacultyid = new JLabel("Faculty_ID");
		lblFacultyid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFacultyid.setBounds(250, 99, 65, 14);
		frame.getContentPane().add(lblFacultyid);
		
		textFid = new JTextField();
		textFid.setBounds(322, 97, 86, 20);
		frame.getContentPane().add(textFid);
		textFid.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject.setBounds(438, 99, 58, 14);
		frame.getContentPane().add(lblSubject);
		
		textSubname = new JTextField();
		textSubname.setBounds(491, 97, 86, 20);
		frame.getContentPane().add(textSubname);
		textSubname.setColumns(10);
		
		JLabel lblSubcode = new JLabel("Sub_code");
		lblSubcode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubcode.setBounds(607, 99, 65, 14);
		frame.getContentPane().add(lblSubcode);
		
		textSubcode = new JTextField();
		textSubcode.setBounds(675, 97, 86, 20);
		frame.getContentPane().add(textSubcode);
		textSubcode.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDepartment.setBounds(565, 56, 74, 14);
		frame.getContentPane().add(lblDepartment);
		
		textDepname = new JTextField();
		textDepname.setBounds(649, 54, 86, 20);
		frame.getContentPane().add(textDepname);
		textDepname.setColumns(10);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSemester.setBounds(769, 56, 58, 14);
		frame.getContentPane().add(lblSemester);
		
		textSem = new JTextField();
		textSem.setBounds(837, 54, 86, 20);
		frame.getContentPane().add(textSem);
		textSem.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(80, 141, 803, 410);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 38, 867, 0);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(78, 0, -2, 391);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(60, 25, -2, 283);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setForeground(Color.BLACK);
		panel_4.setBounds(66, 0, 2, 461);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(289, 0, -2, 391);
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(603, 0, -2, 396);
		panel.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setForeground(Color.BLACK);
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7.setBounds(307, 0, 2, 420);
		panel.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.BLACK);
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_8.setBounds(570, 0, 2, 431);
		panel.add(panel_8);
		
		JPanel panel_14 = new JPanel();
		panel_14.setForeground(Color.BLACK);
		panel_14.setBackground(Color.BLACK);
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14.setBounds(0, 35, 803, 0);
		panel.add(panel_14);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.BLACK);
		panel_16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_16.setBounds(0, 28, 803, 2);
		panel.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.BLACK);
		panel_17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_17.setBounds(0, 63, 803, 2);
		panel.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.BLACK);
		panel_18.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_18.setBounds(0, 97, 803, 2);
		panel.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.BLACK);
		panel_19.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_19.setBounds(0, 131, 803, 2);
		panel.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.BLACK);
		panel_20.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_20.setBounds(0, 165, 803, 2);
		panel.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.BLACK);
		panel_21.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_21.setBounds(0, 200, 803, 2);
		panel.add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.BLACK);
		panel_22.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_22.setBounds(0, 237, 803, 2);
		panel.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.BLACK);
		panel_23.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_23.setBounds(0, 271, 803, 2);
		panel.add(panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.BLACK);
		panel_24.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_24.setBounds(0, 305, 803, 2);
		panel.add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.BLACK);
		panel_25.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_25.setBounds(0, 340, 803, 2);
		panel.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(Color.BLACK);
		panel_26.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_26.setBounds(0, 375, 803, 2);
		panel.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(Color.DARK_GRAY);
		panel_27.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_27.setBounds(0, 407, 803, 2);
		panel.add(panel_27);
		
		JLabel lblSlNo = new JLabel("Sl no.");
		lblSlNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSlNo.setBounds(10, 13, 46, 14);
		panel.add(lblSlNo);
		
		JLabel lblUsn = new JLabel("USN");
		lblUsn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsn.setBounds(149, 13, 46, 14);
		panel.add(lblUsn);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentName.setBounds(411, 13, 99, 14);
		panel.add(lblStudentName);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatus.setBounds(664, 13, 46, 14);
		panel.add(lblStatus);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.DARK_GRAY);
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_10.setBounds(884, 141, 2, 410);
		frame.getContentPane().add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(80, 562, 806, -1);
		frame.getContentPane().add(panel_11);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setBounds(853, 598, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String fname=textFname.getText();
				textFname.setText(null);
				textFid.setText(null);
				textSubname.setText(null);
				textSubcode.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(738, 598, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JPanel panel_15 = new JPanel();
		panel_15.setForeground(Color.BLACK);
		panel_15.setBackground(Color.BLACK);
		panel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_15.setBounds(80, 175, 803, 2);
		frame.getContentPane().add(panel_15);
	}
}
