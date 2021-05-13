package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.RegistroDAO;
import modelo.Usuario;


@Stateless
public class GestionRegistro implements GestionRegistroLocal {

	@Inject
	private RegistroDAO daoRegistro;


}
