package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao extends Cadastro {
	
	// string URL padrão
	// endereço: localhost
	// base de dados: mtp
	private String url = "jdbc:postgresql://localhost/MTP";
	
	// usuário do postgres
	private String usuario = "postgres";
	
	// senha do postgres
	private String senha = "mylla";
	
	// variável que guarda a conexão
	private Connection conn;
	
	/**
	 * Método construtor.
	 * 
	 * Toda vez que instanciar essa classe, a conexão é automaticamente feita
	 */
	public Conexao() {
		conectar();
	}
	
	/**
	 * Método para conexão com o banco de dados.
	 * 
	 * Carrega o driver e cria a conexão com o BD.
	 */
	public void conectar() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Properties props = new Properties();
		props.setProperty("user", this.usuario);
		props.setProperty("password", this.senha);
		
		try {
			this.conn = DriverManager.getConnection(this.url, props);
		} catch (SQLException e) {
			e.getMessage();
		}

	}
	
	/**
	 * Método que retorna a conexão feita com o BD
	 * 
	 * @return um objeto Connection que é a conexão feita com o BD
	 */
	public Connection getConnection() {
		return this.conn;
	}
	
	/**
	 * Método que cria a tabela pessoa para este exemplo.
	 * 
	 * Normalmente, a criação de tabelas NÃO é feita pela aplicação.
	 */
	public void criarTabela() {
		try {
			PreparedStatement st = this.conn.prepareStatement("CREATE TABLE pessoa (id serial primary key, nome text)");
			st.execute();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que insere uma pessoa no banco de dados
	 * 
	 * Por enquanto, a pessoa está fixa!
	 */
	public void inserir()  {
		
		
		try {
			Cadastro cad = new Cadastro();
			PreparedStatement st = this.conn.prepareStatement("INSERT INTO Cadastro (Login, Nome, Email,Cidade,UF,Senha,ConfSenha) VALUES (?, ?, ?, ?, ?, ?, ?)");
			st.setString(1,cad.textField.getText());
			st.setString(2,cad.textField_1.getText());
			st.setString(3,cad.textField_2.getText());
			st.setString(4,cad.textField_3.getText());
			
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que atualiza todos os nomes do banco de dados
	 * 
	 * E se for necessário alterar para uma pessoa só? O que muda?
	 */
	public void atualizar() {
		try {
			PreparedStatement st = this.conn.prepareStatement("UPDATE pessoa SET nome = ?");
			st.setString(1, "Thiago 2");
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que exclui uma determinada pessoa do banco de dados
	 * 
	 * Está sempre excluindo a mesma pessoa! A que tem ID = 1!
	 */
	public void excluir() {
		try {
			PreparedStatement st = this.conn.prepareStatement("DELETE FROM pessoa WHERE id = ?");
			st.setInt(1, 1);
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
