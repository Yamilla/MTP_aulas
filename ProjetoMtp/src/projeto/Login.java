package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	JButton btnNewButton = new JButton("Cadastrar");
	JButton btnNewButton_1 = new JButton("Login");
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\Desktop\\IFG 2018.2\\ifg_instituto_federal_goiano.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(150, 339, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(this) ;
		btnNewButton_1.addActionListener(this) ;
			
		
		
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(266, 339, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setBounds(33, 262, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(33, 305, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 302, 280, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
			}
				
				
		
		});
		textField.setBounds(112, 259, 280, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\yamil\\Desktop\\IFG 2018.2\\ifglogo.png"));
		lblNewLabel_2.setBounds(0, 22, 424, 192);
		contentPane.add(lblNewLabel_2);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnNewButton) {

			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Cadastro frame = new Cadastro();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			dispose();		
		}
		if(arg0.getSource()==btnNewButton_1 && textField.getText().equals(passwordField.getText())){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CadastroIncorreto frame = new CadastroIncorreto();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
		}else if((arg0.getSource()==btnNewButton_1)) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CadastroEfetuado frame = new CadastroEfetuado();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			dispose();
		}		
	}	
}
