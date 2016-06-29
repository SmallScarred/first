package swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixSucceed {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To World");
		frame.setBounds(100,100,200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Button("Okay"), BorderLayout.WEST);
		frame.getContentPane().add(new Button("MOkay"), BorderLayout.NORTH);
		frame.getContentPane().add(new Button("WORKWORK"), BorderLayout.EAST);
		JPanel center = new JPanel();
		frame.getContentPane().add(center,BorderLayout.CENTER);
		//center.setLayout(new GridLayout(6,6,18,18));
		//frame.add(but = new JButton(), BorderLayout.CENTER);
		for(int i = 0;i < 9;i++){
			JButton but = new JButton("按钮 - "+i);
			center.add(but);
			
		}
		frame.setSize(560,123);
		frame.setVisible(true);
	}

}
