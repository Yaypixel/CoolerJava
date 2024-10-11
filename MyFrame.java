import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	JLabel label = new JLabel("Choose Your Difficulty: ");
	public static int amount;
	public static int delay;
	
	MyFrame() {
		
		
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null, Font.PLAIN, 25));
		
		this.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] difficulty = {"Easy", "Medium", "Hard"};
		
		comboBox = new JComboBox(difficulty);
		comboBox.addActionListener(this);
		
		this.add(comboBox);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == comboBox) {
			int diff = comboBox.getSelectedIndex();
			
			if (diff == 0) {
				amount = 25;
				delay = 75;
			}
			else if (diff == 1) {
				amount = 36;
				delay = 50;
			}
			else {
				amount = 49;
				delay = 45;
			}
			
			new GameFrame();
		}
		
	}

}
