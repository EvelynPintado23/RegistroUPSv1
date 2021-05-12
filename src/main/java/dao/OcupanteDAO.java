package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Ocupante;

@Stateless
public class OcupanteDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Ocupante ocupante) {
		em.persist(ocupante);
	}
	
	public void update(Ocupante ocupante) {
		em.merge(ocupante);
	}
	
	public void remove(String codigo) {
		Ocupante ocupante = this.read(codigo);
		em.remove(ocupante);
	}
	
	public Ocupante read(String codigo) {
		codigo = codigo.trim();
		Ocupante u = em.find(Ocupante.class, codigo);
		return u;
	}
	
	public List<Ocupante> getUsuarios(){
		String rol = "pac";
		String jpql = "SELECT u FROM Ocupante u WHERE us_rol = ?1";
		Query q = em.createQuery(jpql, Ocupante.class);
		q.setParameter(1, rol);
		
		List<Ocupante> ocupante = q.getResultList();
		
		return ocupante;
	}

}
