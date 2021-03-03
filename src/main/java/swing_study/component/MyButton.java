package swing_study.component;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {
	private String imgpath = System.getProperty("user.dir") + File.separator + "image" + File.separator;

	public MyButton() {
		setIcon(new ImageIcon(imgpath + "21.gif"));
		setRolloverIcon(new ImageIcon(imgpath + "22.gif"));
		setPressedIcon(new ImageIcon(imgpath + "23.gif"));
	}

}
