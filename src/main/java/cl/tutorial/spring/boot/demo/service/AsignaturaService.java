package cl.tutorial.spring.boot.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.AsignaturaEntity;

@Service
public interface AsignaturaService {
	
	List<AsignaturaEntity> findAll();

}
