package cl.tutorial.spring.boot.demo.service;

import java.util.List;
import java.util.Map;

import org.jvnet.hk2.annotations.Service;

import cl.tutorial.spring.boot.demo.domain.Heroe;

@Service
public interface HeroeEntityService {

	/**
	 * Guarda un usuario 
	 * @param user
	 * @return el usuario guardado
	 */
	Heroe save(Heroe heroe);
	
	/**
	 * Recupera la lista de usuarios
	 * 
	 * @return lista de usuarios
	 */
	List<Heroe> findAll();

	Heroe getHeroe(String  nombre);
	
	
	

}
