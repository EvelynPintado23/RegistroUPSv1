package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

@Entity

@TableGenerator(
	name = "Laboratorio", 
	initialValue = 1, 
	pkColumnName = "ENTITY", 
	pkColumnValue = "id_laboratorio", 
	allocationSize = 1, 
	table = "ENTITY_GENERATOR"
		)

public class Laboratorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_laboratorio;
	
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	private String laboratorio_nombre;
	private int laboratorio_aforo;
	
	@ManyToOne
    private Horario horario;
	
	public int getId_laboratorio() {
		return id_laboratorio;
	}
	public void setId_laboratorio(int id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}
	public String getLaboratorio_nombre() {
		return laboratorio_nombre;
	}
	public void setLaboratorio_nombre(String laboratorio_nombre) {
		this.laboratorio_nombre = laboratorio_nombre;
	}
	public int getLaboratorio_aforo() {
		return laboratorio_aforo;
	}
	public void setLaboratorio_aforo(int laboratorio_aforo) {
		this.laboratorio_aforo = laboratorio_aforo;
	}
	@Override
	public String toString() {
		return "Laboratorio [id_laboratorio=" + id_laboratorio + ", laboratorio_nombre=" + laboratorio_nombre
				+ ", laboratorio_aforo=" + laboratorio_aforo + "]";
	}
	
	

}
