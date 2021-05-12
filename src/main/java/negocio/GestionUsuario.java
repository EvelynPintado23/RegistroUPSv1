package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.UsuarioDAO;
import modelo.Usuario;

@Stateless
public class GestionUsuario implements GestionUsuarioLocal {
	
	@Inject
	private UsuarioDAO daoU;
	
	public Usuario loggin(String usuario_correo, String usuario_contrasena) throws Exception {
		
		Usuario usuario = daoU.login(usuario_correo, usuario_contrasena);
		return usuario;
	}

}
