package Demo.ui.myui;

//import javax.swing.BorderFactory;

import javax.swing.*;

public class MyTextField extends JTextField{

	private static final long serialVersionUID = 1L;

	public MyTextField(int x, int y, int width, int height){
		this.setBounds(x, y, width, height);
		this.setVisible(true);
		//this.setOpaque(false);	
		//this.setBorder(BorderFactory.createEmptyBorder());
	}
}
