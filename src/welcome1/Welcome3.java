package welcome1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome3 extends Jframe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome3 window = new Welcome3();
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
	public Welcome3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGhfhf = new JLabel("ghfhf");
		lblGhfhf.setBounds(183, 11, 46, 14);
		frame.getContentPane().add(lblGhfhf);
	}

}
