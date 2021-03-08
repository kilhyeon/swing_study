package swing_study.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;

@SuppressWarnings("serial")
public class JComboBoxEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private List<Department> deptList = new Vector<Department>();
	private JButton btnAdd;
	private JButton btnOk;
	private JComboBox cmbDept;

	public JComboBoxEx3() {
		initialize();
		
		deptList.add(new Department(1, "기획", 8));
		deptList.add(new Department(2, "영업", 18));
		deptList.add(new Department(3, "개발", 28));
		
		addDataCmb();
	}

	private void addDataCmb() {
		DefaultComboBoxModel cbm = (DefaultComboBoxModel) cmbDept.getModel();
		for (Department d : deptList) {
			cbm.addElement(d);
		}
		
	}

	private void initialize() {
		setTitle("JComboBox 실전예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		DeptPanel pDept = new DeptPanel();
		pLeft.add(pDept, BorderLayout.CENTER);

		JPanel pBtn = new JPanel();
		pLeft.add(pBtn, BorderLayout.SOUTH);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pBtn.add(btnAdd);

		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));

		cmbDept = new JComboBox();	
		cmbDept.addActionListener(this);
		pRight.add(cmbDept);

		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		pRight.add(btnOk);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmbDept) {
			actionPerformedCmbDept(e);
		}
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}
	protected void actionPerformedBtnAdd(ActionEvent e) {
		
	}
	
	protected void actionPerformedBtnOk(ActionEvent e) {
		
	}
	
	protected void actionPerformedCmbDept(ActionEvent e) {

	}
}
