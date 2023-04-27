import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin frame = new LibrarianLogin();
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
	public LibrarianLogin() {
		setTitle("LIBRARIAN ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Librarian Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel.setBounds(154, 11, 112, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 71, 54, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(137, 71, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(73, 114, 54, 21);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 114, 167, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SignIn = textField.getText(); // the variable set for the user text field
				String Enter = passwordField.getText(); // the variable set for the password field of the user
			
			
				
				if(SignIn.equals("Librarian_01") && Enter.equals("Lib01") ||
						SignIn.equals("Librarian_02") && Enter.equals("Lib02") ||
						SignIn.equals("Librarian_03") && Enter.equals("Lib03")) 
				{
					
						int success = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
						if(success == JOptionPane.OK_OPTION) {
							BooksInterface libro = new BooksInterface();
							libro.setVisible(true);
							dispose();
						}		
						
				}
				else if(!(SignIn.equals("Librarian_01")) && Enter.equals("Lib01") ||
					    !(SignIn.equals("Librarian_02")) && Enter.equals("Lib02") ||
					    !(SignIn.equals("Librarian_03")) && Enter.equals("Lib03")) 
				{
					    
							int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								LibrarianLogin Log = new LibrarianLogin();
								Log.setVisible(true);
								dispose();
							}
				}
				else if(SignIn.equals("Librarian_01") && !(Enter.equals("Lib01")) ||
						SignIn.equals("Librarian_02") && !(Enter.equals("Lib02")) ||
						SignIn.equals("Librarian_03") && !(Enter.equals("Lib03"))) 
				{	
					
							int Incorrect = JOptionPane.showConfirmDialog(null,"PASSWORD INCORRECT","", JOptionPane.CLOSED_OPTION);
								if(Incorrect == JOptionPane.OK_OPTION) {
									LibrarianLogin Sign = new LibrarianLogin();
									Sign.setVisible(true);
									dispose();
						}
					
				}
				else if(!(SignIn.equals("Librarian_01")) && !(Enter.equals("Lib01")) ||
						!(SignIn.equals("Librarian_02")) && !(Enter.equals("Lib02")) ||
					    !(SignIn.equals("Librarian_03")) && !(Enter.equals("Lib03"))) 
			 	{
				 	int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME AND PASSWORD INCORRECT","",JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) { 
						LibrarianLogin Sign = new LibrarianLogin(); 
						Sign.setVisible(true); 
						dispose(); 
				}
			}
			}
		});
		btnNewButton.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		btnNewButton.setBounds(166, 166, 89, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Pass");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) { // the purpose of this check box is to let the user see its password when checked
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(270, 166, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginInterface Back = new LoginInterface(); // this will allow the button to be directed back to the login interface
				Back.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(166, 190, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
