package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Registro;

@Local
public interface GestionRegistroLocal {
	
	public List<Registro> recuperarRegistros() ;

}
