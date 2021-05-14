package vista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class CalendarioBean implements Serializable{
	
	private Date date;
	private Date fechaLaboratorio;
	private List<Integer> diasBloqueados;
	
	@PostConstruct
	public void init() {
		
		diasBloqueados= new ArrayList<>();
		
        diasBloqueados.add(0);
        diasBloqueados.add(5);
        diasBloqueados.add(6);
        
        
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getFechaLaboratorio() {
		return fechaLaboratorio;
	}

	public void setFechaLaboratorio(Date fechaLaboratorio) {
		this.fechaLaboratorio = fechaLaboratorio;
	}

	public List<Integer> getDiasBloqueados() {
		return diasBloqueados;
	}

	public void setDiasBloqueados(List<Integer> diasBloqueados) {
		this.diasBloqueados = diasBloqueados;
	}
	
	
}
