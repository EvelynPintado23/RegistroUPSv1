package negocio;

import javax.ejb.Local;

import modelo.Usuario;

@Local
public interface GestionUsuarioLocal {
	
	public Usuario loggin(String usuario_correo, String usuario_contrasena) throws Exception;

}
