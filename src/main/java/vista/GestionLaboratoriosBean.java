package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Horario;
import modelo.Laboratorio;
import negocio.GestionLaboratorioLocal;

@ManagedBean
@SessionScoped
public class GestionLaboratoriosBean {

	@Inject
	GestionLaboratorioLocal gll;
	
	private List<Laboratorio> laboratorios;
	
	private int id_laboratorio;
	private String laboratorio_nombre;
	private int laboratorio_aforo;
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
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}


	public List<Laboratorio> listarLaboratorios(){
		
		laboratorios = gll.obtenerLaboratorio();
		return laboratorios;
	
	}
}
