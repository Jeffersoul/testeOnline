package DAO;

import Entity.Produtos;

public class ProdutoDAO extends ConnectionDAO {
	
	public boolean cadastrar(Produtos produto){

		String sql = "INSERT INTO PRODUTOS (NOME, CODIGO, PRECO, QUANTIDADE, TIPOMERCADORIA, TIPONEGOCIO) VALUES (?,?,?,?,?,?)";

		try {
			conectaBanco();
			pst = conn.prepareStatement(sql);
			pst.setString(1, produto.getNome().toUpperCase());
			pst.setString(2, produto.getCodigo());
			pst.setString(3, produto.getPreco());
			pst.setInt(4, produto.getQuantidade());
			pst.setInt(5, produto.getTipoMercadoria());
			pst.setInt(6, produto.getTipoNegocio());

			pst.executeUpdate();

			pst.close();

			desconectaBanco();
			return true;

		} catch (Exception e) {
			System.out.println("ERRO " + e);
			return false;
		}

		
	}
}
