package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FirstSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstSwing frame = new FirstSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstSwing() {
		setBackground(new Color(0, 255, 255));
		setFont(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("SimSun", Font.PLAIN, 12));
		textField_1.setText("简单窗口");
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		contentPane.add(textField_1, BorderLayout.NORTH);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, BorderLayout.WEST);
		textField_2.setColumns(10);
		
		
		
		Icon con = new ImageIcon("c:/Users/Administrator/Desktop/第18章：图形界面/031813_【第18章：图形界面】_菜单组件/myicon");
	}

}
