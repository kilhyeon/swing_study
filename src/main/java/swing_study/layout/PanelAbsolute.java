package swing_study.layout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelAbsolute extends JPanel {
	private JTextField textField;

	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 227, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(178, 125, 97, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(350, 36, 57, 15);
		add(lblNewLabel);
	}
}
