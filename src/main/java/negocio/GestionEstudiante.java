package negocio;

import javax.inject.Inject;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import dao.EstudianteDAO;
import modelo.Curso_Covid;
import modelo.Estudiante;

public class GestionEstudiante implements GestionEstudianteLocal{
	
	@Inject
	private EstudianteDAO daoE;

	
	
	
	@Override
	public Estudiante recuperarestudiante(String id_estudiante_cedula) {
		// TODO Auto-generated method stub
		
		System.out.println("Cedula a buscar en negocio: "+id_estudiante_cedula);
		Estudiante estudiante = daoE.read(id_estudiante_cedula);
		System.out.println("Estudiante encontrado: "+estudiante);
		
		return estudiante;
	}
	
	
	

}
