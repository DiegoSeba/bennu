package cl.tutorial.spring.boot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.NotaEntity;
import cl.tutorial.spring.boot.demo.repository.NotaRepository;
import cl.tutorial.spring.boot.demo.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{
	
	@Autowired
	protected NotaRepository notaRespository;

	@Override
	public List<NotaEntity> findAll() {
		// TODO Auto-generated method stub
		return notaRespository.findAll();
	}

	@Override
	public NotaEntity findByNota(float nota) {
		// TODO Auto-generated method stub
		return notaRespository.findByNota(nota);
	}

	@Override
	public NotaEntity save(NotaEntity nota) {
		// TODO Auto-generated method stub
		return notaRespository.save(nota);
	}

	

}
