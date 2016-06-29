package swing;

/*import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WordSwing {
	public static void main(String args[]) {
		
		
		
		JFrame frame = new JFrame("Welcome To MLDN"); // 实例化窗体对象
		String picPath = "D:" + File.separator + "mldn.gif";
		File file = new File(picPath); // 实例化File对象
		InputStream input = null; // 输入流对象
		byte b[] = new byte[(int) file.length()]; // 根据图片大小开辟byte数组
		try {
			input = new FileInputStream(file); // 实例化输入流对象
			input.read(b); // 读取文件信息
			input.close(); // 关闭输入流
		} catch (Exception e) {
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(b); // 实例化Icon对象
		JLabel lab = null;
		lab = new JLabel("MLDN", icon, JLabel.CENTER); // 实例化对象，使用居中对齐
		Font fnt = new Font("Serief", Font.ITALIC + Font.BOLD, 28);
		lab.setFont(fnt); // 设置标签的显示字体
		lab.setBackground(Color.YELLOW); // 设置标签的背景颜色
		lab.setForeground(Color.RED); // 设置标签的文字颜色
		frame.add(lab); // 向容器中加入组件
		frame.setSize(300, 160); // 设置组件大小
		frame.setBackground(Color.WHITE); // 设置窗体的背景颜色
		frame.setLocation(300, 200); // 设置窗体的显示位置
		frame.setVisible(true); // 让组件显示
	

	}

}*/





import java.awt.Color;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Licon {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Welcome To MLDN") ; 	// 实例化窗体对象
		String picPath = "d:" + File.separator + "mldn.gif" ;
		Icon icon = new ImageIcon(picPath) ;			// 实例化Icon(标签)对象
		JLabel lab = null ;
		lab = new JLabel(icon, JLabel.CENTER);		// 实例化对象，使用居中对齐
		lab.setBackground(Color.YELLOW) ;			// 设置标签的背景颜色
		lab.setForeground(Color.RED) ;				// 设置标签的文字颜色
		frame.add(lab) ;				    		// 向容器中加入组件
		frame.setSize(300, 160) ;					// 设置组件大小
		frame.setBackground(Color.WHITE) ;			// 设置窗体的背景颜色
		frame.setLocation(300,200) ;				// 设置窗体的显示位置
		frame.setVisible(true) ;					// 让组件显示
	}
}

