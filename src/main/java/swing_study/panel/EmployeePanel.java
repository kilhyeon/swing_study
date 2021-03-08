package swing_study.panel;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class EmployeePanel extends JPanel {

	public EmployeePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "사원정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	}
	
	public void setEmployeee(Employee employee) {
		
	}
	
	public Title getEmployee() {
		return null;
	}
	
	public void clearTf() {
		
	}
}
