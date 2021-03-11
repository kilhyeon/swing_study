package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JOptionPanmeMessagetEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1;

	public JOptionPanmeMessagetEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Message Dialog 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblRes = new JLabel("");
		contentPane.add(lblRes);
		
		btn1 = new JButton("클릭");
		btn1.addActionListener(this);
		contentPane.add(btn1, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			actionPerformedBtn1(e);
		}
	}
	
	String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
	ImageIcon icon = new ImageIcon(imgPath + "42.png");	
	
	protected void actionPerformedBtn1(ActionEvent e) {
		JOptionPane.showMessageDialog(
				null,
				"조심하세요",
				"조심",
				JOptionPane.WARNING_MESSAGE,
				icon);
	}
}
