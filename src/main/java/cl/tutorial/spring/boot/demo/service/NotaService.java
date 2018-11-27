package cl.tutorial.spring.boot.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.NotaEntity;

@Service
public interface NotaService {
	
	List<NotaEntity> findAll();
	NotaEntity findByNota(float nota);
	
	NotaEntity save(NotaEntity nota);

}
