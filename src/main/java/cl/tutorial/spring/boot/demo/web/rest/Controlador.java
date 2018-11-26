package cl.tutorial.spring.boot.demo.web.rest;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.apache.bcel.generic.TargetLostException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import cl.tutorial.spring.boot.demo.domain.AsignaturaEntity;
import cl.tutorial.spring.boot.demo.domain.NotaEntity;
import cl.tutorial.spring.boot.demo.service.AsignaturaService;
import cl.tutorial.spring.boot.demo.service.NotaService;

@RestController
@RequestMapping("/api")
public class Controlador {
	
	@Autowired
	protected NotaService notaService;
	
	@Autowired
	protected AsignaturaService asignaturaService;

	//Metodo para obtener todas las notas usando JpaRepository
	@GetMapping(value ="/getNotas", produces = "application/json")
	public List<NotaEntity> obtenerNotas(){
		
		return notaService.findAll();
	}
	
	//Metodo para obtener actualizar una nota usando JpaRepository
	//Metodo para obtener eliminar una nota usando JpaRepository
	//Metodo para obtener crear una nota usando JpaRepository
	
	//Metodo para obtener todas las Asignaturas usando JpaRepository
		@GetMapping(value ="/getAsignaturas", produces = "application/json")
		public List<AsignaturaEntity> obtenerAsignaturas(){
			
			return asignaturaService.findAll();
		}
		
		//Metodo para obtener  una asignatura por nombreAsignatura usando JpaRepository
		@GetMapping(value ="/getAsignaturaByName", produces = "application/json")
		   public AsignaturaEntity  getHeroeByName( @RequestParam(value = "nombreAsignatura") String nombreAsig) {		         
		    return asignaturaService.findByNombreAsig(nombreAsig);
	 
		   }		
		//Metodo para actualizar una asignatura usando JpaRepository
		@PatchMapping(value = "/updateAsignatura")
		public AsignaturaEntity actualizarAsignatura(@RequestBody AsignaturaEntity asignatura)
				throws JsonParseException, JsonMappingException, IOException,TargetLostException {

			
			if (!this.validate(asignatura)) {

				System.out.println(HttpStatus.NOT_ACCEPTABLE.value()+
						"Los Campos obligatorios no están diligenciados");
			}
			
			System.out.println(HttpStatus.NOT_ACCEPTABLE.value()+
					"operación Exitosa");
			return asignaturaService.save(asignatura);
		}
		
		// método para validar los datos que recibo

		private boolean validate(AsignaturaEntity asignatura) {

			boolean isValid = true;
				//uso de libreria StringUtils para validar los campos nulos o vacios
			if (StringUtils.trimToNull(asignatura.getNombreAsig()) == null) {
				isValid = false;
			}			
			
			if(asignatura.getIdNota()==null){
				
				isValid = false;
			}

			return isValid;

		}
		
		
		
		
		
		//Metodo para obtener eliminar una asignatura usando JpaRepository
		//Metodo para obtener crear una asignatura usando JpaRepository


}
