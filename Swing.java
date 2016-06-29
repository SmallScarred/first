package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;



/* Dimension    
 * Point
 * JLabel  标签   Lable对象可以通过Container类中的add（）调用
 * 
 * 
 * 
 * 
 * */
public class Swing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("第一个Swing窗体");
		Dimension dim =new Dimension();
		JLabel lab = new JLabel("MLDN",JLabel.CENTER);
		frame.add(lab);
		dim.setSize(230,80);
		Point point = new Point(300,200);
		frame.setSize(dim);
		frame.setBackground(Color.WHITE);
		frame.setLocation(point);
		frame.setVisible(true);
	}
}
