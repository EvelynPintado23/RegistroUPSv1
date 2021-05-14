package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Laboratorio;

@Stateless
public class LaboratorioDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Laboratorio laboratorio) {
		em.persist(laboratorio);
	}
	
	public void update(Laboratorio laboratorio) {
		em.merge(laboratorio);
	}
	
	public void remove(String codigo) {
		Laboratorio laboratorio = this.read(codigo);
		em.remove(laboratorio);
	}
	
	public Laboratorio read(String codigo) {
		codigo = codigo.trim();
		Laboratorio u = em.find(Laboratorio.class, codigo);
		return u;
	}
	
	public List<Laboratorio> getLaboratorios(){
		
		String jpql = "SELECT l FROM Laboratorio l";
		Query q = em.createQuery(jpql, Laboratorio.class);
				
		List<Laboratorio> laboratorio = q.getResultList();
		
		return laboratorio;
	}

}
