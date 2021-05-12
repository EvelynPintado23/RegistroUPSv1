package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Registro;

@Stateless
public class RegistroDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Registro registro) {
		em.persist(registro);
	}
	
	public void update(Registro registro) {
		em.merge(registro);
	}
	
	public void remove(String codigo) {
		Registro registro = this.read(codigo);
		em.remove(registro);
	}
	
	public Registro read(String codigo) {
		codigo = codigo.trim();
		Registro u = em.find(Registro.class, codigo);
		return u;
	}
	
	public List<Registro> getUsuarios(){
		String rol = "pac";
		String jpql = "SELECT u FROM Registro u WHERE us_rol = ?1";
		Query q = em.createQuery(jpql, Registro.class);
		q.setParameter(1, rol);
		
		List<Registro> registro = q.getResultList();
		
		return registro;
	}

}
