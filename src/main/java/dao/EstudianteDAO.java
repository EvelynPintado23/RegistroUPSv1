package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Estudiante;

@Stateless
public class EstudianteDAO{
	
	@Inject
	private EntityManager em;
	
	public void insert(Estudiante estudiante) {
		em.persist(estudiante);
	}
	
	public void update(Estudiante estudiante) {
		em.merge(estudiante);
	}
	
	public void remove(String codigo) {
		Estudiante estudiante = this.read(codigo);
		em.remove(estudiante);
	}
	
	public Estudiante read(String codigo) {
		codigo = codigo.trim();
		Estudiante u = em.find(Estudiante.class, codigo);
		return u;
	}
	
	public List<Estudiante> getUsuarios(){
		String rol = "pac";
		String jpql = "SELECT u FROM Estudiante u WHERE us_rol = ?1";
		Query q = em.createQuery(jpql, Estudiante.class);
		q.setParameter(1, rol);
		
		List<Estudiante> estudiante = q.getResultList();
		
		return estudiante;
	}

}
