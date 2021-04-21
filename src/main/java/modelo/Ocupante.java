package modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity

@TableGenerator(
	name = "Ocupante", 
	initialValue = 1, 
	pkColumnName = "ENTITY", 
	pkColumnValue = "id_ocupante", 
	allocationSize = 1, 
	table = "ENTITY_GENERATOR"
		)

public class Ocupante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ocupante;

	public int getId_ocupante() {
		return id_ocupante;
	}

	public void setId_ocupante(int id_ocupante) {
		this.id_ocupante = id_ocupante;
	}

	@Override
	public String toString() {
		return "Ocupante [id_ocupante=" + id_ocupante + "]";
	}

}
