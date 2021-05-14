package negocio;

import java.util.List;

import javax.inject.Inject;

import dao.LaboratorioDAO;
import modelo.Laboratorio;

public class GestionLaboratorio implements GestionLaboratorioLocal {
	
	@Inject
	private LaboratorioDAO daoL;
	private List<Laboratorio> laboratorios;
	
	@Override
	public List<Laboratorio> obtenerLaboratorio() {
		// TODO Auto-generated method stub
		
		laboratorios=daoL.getLaboratorios();
		return laboratorios;
	}
	
	

	
}
