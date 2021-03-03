package swing_study.component;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class JCheckBoxEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxApple;
	private JLabel lblRes;
	private int sum;
	private String resStr = "현재 0 원 입니다.";
	private JCheckBox chckbxPear;
	private JCheckBox chckbxCherry;

	public JCheckBoxEx() {
		initialize();
		chckbxCherry.setSelected(true);
	}
	private void initialize() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth);
		pNorth.setLayout(new BoxLayout(pNorth, BoxLayout.Y_AXIS));
		
		JLabel lblTitle = new JLabel("사과 100원, 배 500원, 체리 2000원");
		pNorth.add(lblTitle);
		
		JPanel pItem = new JPanel();
		pNorth.add(pItem);
		
		chckbxApple = new JCheckBox("사과");
		chckbxApple.addItemListener(this);
		pItem.add(chckbxApple);
		
		chckbxPear = new JCheckBox("배");
		chckbxPear.addItemListener(this);
		pItem.add(chckbxPear);
		
		chckbxCherry = new JCheckBox("체리");
		chckbxCherry.addItemListener(this);
		pItem.add(chckbxCherry);
		
		lblRes = new JLabel(resStr);
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		pNorth.add(lblRes);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chckbxCherry) {
			itemStateChangedChckbxCherry(e);
		}
		if (e.getSource() == chckbxPear) {
			itemStateChangedChckbxPear(e);
		}
		if (e.getSource() == chckbxApple) {
			itemStateChangedChckbxApple(e);
		}
		resStr = String.format("현재 %d 원 입니다.", sum);
		lblRes.setText(resStr);
	}
	protected void itemStateChangedChckbxApple(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		}else {
			sum -=100;
		}		
	}
	protected void itemStateChangedChckbxPear(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		}else {
			sum -=500;
		}
	}
	protected void itemStateChangedChckbxCherry(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 2000;
		}else {
			sum -=2000;
		}		
	}
}
