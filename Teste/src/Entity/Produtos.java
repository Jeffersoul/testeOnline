package Entity;

public class Produtos {
	
	private int Id;

	private String Nome;
	
	private int TipoNegocio;
	
	private int TipoMercadoria;
	
	private String Codigo;
	
	private int Quantidade;
	
	private String Preco;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public int getTipoNegocio() {
		return TipoNegocio;
	}
	
	public void setTipoNegocio(int tipoNegocio) {
		TipoNegocio = tipoNegocio;
	}
	
	public int getTipoMercadoria() {
		return TipoMercadoria;
	}
	
	public void setTipoMercadoria(int tipoMercadoria) {
		TipoMercadoria = tipoMercadoria;
	}
	
	public String getCodigo() {
		return Codigo;
	}
	
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
	public int getQuantidade() {
		return Quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	public String getPreco() {
		return Preco;
	}
	
	public void setPreco(String preco) {
		Preco = preco;
	}

}
