package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Bitacora;

@Stateless
public class BitacoraDao {
	
	@Inject
	private EntityManager em;
	
	public void insert(Bitacora bitacora) {
		em.persist(bitacora);
	}
	
	public void update(Bitacora bitacora) {
		em.merge(bitacora);
	}
	
	public void remove(String codigo) {
		Bitacora bitacora = this.read(codigo);
		em.remove(bitacora);
	}
	
	public Bitacora read(String codigo) {
		codigo = codigo.trim();
		Bitacora u = em.find(Bitacora.class, codigo);
		return u;
	}
	
	public List<Bitacora> getUsuarios(){
		String rol = "pac";
		String jpql = "SELECT u FROM Bitacora u WHERE us_rol = ?1";
		Query q = em.createQuery(jpql, Bitacora.class);
		q.setParameter(1, rol);
		
		List<Bitacora> bitacora = q.getResultList();
		
		return bitacora;
	}

}
