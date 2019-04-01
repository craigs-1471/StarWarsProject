package swInterface;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainApp() {
		initialize();
	}
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlUserOptions = new JPanel();
		pnlUserOptions.setBounds(5, 353, 476, 62);
		contentPane.add(pnlUserOptions);
		pnlUserOptions.setLayout(null);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewGame.setBounds(25, 13, 97, 25);
		pnlUserOptions.add(btnNewGame);
		
		JPanel pnlGameButtons = new JPanel();
		pnlGameButtons.setBounds(5, 0, 476, 353);
		contentPane.add(pnlGameButtons);
		pnlGameButtons.setLayout(new GridLayout(4, 4, 0, 0));
		
		GameButton btnNewButton_1 = new GameButton();
		pnlGameButtons.add(btnNewButton_1);
		
		GameButton btnNewButton_2 = new GameButton();
		pnlGameButtons.add(btnNewButton_2);
		
		GameButton btnNewButton_3 = new GameButton();
		pnlGameButtons.add(btnNewButton_3);
		
		GameButton btnNewButton_4 = new GameButton();
		pnlGameButtons.add(btnNewButton_4);
		
		GameButton btnNewButton_5 = new GameButton();
		pnlGameButtons.add(btnNewButton_5);
		
		GameButton btnNewButton_6 = new GameButton();
		pnlGameButtons.add(btnNewButton_6);
		
		GameButton btnNewButton_7 = new GameButton();
		pnlGameButtons.add(btnNewButton_7);
		
		GameButton btnNewButton_8 = new GameButton();
		pnlGameButtons.add(btnNewButton_8);
		
		GameButton btnNewButton_9 = new GameButton();
		pnlGameButtons.add(btnNewButton_9);
		
		GameButton btnNewButton_10 = new GameButton();
		pnlGameButtons.add(btnNewButton_10);
		
		GameButton btnNewButton_11 = new GameButton();
		pnlGameButtons.add(btnNewButton_11);
		
		GameButton btnNewButton_12 = new GameButton();
		pnlGameButtons.add(btnNewButton_12);
		
		GameButton btnNewButton_13 = new GameButton();
		pnlGameButtons.add(btnNewButton_13);
		
		GameButton btnNewButton_14 = new GameButton();
		pnlGameButtons.add(btnNewButton_14);
		
		GameButton btnNewButton_15 = new GameButton();
		pnlGameButtons.add(btnNewButton_15);
		
		GameButton btnNewButton_16 = new GameButton();
		pnlGameButtons.add(btnNewButton_16);
	}
}
