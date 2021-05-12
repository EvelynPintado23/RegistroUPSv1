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
	private String estudiante_correo_institucional;	
	private String estudiante_carrera;
//	@OneToOne(cascade= {CascadeType.REMOVE}, fetch=FetchType.EAGER)
//	@JoinColumn(referencedColumnName = "id_carrera")
//	private Carrera carrera_id_carrera;

	
}
