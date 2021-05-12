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
	
	public List<Laboratorio> getUsuarios(){
		String rol = "pac";
		String jpql = "SELECT u FROM Laboratorio u WHERE us_rol = ?1";
		Query q = em.createQuery(jpql, Laboratorio.class);
		q.setParameter(1, rol);
		
		List<Laboratorio> laboratorio = q.getResultList();
		
		return laboratorio;
	}

}
