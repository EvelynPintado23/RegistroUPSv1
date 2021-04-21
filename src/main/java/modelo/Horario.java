package modelo;

import java.util.Date;

import javax.persistence.*;

@Entity
@TableGenerator(
		name = "Horario",
		initialValue = 1, 
		pkColumnName = "ENTITY", 
		pkColumnValue = "id_horario", 
		allocationSize = 1, 
		table = "ENTITY_GENERATOR"
		
		)

public class Horario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_horario;
	
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date horario_dia;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date horario_hora_entrada;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date horario_hora_salida;
	public int getId_horario() {
		return id_horario;
	}
	public void setId_horario(int id_horario) {
		this.id_horario = id_horario;
	}
	public Date getHorario_dia() {
		return horario_dia;
	}
	public void setHorario_dia(Date horario_dia) {
		this.horario_dia = horario_dia;
	}
	public Date getHorario_hora_entrada() {
		return horario_hora_entrada;
	}
	public void setHorario_hora_entrada(Date horario_hora_entrada) {
		this.horario_hora_entrada = horario_hora_entrada;
	}
	public Date getHorario_hora_salida() {
		return horario_hora_salida;
	}
	public void setHorario_hora_salida(Date horario_hora_salida) {
		this.horario_hora_salida = horario_hora_salida;
	}
	
	
	@Override
	public String toString() {
		return "Horario [id_horario=" + id_horario + ", horario_dia=" + horario_dia + ", horario_hora_entrada="
				+ horario_hora_entrada + ", horario_hora_salida=" + horario_hora_salida + "]";
	}
	
	

}
