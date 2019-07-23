package br.upf.ccc.sd.BibliotecaAlbuns.webservice;

import java.util.List;

import javax.jws.WebService;
import javax.jws.WebMethod;

import br.upf.ccc.sd.BibliotecaAlbuns.model.Album;

/**
 * @author Leonardo Deliyannis Constantin, Matheus Bianchi Godinho
 * SEI - Service Endpoint Interface
 */

@WebService
public interface BibliotecaAlbunsServer {
	
	/** Métodos do WebService **/
	@WebMethod
	public List<Album> retornaAlbuns();
	
	@WebMethod
	public void insereAlbum(String cod, String descricao, String preco);
}
