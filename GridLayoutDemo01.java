package swing;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class GridLayoutDemo01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome To MLDN") ; // 实例化窗体对象
		// 设置窗体中的布局管理器为GridLayout，按3¡Á3排列，水平和垂直间距为3
		int a=0,b=0;
		frame.setLayout(new CardLayout(a,b));
		//frame.setLayout(new GridLayout(3, 5, 3, 3));
		JButton but = null;
		for (int i = 0; i < 13; i++) {
			but = new JButton("按钮 - "+i) ;
			frame.add(but) ;			// 加入按钮
		}
		frame.pack() ;				// 根据组件自动调整窗体大小
		frame.setLocation(300, 400);
		frame.setVisible(true) ;			// 设置窗体可见
	}
}