package swInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GameButton extends JButton implements ActionListener {
	
	ImageIcon X, O;
	byte value = 0;
	
	public GameButton() {
		X = new ImageIcon(this.getClass().getResource("/resources/X.png"));
		O = new ImageIcon(this.getClass().getResource("/resources/O.png"));
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		value++;
		value%=3;
		switch(value) {
			case 0:
				setIcon(null);
				break;
			case 1:
				setIcon(X);
				break;
			case 2: 
				setIcon(O);
				break;
		}
	}
	
}
