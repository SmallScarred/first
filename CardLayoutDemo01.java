package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CardLayoutDemo01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN"); // 实例化窗体对象
		Container cont = frame.getContentPane(); // 取得窗体容器
		CardLayout card = new CardLayout(); // 定义布局管理器
		frame.setLayout(card); // 设置布局管理器
		JButton but = null;
		/*cont.add(new JLabel("标签-A", JLabel.CENTER), "first");
		cont.add(new JLabel("标签-B", JLabel.CENTER), "second");
		cont.add(new JLabel("标签-C", JLabel.CENTER), "third");
		cont.add(new JLabel("标签-D", JLabel.CENTER), "Fourth");
		cont.add(new JLabel("标签-E", JLabel.CENTER), "fifth");*/
		
	    /*JButton but = new JButton("按钮");
		frame.add(but, JLabel.EAST);*/
	/*	
		for (int i = 0; i < 13; i++) {
			but = new JButton("按钮 - "+i) ;
			frame.add(but) ;			// 加入按钮
		}*/
		
		
		frame.pack(); // 根据组件自动调整窗体大小
		frame.setVisible(true); // 设置窗体可见
		frame.setLocation(300, 200);
		//frame.setBounds(75, 75, 18, 28);
		frame.setSize(90, 80);
		 // 显示第三张卡片
		for (int i = 0; i < 6; i++) { // 循环显示每张卡片
			try {
				but = new JButton("按钮 - "+i) ;
				//card.show(cont,"按钮 - "+i);
				frame.add(but) ;
				Thread.sleep(1000); // 加入显示延迟
				card.next(cont);
				if(i==5){
					but = new JButton("按钮 - "+0);
					//card.show(cont,null);
					card.next(cont);
					break;
				}
			} catch (InterruptedException e) {
			}
			 // 从容器中取出组件

		}
		/*but = new JButton("按钮 - "+0);
		card.next(cont);*/
	}
}
