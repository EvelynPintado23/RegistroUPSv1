package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(
		name = "Usuario_Registro", 
		initialValue = 1, 
		pkColumnName = "ENTITY", 
		pkColumnValue = "usu_reg_id", 
		allocationSize = 1, 
		table = "ENTITY_GENERATOR"
			)
public class Usuario_Registro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usu_reg_id;

	@ManyToOne
	private Usuario usuario_id_cedula;
	
	@ManyToOne
	private Registro registro_id_registro;

	public int getUsu_reg_id() {
		return usu_reg_id;
	}

	public void setUsu_reg_id(int usu_reg_id) {
		this.usu_reg_id = usu_reg_id;
	}

	public Usuario getUsuario_id_cedula() {
		return usuario_id_cedula;
	}

	public void setUsuario_id_cedula(Usuario usuario_id_cedula) {
		this.usuario_id_cedula = usuario_id_cedula;
	}

	public Registro getRegistro_id_registro() {
		return registro_id_registro;
	}

	public void setRegistro_id_registro(Registro registro_id_registro) {
		this.registro_id_registro = registro_id_registro;
	}

	@Override
	public String toString() {
		return "Usuario_Registro [usu_reg_id=" + usu_reg_id + ", usuario_id_cedula=" + usuario_id_cedula
				+ ", registro_id_registro=" + registro_id_registro + "]";
	}
	
	
	

}
