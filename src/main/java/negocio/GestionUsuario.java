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
		
		System.out.println("Llega al negocio"+usuario_correo);
		Usuario usuario = daoU.login(usuario_correo, usuario_contrasena);
		//Usuario usuario = daoU.read("0106171325");
		return usuario;
	}

}
