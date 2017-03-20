package Servlet;

import java.io.BufferedReader;
import com.google.gson.*;

import DAO.ProdutoDAO;
import Entity.Produtos;

import java.io.IOException;
import java.util.EnumSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cadastro extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
        BufferedReader br = request.getReader();
        String str = null;
        while ((str = br.readLine()) != null) {
            sb.append(str);
        }
        String opcao = sb.toString();
        
		switch (opcao) {

		case "negocio":

			response.getWriter().print(carregarTipoNegocio());

			break;

		case "mercadoria":

			response.getWriter().print(carregarTipoMercadoria());

			break;

		default:
			
			while ((str = br.readLine()) != null) {
				sb.append(str);
			}
			String jObj = sb.toString();
			Gson gson = new Gson();
			Produtos prod = (Produtos) gson.fromJson(jObj, Produtos.class);

			boolean retorno = cadastrarProduto(prod);

			response.getWriter().print(retorno);

			break;

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

	public boolean cadastrarProduto(Produtos produto) {

		ProdutoDAO produtoDAO = new ProdutoDAO();

		return produtoDAO.cadastrar(produto);

	}

	public String carregarTipoNegocio() {

		Gson gson = new Gson();

		return gson.toJson(EnumSet.allOf(Enumeradores.TipoNegocio.class));
	}

	public String carregarTipoMercadoria() {

		Gson gson = new Gson();

		return gson.toJson(EnumSet.allOf(Enumeradores.TipoMercadoria.class));
	}

}
