package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.ProdutoDao;
import br.com.fiap.banco.model.Produto;

//View
public class Terminal {

	public static void main(String[] args) {
		
		//Instanciar um produto (a ideia é que o usuário informe os dados)
		Produto produto = new Produto(5, "Caminhao", 1, 200000,	300000);
		
		//Instanciar o objeto que é capaz de realizar as ações no banco de dados
		ProdutoDao dao = new ProdutoDao();

		//Gravar no banco
		dao.cadastrar(produto);
	
	}
}