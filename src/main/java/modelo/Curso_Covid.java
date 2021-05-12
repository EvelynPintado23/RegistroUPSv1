package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

@Entity



public class Curso_Covid {

	@Id
	private String id_curso;
	private int tarea1;
	private int tarea2;
	private int tarea3;
	private int tarea4;
	private int tarea5;
	public String getId_curso() {
		return id_curso;
	}
	public void setId_curso(String id_curso) {
		this.id_curso = id_curso;
	}
	public int getTarea1() {
		return tarea1;
	}
	public void setTarea1(int tarea1) {
		this.tarea1 = tarea1;
	}
	public int getTarea2() {
		return tarea2;
	}
	public void setTarea2(int tarea2) {
		this.tarea2 = tarea2;
	}
	public int getTarea3() {
		return tarea3;
	}
	public void setTarea3(int tarea3) {
		this.tarea3 = tarea3;
	}
	public int getTarea4() {
		return tarea4;
	}
	public void setTarea4(int tarea4) {
		this.tarea4 = tarea4;
	}
	public int getTarea5() {
		return tarea5;
	}
	public void setTarea5(int tarea5) {
		this.tarea5 = tarea5;
	}
	@Override
	public String toString() {
		return "Curso_Covid [id_curso=" + id_curso + ", tarea1=" + tarea1 + ", tarea2=" + tarea2 + ", tarea3=" + tarea3
				+ ", tarea4=" + tarea4 + ", tarea5=" + tarea5 + "]";
	}
	
	
	
	
	
}
