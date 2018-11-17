package cl.tutorial.spring.boot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.Asignatura;
import cl.tutorial.spring.boot.demo.repository.AsignaturaRepository;
import cl.tutorial.spring.boot.demo.service.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{

	// Inyeccion de dependencia Spring
	@Autowired
	protected AsignaturaRepository asignaturaRepository;
	
	
	@Override
	public List<Asignatura> FindAll() {

		return asignaturaRepository.findAll() ;
	}


//	@Override
//	public Asignatura buscarAsignatura(String nombre) {
//		
//		return asignaturaRepository.buscarAsignatura(nombre);
//	}

}
