package cl.tutorial.spring.boot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.AsignaturaEntity;
import cl.tutorial.spring.boot.demo.repository.AsignaturaRepository;
import cl.tutorial.spring.boot.demo.service.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{
	
	@Autowired
	AsignaturaRepository asignaturaRepository;

	@Override
	public List<AsignaturaEntity> findAll() {
		// TODO Auto-generated method stub
		return asignaturaRepository.findAll();
	}

	@Override
	public AsignaturaEntity findByNombreAsig(String nombreAsig) {
		// TODO Auto-generated method stub
		return asignaturaRepository.findByNombreAsig(nombreAsig);
	}

	@Override
	public AsignaturaEntity save(AsignaturaEntity asignatura) {
		// TODO Auto-generated method stub
		return asignaturaRepository.save(asignatura);
	}
	
	
	

}
