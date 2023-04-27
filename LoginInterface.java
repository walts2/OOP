import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginInterface frame = new LoginInterface();
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
	public LoginInterface() {
		setTitle("Library Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library Management Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel.setBounds(155, 23, 177, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADMIN"); // this button is for the Administrator log in 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // this code is for the button and it will direct the user to the admin log in interface
				Adminlogin log = new Adminlogin();
				log.setVisible(true); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		btnNewButton.setBounds(196, 87, 99, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLibrarian = new JButton("LIBRARIAN"); // the button is for the Librarian Log in 
		btnLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // this will direct to the librarian log in page
				LibrarianLogin sign = new LibrarianLogin();
				sign.setVisible(true);
				dispose();
			}
		});
		btnLibrarian.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		btnLibrarian.setBounds(196, 121, 99, 23);
		contentPane.add(btnLibrarian);
	}
}
