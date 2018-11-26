package cl.tutorial.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.tutorial.spring.boot.demo.domain.AsignaturaEntity;

@Repository
public interface AsignaturaRepository extends JpaRepository<AsignaturaEntity, Long>{
	
	AsignaturaEntity findByNombreAsig(String nombreAsig);
	@SuppressWarnings("unchecked")
	AsignaturaEntity save(AsignaturaEntity asignatura);

}
