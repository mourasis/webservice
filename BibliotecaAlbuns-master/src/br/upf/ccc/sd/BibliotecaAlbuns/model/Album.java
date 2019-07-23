package br.upf.ccc.sd.BibliotecaAlbuns.model;

/**
 * @author Leonardo Deliyannis Constantin, Matheus Bianchi Godinho
 */

public class Album {
	
	private Long codigo;
	private String cod;
	private String descricao;
	private String preco;
	
	/** Construtor vazio é requisito da JAX-B (Java Architecture for XML Binding) **/
	public Album() {
		
	}
	
	public Album(Long codigo, String cod, String descricao, String preco) {
		super();
		this.codigo = codigo;
		this.cod = cod;
		this.descricao = descricao;
		this.preco = preco;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}
