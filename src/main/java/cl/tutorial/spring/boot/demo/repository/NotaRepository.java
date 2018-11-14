package cl.tutorial.spring.boot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.tutorial.spring.boot.demo.domain.Nota;

public interface NotaRepository extends JpaRepository<Nota, Integer>{
	
	List<Nota>findAll(Nota nota);

}
