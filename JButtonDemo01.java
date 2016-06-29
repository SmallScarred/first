package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
	import javax.swing.JFrame;
	public class JButtonDemo01 {
		public static void main(String args[]) {
			JFrame frame = new JFrame("Welcome To MLDN") ;// 实例化窗体对象
			JButton but = new JButton("按钮") ;		// 定义按钮对象
			Font fnt = new Font("Serief", Font.BOLD, 11);
			but.setFont(fnt) ;				// 设置按钮的显示字体
			frame.add(but,BorderLayout.EAST) ;					// 向容器中加入组件
			
			/*GridLayout grid = new GridLayout(3,4,7,7);
			for(int i=0;i<7;){
				but = new JButton("按钮 - "+i);
				frame.add(but);
			}*/
				
				
			frame.setSize(500, 300) ;				// 设置窗体大小
			frame.setLocation(300,200) ;			// 设置窗体的显示位置
			frame.setVisible(true) ;				// 让组件显示
			frame.pack();
		}
	}

