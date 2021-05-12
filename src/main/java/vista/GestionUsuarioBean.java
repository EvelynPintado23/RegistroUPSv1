package vista;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import modelo.Usuario;
import negocio.GestionUsuarioLocal;

@ManagedBean
public class GestionUsuarioBean {
	
	@Inject
	private GestionUsuarioLocal gul;
	
	private Usuario usuario = new Usuario();
	
	private String id_cedula;
	private String usuario_correo;
	private String usuario_nombres;
	private String usuario_apellidos;
	private String usuario_rol;
	private String usuario_contrasena;
	private boolean usuario_acceso;
	public GestionUsuarioLocal getGul() {
		return gul;
	}
	public void setGul(GestionUsuarioLocal gul) {
		this.gul = gul;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getId_cedula() {
		return id_cedula;
	}
	public void setId_cedula(String id_cedula) {
		this.id_cedula = id_cedula;
	}
	public String getUsuario_correo() {
		return usuario_correo;
	}
	public void setUsuario_correo(String usuario_correo) {
		this.usuario_correo = usuario_correo;
	}
	public String getUsuario_nombres() {
		return usuario_nombres;
	}
	public void setUsuario_nombres(String usuario_nombres) {
		this.usuario_nombres = usuario_nombres;
	}
	public String getUsuario_apellidos() {
		return usuario_apellidos;
	}
	public void setUsuario_apellidos(String usuario_apellidos) {
		this.usuario_apellidos = usuario_apellidos;
	}
	public String getUsuario_rol() {
		return usuario_rol;
	}
	public void setUsuario_rol(String usuario_rol) {
		this.usuario_rol = usuario_rol;
	}
	public String getUsuario_contrasena() {
		return usuario_contrasena;
	}
	public void setUsuario_contrasena(String usuario_contrasena) {
		this.usuario_contrasena = usuario_contrasena;
	}
	public boolean isUsuario_acceso() {
		return usuario_acceso;
	}
	public void setUsuario_acceso(boolean usuario_acceso) {
		this.usuario_acceso = usuario_acceso;
	}
	
		
	public String login() {
		try {
			
			usuario = gul.loggin(usuario_correo, usuario_contrasena);
			System.out.println(usuario_acceso);
			
			if (usuario != null) {
				
				FacesContext context = FacesContext.getCurrentInstance();
		        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
				session.setAttribute("user", usuario);
				System.out.println("ha iniciado sesion");
				return "index";
			}else {
//				FacesContext context = FacesContext.getCurrentInstance();
//		        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
//		        session.setAttribute("user", usuario);
				return "loggin";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	

}
