package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Bitacora;
import modelo.Estudiante;
import modelo.Horario;
import modelo.Laboratorio;
import modelo.Registro;
import modelo.Usuario;
import negocio.GestionRegistroLocal;
import negocio.GestionUsuarioLocal;


@ManagedBean
@SessionScoped
public class GestionRegistroBean {

	@Inject
	private GestionRegistroLocal gestion_registro_local;
	@Inject
	private GestionUsuarioLocal gestion_usuario_local;

	private int id_registro;
	private Laboratorio laboratorio_id_laboratorio;
	private Horario horario_id_horario;
	private Estudiante estudiante_id_estudiante;
	private Bitacora bitacora_id_bitacora;
	private Registro registro;
	private List<Registro> registros;
	
	
	private String id_cedula;
	private String usuario_correo;
	private String usuario_nombres;
	private String usuario_apellidos;
	private String usuario_rol;
	private String usuario_contrasena;
	private boolean usuario_acceso;
	private List<Usuario> usuarios;
	public GestionRegistroLocal getGestion_registro_local() {
		return gestion_registro_local;
	}
	public void setGestion_registro_local(GestionRegistroLocal gestion_registro_local) {
		this.gestion_registro_local = gestion_registro_local;
	}
	public GestionUsuarioLocal getGestion_usuario_local() {
		return gestion_usuario_local;
	}
	public void setGestion_usuario_local(GestionUsuarioLocal gestion_usuario_local) {
		this.gestion_usuario_local = gestion_usuario_local;
	}
	public int getId_registro() {
		return id_registro;
	}
	public void setId_registro(int id_registro) {
		this.id_registro = id_registro;
	}
	public Laboratorio getLaboratorio_id_laboratorio() {
		return laboratorio_id_laboratorio;
	}
	public void setLaboratorio_id_laboratorio(Laboratorio laboratorio_id_laboratorio) {
		this.laboratorio_id_laboratorio = laboratorio_id_laboratorio;
	}
	public Horario getHorario_id_horario() {
		return horario_id_horario;
	}
	public void setHorario_id_horario(Horario horario_id_horario) {
		this.horario_id_horario = horario_id_horario;
	}
	public Estudiante getEstudiante_id_estudiante() {
		return estudiante_id_estudiante;
	}
	public void setEstudiante_id_estudiante(Estudiante estudiante_id_estudiante) {
		this.estudiante_id_estudiante = estudiante_id_estudiante;
	}
	public Bitacora getBitacora_id_bitacora() {
		return bitacora_id_bitacora;
	}
	public void setBitacora_id_bitacora(Bitacora bitacora_id_bitacora) {
		this.bitacora_id_bitacora = bitacora_id_bitacora;
	}
	public List<Registro> getRegistros() {
		return registros;
	}
	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
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
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Registro getRegistro() {
		return registro;
	}
	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	/*public List<Registro> recuperarRegistros(){
		registros=gestion_registro_local.get
		return registros;	
	}
	*/
}
