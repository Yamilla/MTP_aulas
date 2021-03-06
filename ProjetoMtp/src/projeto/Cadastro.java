package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	
	public static void main(String[] args) {
		
	
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
	}

	
	public Cadastro() {
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\Desktop\\IFG 2018.2\\ifg_instituto_federal_goiano.jpg"));
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 342);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblLogin.setBounds(10, 11, 53, 14);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(58, 8, 366, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNome.setBounds(10, 52, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEmail.setBounds(10, 86, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 122, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSenha.setBounds(10, 161, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblConfirmarSenha.setBounds(10, 202, 89, 14);
		contentPane.add(lblConfirmarSenha);
		
		
		//ACTION
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				if(arg0.getSource()==btnCadastrar) {
					Conexao con = new Conexao();
					
				}
				
			}
		});
		btnCadastrar.setBounds(160, 269, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCancelar.setBounds(288, 269, 89, 23);
		contentPane.add(btnCancelar);
		
		setTextField_1(new JTextField());
		getTextField_1().setBounds(58, 49, 366, 20);
		contentPane.add(getTextField_1());
		getTextField_1().setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(58, 83, 366, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(58, 119, 191, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(58, 158, 366, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(97, 199, 327, 20);
		contentPane.add(passwordField_1);
		
		JLabel lblEstado = new JLabel("UF");
		lblEstado.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEstado.setBounds(274, 122, 24, 14);
		contentPane.add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(4);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione a op\u00E7\u00E3o", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		comboBox.setBounds(311, 118, 113, 22);
		contentPane.add(comboBox);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblLogin, textField, lblNome, lblEmail, lblNewLabel, lblSenha, lblConfirmarSenha, btnCadastrar, btnCancelar, getTextField_1(), textField_2, textField_3}));
	}


	public JTextField getTextField_1() {
		return textField_1;
	}


	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}	
}

