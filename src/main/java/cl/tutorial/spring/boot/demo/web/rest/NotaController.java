package cl.tutorial.spring.boot.demo.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.tutorial.spring.boot.demo.domain.AsignaturaEntity;
import cl.tutorial.spring.boot.demo.domain.NotaEntity;
import cl.tutorial.spring.boot.demo.service.AsignaturaService;
import cl.tutorial.spring.boot.demo.service.NotaService;

@RestController
@RequestMapping("/api")
public class NotaController {
	
	@Autowired
	protected NotaService notaService;
	
	@Autowired
	protected AsignaturaService asignaturaService;

	//Metodo para obtener todas las notas usando JpaRepository
	@GetMapping(value ="/getNotas", produces = "application/json")
	public List<NotaEntity> obtenerNotas(){
		
		return notaService.findAll();
	}
	
	//Metodo para obtener todas las Asignaturas usando JpaRepository
		@GetMapping(value ="/getAsignaturas", produces = "application/json")
		public List<AsignaturaEntity> obtenerAsignaturas(){
			
			return asignaturaService.findAll();
		}


}
