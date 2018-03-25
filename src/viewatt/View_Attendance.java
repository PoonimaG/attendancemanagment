package viewatt;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JTextField;

import attendance.Attendance;
import dbfactory.Dbfactory;
import dbfactory.Student;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class View_Attendance {

	private JFrame frame;
	private JTextField usnText;
	private JTextField facultyText;
	private JTextField textSubcode;
	private JTextField textNClasses;
	private JTextField textNpresent;
	private JTextField textPercentage;
	private JTextField semtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Attendance window = new View_Attendance();
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
	public View_Attendance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("w"+dim.getWidth());
		System.out.println("h"+dim.getHeight());
		frame.setBounds(0,0,(int) dim.getWidth(), (int) dim.getHeight());
		frame.getContentPane().setLayout(null);
		
		JLabel lblViewAttendance = new JLabel("View Attendance");
		lblViewAttendance.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblViewAttendance.setBounds(243, 11, 220, 25);
		frame.getContentPane().add(lblViewAttendance);
		frame.getContentPane().setMinimumSize(dim);
		
		JLabel label = new JLabel("");
		label.setBounds(511, 66, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmView_Attendance = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog( frmView_Attendance,"confirm if you want to exit","View Attendance",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(622, 415, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblStudentid = new JLabel("Student_id");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentid.setBounds(35, 79, 107, 31);
		frame.getContentPane().add(lblStudentid);
		
		JLabel lblFacultyid = new JLabel("Faculty_id");
		lblFacultyid.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFacultyid.setBounds(35, 117, 107, 31);
		frame.getContentPane().add(lblFacultyid);
		
		JLabel lblSubcode = new JLabel("Sub_code");
		lblSubcode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubcode.setBounds(35, 203, 107, 31);
		frame.getContentPane().add(lblSubcode);
		
		JLabel lblNoOfClass = new JLabel("No. Of Classes Taken");
		lblNoOfClass.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNoOfClass.setBounds(35, 240, 186, 31);
		frame.getContentPane().add(lblNoOfClass);
		
		JLabel lblNoOfClasses = new JLabel("No. Of Classes Present");
		lblNoOfClasses.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNoOfClasses.setBounds(35, 279, 186, 31);
		frame.getContentPane().add(lblNoOfClasses);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPercentage.setBounds(35, 321, 107, 31);
		frame.getContentPane().add(lblPercentage);
		
		usnText = new JTextField();
		usnText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usnText.setBounds(278, 83, 185, 25);
		frame.getContentPane().add(usnText);
		usnText.setColumns(10);
		
		facultyText = new JTextField();
		facultyText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		facultyText.setBounds(278, 121, 185, 25);
		frame.getContentPane().add(facultyText);
		facultyText.setColumns(10);
		
		textSubcode = new JTextField();
		textSubcode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textSubcode.setBounds(278, 207, 185, 25);
		frame.getContentPane().add(textSubcode);
		textSubcode.setColumns(10);
		
		textNClasses = new JTextField();
		textNClasses.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textNClasses.setBounds(278, 247, 89, 25);
		frame.getContentPane().add(textNClasses);
		textNClasses.setColumns(10);
		
		textNpresent = new JTextField();
		textNpresent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textNpresent.setBounds(278, 285, 89, 25);
		frame.getContentPane().add(textNpresent);
		textNpresent.setColumns(10);
		
		textPercentage = new JTextField();
		textPercentage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPercentage.setBounds(278, 325, 89, 25);
		frame.getContentPane().add(textPercentage);
		textPercentage.setColumns(10);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Student student = Dbfactory.getInstance().getStudentData(usnText.getText());
					//Student student1 = Dbfactory.getInstance().getStudentData(semtext.getText());
					facultyText.setText(student.getFacultyId());
					semtext.setText(student.getSemester());
					textSubcode.setText(student.getSubCode());
					textNClasses.setText(student.getClassTaken()+"");
					textNpresent.setText(student.getClassPresent()+"");
					//float per=(new Integer(student.getClassPresent()).floatValue()/ new Integer(student.getClassTaken()).floatValue())*100;
					int a= Integer.parseInt(student.getClassPresent());
					int b=Integer.parseInt(student.getClassTaken());
					//float per=(new Integer(a).floatValue()/ new Integer(a).floatValue())*100;
					float per=((a/(float)b)*100);
					textPercentage.setText(per+"%");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnView.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnView.setBounds(243, 415, 89, 23);
		frame.getContentPane().add(btnView);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSemester.setBounds(35, 159, 107, 31);
		frame.getContentPane().add(lblSemester);
		
		semtext = new JTextField();
		semtext.setBounds(278, 164, 89, 25);
		frame.getContentPane().add(semtext);
		semtext.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this.hide();
				JFrame frmView_Attendance = new JFrame("Back");
				Attendance attend = new Attendance();
				Attendance.main(null);
				
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(435, 415, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Documents\\technical connection\\student-placement-program.jpg"));
		label_1.setBounds(0, 0, 1350, 730);
		frame.getContentPane().add(label_1);
	}
}
