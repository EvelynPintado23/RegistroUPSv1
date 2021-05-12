package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Estudiante {

	@Id
	private String id_estudiante_cedula;
	private String estudiante_nombres;
	private String estudiante_apellidos;
	private String estudiante_correo_institucional;
	private String estudiante_carrera;
	
	@OneToOne(cascade= {CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id_curso")
	private Curso_Covid curso_id_curso;

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

	@Override
	public String toString() {
		return "Estudiante [id_estudiante_cedula=" + id_estudiante_cedula + ", estudiante_nombres=" + estudiante_nombres
				+ ", estudiante_apellidos=" + estudiante_apellidos + ", estudiante_correo_institucional="
				+ estudiante_correo_institucional + ", estudiante_carrera=" + estudiante_carrera + ", curso_id_curso="
				+ curso_id_curso + "]";
	}

	
	
	
}
