package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

@Entity

@TableGenerator(
	name = "Registro", 
	initialValue = 1, 
	pkColumnName = "ENTITY", 
	pkColumnValue = "id_registro", 
	allocationSize = 1, 
	table = "ENTITY_GENERATOR"
		)


public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_registro;

	/*@OneToOne(cascade= {CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="id_cedula")
	private Usuario usuario_id_cedula;*/
	
	@OneToOne(cascade= {CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="id_laboratorio")
	private Laboratorio laboratorio_id_laboratorio;
	
	@OneToOne(cascade= {CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="id_horario")
	private Horario horario_id_horario;
	
	@OneToOne(cascade= {CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="id_estudiante_cedula")
	private Estudiante estudiante_id_estudiante;
	
	
	@OneToOne(cascade= {CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="id_bitacora")
	private Bitacora bitacora_id_bitacora;


	public int getId_registro() {
		return id_registro;
	}


	public void setId_registro(int id_registro) {
		this.id_registro = id_registro;
	}


	/*public Laboratorio getLaboratorio_id_laboratorio() {
		return laboratorio_id_laboratorio;
	}


	public void setLaboratorio_id_laboratorio(Laboratorio laboratorio_id_laboratorio) {
		this.laboratorio_id_laboratorio = laboratorio_id_laboratorio;
	}
*/

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


	public Laboratorio getLaboratorio_id_laboratorio() {
		return laboratorio_id_laboratorio;
	}


	public void setLaboratorio_id_laboratorio(Laboratorio laboratorio_id_laboratorio) {
		this.laboratorio_id_laboratorio = laboratorio_id_laboratorio;
	}



/*
	@Override
	public String toString() {
		return "Registro [id_registro=" + id_registro + ", usuario_id_cedula=" + usuario_id_cedula
				+ ", laboratorio_id_laboratorio=" + laboratorio_id_laboratorio + ", horario_id_horario="
				+ horario_id_horario + ", estudiante_id_estudiante=" + estudiante_id_estudiante
				+ ", bitacora_id_bitacora=" + bitacora_id_bitacora + "]";
	}*/
	
	
	
	
	
	
	
	
}
