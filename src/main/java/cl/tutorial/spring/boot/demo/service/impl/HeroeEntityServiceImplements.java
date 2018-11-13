package cl.tutorial.spring.boot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.Heroe;
import cl.tutorial.spring.boot.demo.repository.HeroeRepository;
import cl.tutorial.spring.boot.demo.service.HeroeEntityService;


@Service
public class HeroeEntityServiceImplements implements HeroeEntityService {
	
	@Autowired
	protected HeroeRepository heroeRepository;
	
	@Override
	public Heroe save(Heroe heroe) {
		
		return this.heroeRepository.save(heroe);
		
	}
	
	@Override
	public List<Heroe> findAll() {
		return this.heroeRepository.findAll();
	}
	
	@Override
	public Heroe getHeroe(String nombre) {
		
		Heroe heroe= heroeRepository.findByNombre(nombre);
				
				 return heroe;
		
	}

}
