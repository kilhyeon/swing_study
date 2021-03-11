package swing_study.listener;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class JPopupMenuFrameEx extends JFrame {

	private JPanel contentPane;
	private JLabel imgLabel = new JLabel();

	public JPopupMenuFrameEx() {
		setTitle("팝업메뉴");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setComponentPopupMenu(createPopupMenu());

		contentPane.add(imgLabel, BorderLayout.SOUTH);

	}

	private JPopupMenu createPopupMenu() {
		JPopupMenu popupMenu = new JPopupMenu();

		JMenuItem load = new JMenuItem("Load");
		load.addActionListener(listener);
		popupMenu.add(load);

		JMenuItem hide = new JMenuItem("Hide");
		hide.addActionListener(listener);
		popupMenu.add(hide);

		JMenuItem reshow = new JMenuItem("ReShow");
		reshow.addActionListener(listener);
		popupMenu.add(reshow);

		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(listener);
		popupMenu.add(exit);

		return popupMenu;
	}

	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Load")) {
				String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
				ImageIcon icon = new ImageIcon(imgPath + "flower.jpg");

				Image changeIcon = icon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
				imgLabel.setIcon(new ImageIcon(changeIcon));
			}

			if (e.getActionCommand().equals("Hide")) {
				imgLabel.setVisible(false);
				return;
			}
			if (e.getActionCommand().equals("ReShow")) {
				imgLabel.setVisible(true);
				return;
			}
			if (e.getActionCommand().equals("Exit")) {
				System.exit(0);
				return;
			}
		}
	};
}
