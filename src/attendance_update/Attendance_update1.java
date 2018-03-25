package attendance_update;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;

import attendance.Attendance;
import dbfactory.Dbfactory;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Attendance_update1 {

	private JFrame frame;
	private JTextField usnText;
	private JTextField FacultyidText;
	private JTextField SubcodeText;
	private JTextField ClassesTakenText;
	private JTextField ClassesAttText;
	private JTextField textsem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendance_update1 window = new Attendance_update1();
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
	public Attendance_update1() {
		initialize();
	}
	//ERROR: incorrect usage. OracleSql (-transition <file> | <process_escapes> <convert_nchars> { <sql> } )
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("w"+dim.getWidth());
		System.out.println("h"+dim.getHeight());
		frame.setBounds(0,0,(int) dim.getWidth(), (int) dim.getHeight());
		frame.getContentPane().setLayout(null);
		
		JLabel lblAttendanceupdate = new JLabel("Attendance_Update");
		lblAttendanceupdate.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAttendanceupdate.setBounds(119, 11, 338, 31);
		frame.getContentPane().add(lblAttendanceupdate);
		frame.getContentPane().setMinimumSize(dim);
		
		JLabel lblUsn = new JLabel("USN");
		lblUsn.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsn.setBounds(29, 83, 96, 25);
		frame.getContentPane().add(lblUsn);
		
		JLabel lblnoofclasses = new JLabel("No_Of_Classes_Taken");
		lblnoofclasses.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblnoofclasses.setBounds(29, 238, 177, 31);
		frame.getContentPane().add(lblnoofclasses);
		
		JLabel lblFacultyid = new JLabel("Faculty_id");
		lblFacultyid.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFacultyid.setBounds(29, 119, 85, 27);
		frame.getContentPane().add(lblFacultyid);
		
		JLabel lblNoofclassesattended = new JLabel("No_of_Classes_Attended");
		lblNoofclassesattended.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNoofclassesattended.setBounds(29, 273, 196, 31);
		frame.getContentPane().add(lblNoofclassesattended);
		
		JLabel lblSubcode = new JLabel("Sub_code");
		lblSubcode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubcode.setBounds(29, 197, 85, 30);
		frame.getContentPane().add(lblSubcode);
		
		usnText = new JTextField();
		usnText.setFont(new Font("Tahoma", Font.PLAIN, 15));
		usnText.setBounds(261, 83, 196, 25);
		frame.getContentPane().add(usnText);
		usnText.setColumns(10);
		
		FacultyidText = new JTextField();
		FacultyidText.setBounds(261, 122, 196, 25);
		frame.getContentPane().add(FacultyidText);
		FacultyidText.setColumns(10);
		
		SubcodeText = new JTextField();
		SubcodeText.setBounds(261, 202, 196, 25);
		frame.getContentPane().add(SubcodeText);
		SubcodeText.setColumns(10);
		
		ClassesTakenText = new JTextField();
		ClassesTakenText.setBounds(261, 243, 151, 25);
		frame.getContentPane().add(ClassesTakenText);
		ClassesTakenText.setColumns(10);
		
		ClassesAttText = new JTextField();
		ClassesAttText.setBounds(261, 278, 151, 25);
		frame.getContentPane().add(ClassesAttText);
		ClassesAttText.setColumns(10);
		
		JButton btnIsert_stud_att = new JButton("Insert_Stud_Attendance");
		btnIsert_stud_att.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					
					System.out.println(usnText.getText());
					int a=Dbfactory.getInstance().insertAttendance_update2(usnText.getText(), FacultyidText.getText(), textsem.getText(),SubcodeText.getText(), ClassesTakenText.getText(), ClassesAttText.getText());
					if(a>0)
					{
						JOptionPane.showMessageDialog(null, "Value inserted successfully");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Value insertion Unsuccessfully");
					}
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnIsert_stud_att.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnIsert_stud_att.setBounds(10, 345, 282, 39);
		frame.getContentPane().add(btnIsert_stud_att);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSemester.setBounds(29, 157, 85, 29);
		frame.getContentPane().add(lblSemester);
		
		textsem = new JTextField();
		textsem.setBounds(261, 161, 196, 25);
		frame.getContentPane().add(textsem);
		textsem.setColumns(10);
		
		JButton btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					int a=Dbfactory.getInstance().deleteAttendance_update2(usnText.getText());
					if(a>0)
					{
						JOptionPane.showMessageDialog(null, "Value deleted successfully");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Value deletion Unsuccessfully");
					}
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				
			    }
			}
		});
		btndelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndelete.setBounds(334, 345, 138, 39);
		frame.getContentPane().add(btndelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					//System.out.println(textsem.getText()+usnText.getText());
					int a=Dbfactory.getInstance().updateAttendance_update2(textsem.getText(),usnText.getText());
					if(a==0)
					{
						JOptionPane.showMessageDialog(null, "Value updated successfully");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Value updation Unsuccessfully");
					}
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				
			    }
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(515, 345, 125, 39);
		frame.getContentPane().add(btnUpdate);
		
		/*JLabel label = new JLabel("");
		label.setBounds(0, 0, 46, 14);
		frame.getContentPane().add(label);*/
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmAttendance_update1 = new JFrame("Back");
				Attendance attend = new Attendance();
				Attendance.main(null);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(554, 495, 89, 31);
		frame.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\lenovo\\Documents\\technical connection\\student-placement-program.jpg"));
		label.setBounds(0, 0, 1350, 730);
		frame.getContentPane().add(label);
		
		
	}
}
