package attendance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import attendance_register.Attendance_Register;
import attendance_update.Attendance_update1;
//import student_info.Student_info1;
import viewatt.View_Attendance;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Attendance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendance window = new Attendance();
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
	public Attendance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 11));
		//frame.setBackground(new Color(255, 204, 255));
		frame.getContentPane().setForeground(Color.MAGENTA);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("w"+dim.getWidth());
		System.out.println("h"+dim.getHeight());
		frame.setBounds(0,0,(int) dim.getWidth(), (int) dim.getHeight());
		frame.getContentPane().setLayout(null);
		
		JLabel lblATTENDANCE = new JLabel("ATTENDANCE");
		lblATTENDANCE.setForeground(new Color(0, 0, 205));
		lblATTENDANCE.setBackground(Color.CYAN);
		lblATTENDANCE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblATTENDANCE.setBounds(543, 71, 248, 37);
		frame.getContentPane().add(lblATTENDANCE);
		frame.getContentPane().setMinimumSize(dim);
		
		JButton btnViewAttendance = new JButton("View Attendance");
		btnViewAttendance.setBackground(UIManager.getColor("Button.shadow"));
		btnViewAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//JFrame frmAttendance = new JFrame("View Attendance");
				View_Attendance va=new View_Attendance();
				View_Attendance.main(null);
			}
		});
		btnViewAttendance.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnViewAttendance.setBounds(779, 246, 231, 38);
		frame.getContentPane().add(btnViewAttendance);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setBackground(UIManager.getColor("Button.shadow"));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmAttendance = new JFrame("Cancel");
				if(JOptionPane.showConfirmDialog(frmAttendance,"confirm if you want to exit","Attendance",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(1007, 593, 103, 27);
		frame.getContentPane().add(btnCancel);
		
		JButton btnAttendanceupdate = new JButton("Attendance_Update");
		btnAttendanceupdate.setBackground(UIManager.getColor("Button.shadow"));
		btnAttendanceupdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAttendanceupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attendance_update1 au1=new Attendance_update1();
				Attendance_update1.main(null);
			}
		});
		btnAttendanceupdate.setBounds(299, 247, 248, 37);
		frame.getContentPane().add(btnAttendanceupdate);
		
		JLabel label = new JLabel("");
		label.setForeground(UIManager.getColor("Button.shadow"));
		label.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		label.setIcon(new ImageIcon("C:\\Users\\lenovo\\Documents\\technical connection\\abt-campus-img2_dgmc.jpg"));
		label.setBounds(0, 11, 1350, 730);
		frame.getContentPane().add(label);
	}
}
