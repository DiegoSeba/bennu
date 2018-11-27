
package cl.tutorial.spring.boot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.tutorial.spring.boot.demo.domain.NotaEntity;

@Repository
public interface NotaRepository extends JpaRepository<NotaEntity, Integer>{
	
	NotaEntity findByNota(float nota);//metodo para buscar por atributo.
	
	

}

