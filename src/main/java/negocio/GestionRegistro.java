package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.RegistroDAO;
import modelo.Registro;
import modelo.Usuario;


@Stateless
public class GestionRegistro implements GestionRegistroLocal {

	@Inject
	private RegistroDAO daoRegistro;
	private List<Registro> listaRegistros;
	
	public List<Registro> recuperarRegistros() {
		
		listaRegistros = daoRegistro.getRegistros();

		return listaRegistros;
	}


}
