package swing_study.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.ls.LSLoadEvent;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JLableEx extends JFrame implements MouseListener {

	private JPanel contentPane;
	private String path = System.getProperty("user.dir") + File.separator + "image" + File.separator;
	private JLabel lblNorth;
	private JLabel lblCenter;
	private JLabel lblSouth;
	
	public JLableEx() {
		System.out.println(path);
		initialize();
	}
	private void initialize() {
		setTitle("JLable");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNorth = new JLabel("사랑합니다.");
		lblNorth.addMouseListener(this);
		lblNorth.setBackground(Color.ORANGE);
		lblNorth.setOpaque(true);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNorth, BorderLayout.NORTH);
		
		lblCenter = new JLabel("");
		lblCenter.setIcon(new ImageIcon(path+"11.jpg"));
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCenter, BorderLayout.CENTER);
		
		lblSouth = new JLabel("보고싶으면 전화하세요.");
		lblSouth.setIcon(new ImageIcon(path+"12.jpg"));
		lblSouth.setOpaque(true);
		lblSouth.setBackground(Color.LIGHT_GRAY);
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSouth, BorderLayout.SOUTH);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblNorth) {
			mouseClickedLblNorth(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblNorth(MouseEvent e) {
		lblCenter.setIcon(new ImageIcon(path+"1.jpg"));
		lblSouth.setText("010-1234-1234");
		JOptionPane.showMessageDialog(null, "변경완료");
	}
}
