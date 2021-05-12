package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Usuario_Registro;

@Stateless
public class Usuario_RegistroDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Usuario_Registro usuario_registro) {
		em.persist(usuario_registro);
	}
	
	public void update(Usuario_Registro usuario_registro) {
		em.merge(usuario_registro);
	}
	
	public void remove(String codigo) {
		Usuario_Registro usuario_registro = this.read(codigo);
		em.remove(usuario_registro);
	}
	
	public Usuario_Registro read(String codigo) {
		codigo = codigo.trim();
		Usuario_Registro u = em.find(Usuario_Registro.class, codigo);
		return u;
	}
	
	public List<Usuario_Registro> getUsuarios(){
		String rol = "pac";
		String jpql = "SELECT u FROM Usuario_Registro u WHERE us_rol = ?1";
		Query q = em.createQuery(jpql, Usuario_Registro.class);
		q.setParameter(1, rol);
		
		List<Usuario_Registro> usuario_registro = q.getResultList();
		
		return usuario_registro;
	}
	


}
