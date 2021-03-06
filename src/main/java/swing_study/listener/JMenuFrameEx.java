package swing_study.listener;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class JMenuFrameEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmLoad;
	private JMenuItem mntmHide;
	private JMenuItem mntmReShow;
	private JMenuItem mntmExit;
	private JLabel imgLabel = new JLabel();
	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;

	public JMenuFrameEx() {
		initialize();
	}

	private void initialize() {
		setTitle("메뉴");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnScreen = new JMenu("Screen");
		menuBar.add(mnScreen);

		mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(this);
		mnScreen.add(mntmLoad);

		mntmHide = new JMenuItem("Hide");
		mntmHide.addActionListener(this);
		mnScreen.add(mntmHide);

		mntmReShow = new JMenuItem("ReShow");
		mntmReShow.addActionListener(this);
		mnScreen.add(mntmReShow);

		JSeparator separator = new JSeparator();
		mnScreen.add(separator);

		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(this);
		mnScreen.add(mntmExit);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(imgLabel, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmExit) {
			actionPerformedMntmExit(e);
		}
		if (e.getSource() == mntmReShow) {
			actionPerformedMntmReShow(e);
		}
		if (e.getSource() == mntmHide) {
			actionPerformedMntmHide(e);
		}
		if (e.getSource() == mntmLoad) {
			actionPerformedMntmLoad(e);
		}
	}

	protected void actionPerformedMntmLoad(ActionEvent e) {
		if (imgLabel.getIcon() != null)
			return;
		ImageIcon icon = new ImageIcon(imgPath + "flower.jpg");
		Image changeIcon = icon.getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(),
				Image.SCALE_SMOOTH);
		imgLabel.setIcon(icon);
	}

	protected void actionPerformedMntmHide(ActionEvent e) {
		imgLabel.setVisible(false);
		return;
	}

	protected void actionPerformedMntmReShow(ActionEvent e) {
		imgLabel.setVisible(true);
		return;
	}

	protected void actionPerformedMntmExit(ActionEvent e) {
		System.exit(0);
		return;
	}
}
