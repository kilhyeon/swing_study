package swing_study.dlg;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class JOptionPanmeInputEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1;
	private JLabel lblRes1;
	private JLabel lbl2;
	private JButton btn2;
	private JLabel lblRes2;
	private JPanel panel1;
	private JPanel panel_1;
	private JPanel panel2;
	private JPanel panel_2;
	private JPanel panel3;
	private JLabel lbl3;
	private JPanel panel_3;
	private JButton btn3;
	private JLabel lblRes3;
	private JPanel panel4;
	private JLabel lbl4;
	private JPanel panel_4;
	private JButton btn4;
	private JLabel lblRes4;

	public JOptionPanmeInputEx() {
		initialize();
	}

	private void initialize() {
		setTitle("Input Dialog 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		panel1 = new JPanel();
		contentPane.add(panel1);
		panel1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lbl1 = new JLabel("JOptionPane.showInputDialog(Object message)");
		panel1.add(lbl1);

		panel_1 = new JPanel();
		panel1.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		btn1 = new JButton("InPutBtn1");
		panel_1.add(btn1);

		lblRes1 = new JLabel("");
		panel_1.add(lblRes1);
		lblRes1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes1.setFont(new Font("굴림", Font.BOLD, 15));
		btn1.addActionListener(this);

		panel2 = new JPanel();
		contentPane.add(panel2);
		panel2.setLayout(new GridLayout(0, 2, 0, 0));

		lbl2 = new JLabel("JOptionPane.showInputDialog(message, initialSelectionValue)");
		panel2.add(lbl2);

		panel_2 = new JPanel();
		panel2.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));

		btn2 = new JButton("InPutBtn2");
		panel_2.add(btn2);

		lblRes2 = new JLabel("");
		panel_2.add(lblRes2);
		lblRes2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes2.setFont(new Font("굴림", Font.BOLD, 15));
		btn2.addActionListener(this);

		panel3 = new JPanel();
		contentPane.add(panel3);
		panel3.setLayout(new GridLayout(0, 2, 0, 0));

		lbl3 = new JLabel("JOptionPane.showInputDialog()");
		panel3.add(lbl3);

		panel_3 = new JPanel();
		panel3.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));

		btn3 = new JButton("InPutBtn3");
		btn3.addActionListener(this);
		panel_3.add(btn3);

		lblRes3 = new JLabel("");
		lblRes3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes3.setFont(new Font("굴림", Font.BOLD, 15));
		panel_3.add(lblRes3);

		panel4 = new JPanel();
		contentPane.add(panel4);
		panel4.setLayout(new GridLayout(0, 2, 0, 0));

		lbl4 = new JLabel("JOptionPane.showInputDialog()");
		panel4.add(lbl4);

		panel_4 = new JPanel();
		panel4.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));

		btn4 = new JButton("InPutBtn4");
		btn4.addActionListener(this);
		panel_4.add(btn4);

		lblRes4 = new JLabel("");
		lblRes4.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes4.setFont(new Font("굴림", Font.BOLD, 15));
		panel_4.add(lblRes4);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn4) {
			actionPerformedBtn4(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
		try {
			if (e.getSource() == btn2) {
				actionPerformedBtn2(e);
			}
			if (e.getSource() == btn1) {
				actionPerformedBtnNewButton(e);
			}
		} catch (NullPointerException e1) {
			System.err.println(e1.getMessage());
//			e1.printStackTrace();
		}
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		String res = JOptionPane.showInputDialog("이름을 입력");
		if (res.length() == 0) {
			lblRes1.setText("입력값은 없음");
		} else {
			lblRes1.setText("입력값은 " + res);
		}
	}

	protected void actionPerformedBtn2(ActionEvent e) {
		String res = JOptionPane.showInputDialog("이름을 입력", "유한솔");
		lblRes2.setText("입력값은 " + res);
	}
	
	protected void actionPerformedBtn3(ActionEvent e) {
		String res = JOptionPane.showInputDialog(null, "이름을 입력1", "제목", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력2", "제목", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력3", "제목", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력4", "제목", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력5", "제목", JOptionPane.PLAIN_MESSAGE);
		lblRes3.setText("입력값은 " + res);
	}
	
	protected void actionPerformedBtn4(ActionEvent e) {
		String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "41.png");
		
		String[] selectionValues = {"박유진", "유한솔", "송명훈", "이나연", "우정아"};
		String initialSelectionValue = "박유진";
		
		Object res = JOptionPane.showInputDialog(
				null,
				"이름을 선택하세요",
				"이름 선택",
				JOptionPane.QUESTION_MESSAGE,
				icon,
				selectionValues,
				initialSelectionValue);
		System.out.println("선택한 이름은 " + res);
		lblRes4.setText("선택한 이름은 " + res);
	}
}
