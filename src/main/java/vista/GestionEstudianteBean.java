package vista;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Curso_Covid;
import modelo.Estudiante;
import negocio.GestionEstudianteLocal;

@ManagedBean
@SessionScoped
public class GestionEstudianteBean {
	
	@Inject
	private GestionEstudianteLocal gel;
	
	private Estudiante estudiante;
	private String id_estudiante_cedula="";
	private String estudiante_nombres;
	private String estudiante_apellidos;
	private String estudiante_correo_institucional;
	private String estudiante_carrera;
	private Curso_Covid curso_id_curso;
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public String getId_estudiante_cedula() {
		return id_estudiante_cedula;
	}
	public void setId_estudiante_cedula(String id_estudiante_cedula) {
		this.id_estudiante_cedula = id_estudiante_cedula;
	}
	public String getEstudiante_nombres() {
		return estudiante_nombres;
	}
	public void setEstudiante_nombres(String estudiante_nombres) {
		this.estudiante_nombres = estudiante_nombres;
	}
	public String getEstudiante_apellidos() {
		return estudiante_apellidos;
	}
	public void setEstudiante_apellidos(String estudiante_apellidos) {
		this.estudiante_apellidos = estudiante_apellidos;
	}
	public String getEstudiante_correo_institucional() {
		return estudiante_correo_institucional;
	}
	public void setEstudiante_correo_institucional(String estudiante_correo_institucional) {
		this.estudiante_correo_institucional = estudiante_correo_institucional;
	}
	public String getEstudiante_carrera() {
		return estudiante_carrera;
	}
	public void setEstudiante_carrera(String estudiante_carrera) {
		this.estudiante_carrera = estudiante_carrera;
	}
	public Curso_Covid getCurso_id_curso() {
		return curso_id_curso;
	}
	public void setCurso_id_curso(Curso_Covid curso_id_curso) {
		this.curso_id_curso = curso_id_curso;
	}
	
	public void recuperarEstudiante() {
		
		System.out.println("Cedula en el bean_"+ id_estudiante_cedula);
		
		estudiante=gel.recuperarestudiante(id_estudiante_cedula);
		
		estudiante_nombres=estudiante.getEstudiante_nombres();
		estudiante_apellidos=estudiante.getEstudiante_apellidos();
		estudiante_carrera=estudiante.getEstudiante_carrera();
		
		System.out.println("Llamando al metodo");
	}

}
