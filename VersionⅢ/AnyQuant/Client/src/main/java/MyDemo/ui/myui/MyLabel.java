package MyDemo.ui.myui;

import javax.swing.*;

public class MyLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	public MyLabel(int x, int y, int width, int height){
		this.setBounds(x, y, width, height);
		this.setVisible(true);
		this.setOpaque(true);
		this.setHorizontalAlignment(MyDemo.ui.myui.MyLabel.CENTER);
	}
}
