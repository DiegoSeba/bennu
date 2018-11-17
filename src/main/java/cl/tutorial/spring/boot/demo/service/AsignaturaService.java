package cl.tutorial.spring.boot.demo.service;



import cl.tutorial.spring.boot.demo.domain.Asignatura;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface AsignaturaService {
	
	List<Asignatura> FindAll();
	//Asignatura buscarAsignatura (String nombre );

}
