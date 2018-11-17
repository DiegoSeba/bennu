package cl.tutorial.spring.boot.demo.web.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.tutorial.spring.boot.demo.domain.Asignatura;
import cl.tutorial.spring.boot.demo.service.AsignaturaService;

@RestController
@RequestMapping("/api")
public class AsignaturaController {
	
	@Autowired
	protected AsignaturaService asignaturaService;

	//Metodo para las asignaturas
	@GetMapping(value= "/getAsignatura", produces = "application/json")
	public List<Asignatura> obtenerAsignatura(){
		
		return asignaturaService.FindAll();
	}

}
