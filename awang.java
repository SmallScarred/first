package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class awang extends JFrame  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					awang window = new awang();
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
	public awang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		/*JFrame aowu = new JFrame();*/
		frame.setBounds(100, 100, 222, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(3,3));
		frame.getContentPane().add(new JButton("按钮"), BorderLayout.EAST);
		frame.getContentPane().add(new JButton("按钮"), BorderLayout.WEST);
		frame.getContentPane().add(new JButton("按钮"), BorderLayout.SOUTH);
		frame.getContentPane().add(new JButton("按钮"), BorderLayout.NORTH);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		for(int i =1; i<9 ; i++){
			JButton b = new JButton("按钮-" +i);
			panel.add(b);
		}
		/*JPanel center = new JPanel();
		center.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));;*/
		/*frame.add(aowu,BorderLayout.CENTER);
		aowu.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,3,3));*/
		
		 
		
		/*getContentPane().add("Center",center);*/
		/*getContentPane().add(center,BorderLayout.CENTER);*/
		frame.pack();
		frame.setVisible(true);
		
	}

}
