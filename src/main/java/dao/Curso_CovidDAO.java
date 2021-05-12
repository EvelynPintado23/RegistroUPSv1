package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Curso_Covid;

@Stateless
public class Curso_CovidDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Curso_Covid curso_covid) {
		em.persist(curso_covid);
	}
	
	public void update(Curso_Covid curso_covid) {
		em.merge(curso_covid);
	}
	
	public void remove(String codigo) {
		Curso_Covid curso_covid = this.read(codigo);
		em.remove(curso_covid);
	}
	
	public Curso_Covid read(String codigo) {
		codigo = codigo.trim();
		Curso_Covid u = em.find(Curso_Covid.class, codigo);
		return u;
	}
	
	public List<Curso_Covid> getUsuarios(){
		String rol = "pac";
		String jpql = "SELECT u FROM Curso_Covid u WHERE us_rol = ?1";
		Query q = em.createQuery(jpql, Curso_Covid.class);
		q.setParameter(1, rol);
		
		List<Curso_Covid> curso_covid = q.getResultList();
		
		return curso_covid;
	}
	
}
