package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Color;

public class Loading1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JProgressBar Loading ;

	public Loading1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1131, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nguye\\Downloads\\football-animations.gif"));
		lblNewLabel.setBounds(-152, 10, 1269, 595);
		contentPane.add(lblNewLabel);
		
		Loading= new JProgressBar();
		Loading.setForeground(new Color(223, 82, 70));
		Loading.setEnabled(false);
		Loading.setStringPainted(true);
		Loading.setBounds(0, 605, 1117, 21);
		contentPane.add(Loading);
	}
}
