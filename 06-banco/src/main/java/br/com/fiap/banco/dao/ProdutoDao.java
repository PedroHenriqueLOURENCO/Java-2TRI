package br.com.fiap.banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import br.com.fiap.banco.model.Produto;

//Realiza as ações de CRUD (Create, Read, Update, Delete) no banco de dados
public class ProdutoDao {

	public void cadastrar(Produto produto) {
		
		// //implementar o método cadastrar
		// PreparedStatement stmt = conn.prepareStatement("INSERT INTO TB_PRODUTO(ID_PRODUTO,
		// 		NOME, CODIGO, ESTOQUE, VALOR_VENDA, VALOR_COMPRA) VALUES (SQ_PRODUTO.NEXTVAL, ?, ?, ?,
		// 				?, ?) ");"=
		// stmt.setString(1, "churros"); //Nome
		// stmt.setString(1, "1234"); //Codigo
		// stmt.setString(1, "Y"); //Estoque
		// stmt.setString(1, "10"); //Valor venda
		// stmt.setString(1, "5"); //Valor compra
				
		try {
			//Abrir a conexão com o banco
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
					"rm98402", "fiap");
			//criar objeto com comando sql configurável
			PreparedStatement stm = conn.prepareStatement("ISERT INTO" + "T_PRODUTO(cd_produto, nm_produto, nr_estoque," + "vl_venda, vl_compra)values (?, ?, ?, ?, ?)");
			//executar os valores no comando SQL
			stm.setInt (1, produto.getCodigo()); 
			stm.setString(2, produto.getNome()); 
			stm.setInt (3, produto.getEstoque()); 
			stm.setDouble(4, produto.getValorVenda()); 
			stm.setDouble(5, produto.getValorCompra()); 
			
			//executar comando SQL
			stm.executeUpdate();			
		public Produto pesquisar(int id) {
		
			String linha;
			produto.readLine(); //pular a primeira linha 
			//Ler as linhas do arquivo
			while ((linha = produto.readLine()) != null) {
				//Recupera os valores da linha separando pela ,
				String[] valores = linha.split(",");
		
			
			
			
			
			
			
			
			
			
			
			
			
	// Pubic List<Produto> listar(){
		//	return null;
			
			
			
			
			
		}
		}		
	}
	
}
