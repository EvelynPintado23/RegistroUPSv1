package modelo;

import javax.persistence.*;

@Entity
@TableGenerator(
		name = "Bitacora",
		initialValue = 1, 
		pkColumnName = "ENTITY", 
		pkColumnValue = "id_bitacora", 
		allocationSize = 1, 
		table = "ENTITY_GENERATOR"
		
		)

public class Bitacora {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_bitacora;
	
	@OneToOne(cascade= {CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="id_cedula")
	private Usuario usuario_id_cedula;
	private int bitacora_num_ediciones;
	public int getId_bitacora() {
		return id_bitacora;
	}
	public void setId_bitacora(int id_bitacora) {
		this.id_bitacora = id_bitacora;
	}
	public Usuario getUsuario_id_cedula() {
		return usuario_id_cedula;
	}
	public void setUsuario_id_cedula(Usuario usuario_id_cedula) {
		this.usuario_id_cedula = usuario_id_cedula;
	}
	public int getBitacora_num_ediciones() {
		return bitacora_num_ediciones;
	}
	public void setBitacora_num_ediciones(int bitacora_num_ediciones) {
		this.bitacora_num_ediciones = bitacora_num_ediciones;
	}
	@Override
	public String toString() {
		return "Bitacora [id_bitacora=" + id_bitacora + ", usuario_id_cedula=" + usuario_id_cedula
				+ ", bitacora_num_ediciones=" + bitacora_num_ediciones + "]";
	}

	
	
}
