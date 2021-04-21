package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
}
