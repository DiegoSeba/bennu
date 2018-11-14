package cl.tutorial.spring.boot.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.tutorial.spring.boot.demo.domain.Heroe;

import java.util.List;


@Repository
public interface HeroeRepository extends JpaRepository<Heroe, Long>{
	
	
	@SuppressWarnings("unchecked")
	Heroe save (Heroe heroe);

	Heroe findByNombre(String nombre);
	
	/**
     * Fetch the heroes per name
     * @param nombre
     * @return
     */
	
	


	

	

}
