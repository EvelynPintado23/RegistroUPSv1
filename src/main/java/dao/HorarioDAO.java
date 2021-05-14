package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Horario;

@Stateless
public class HorarioDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Horario horario) {
		em.persist(horario);
	}
	
	public void update(Horario horario) {
		em.merge(horario);
	}
	
	public void remove(String codigo) {
		Horario horario = this.read(codigo);
		em.remove(horario);
	}
	
	public Horario read(String codigo) {
		codigo = codigo.trim();
		Horario u = em.find(Horario.class, codigo);
		return u;
	}
	
	/*public List<Horario> getHorarios(){
		String rol = "pac";
		String jpql = "SELECT u FROM Horario u WHERE us_rol = ?1";
		Query q = em.createQuery(jpql, Horario.class);
		q.setParameter(1, rol);
		
		List<Horario> horario = q.getResultList();
		
		return horario;
	}*/
	
}
