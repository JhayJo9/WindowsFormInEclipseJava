package mainPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainFrameEP extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JLabel lbWelcome;
	private final JButton btnOK = new JButton("OK");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrameEP frame = new mainFrameEP();
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
	public mainFrameEP() {
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 0, 561, 35);
		contentPane.add(lblNewLabel);
		
		tfName = new JTextField();
		tfName.setBounds(10, 45, 541, 29);
		contentPane.add(tfName);
		tfName.setColumns(10);
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = tfName.getText();
				lbWelcome.setText("Hello " + text);
			}
		});
		btnOK.setBounds(0, 217, 561, 36);
		contentPane.add(btnOK);
		
		lbWelcome = new JLabel("");
		lbWelcome.setBounds(10, 117, 541, 29);
		contentPane.add(lbWelcome);
	}
}
