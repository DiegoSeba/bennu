package cl.tutorial.spring.boot.demo.web.rest;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.apache.bcel.generic.TargetLostException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import cl.tutorial.spring.boot.demo.domain.Heroe;
import cl.tutorial.spring.boot.demo.service.HeroeEntityService;
import cl.tutorial.spring.boot.demo.util.RestResponse;

@RestController
@RequestMapping("/api")
public class HeroeController {
	
	@Autowired
	protected HeroeEntityService heroeService;
	
	
	
	@PutMapping(value = "/saveHeroe")
	public RestResponse saveOrUpdate(@RequestBody Heroe heroe)
			throws JsonParseException, JsonMappingException, IOException,TargetLostException {

		
		if (!this.validate(heroe)) {

			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los Campos obligatorios no están diligenciados");
		}
		
		this.heroeService.save(heroe);
		return new RestResponse(HttpStatus.ACCEPTED.value(), "Operación Exitosa");
	}

	// método para validar los datos que recibo

	private boolean validate(Heroe heroe) {

		boolean isValid = true;
			//uso de libreria StringUtils para validar los campos nulos o vacios
		if (StringUtils.trimToNull(heroe.getNombre()) == null) {
			isValid = false;
		}
		if (StringUtils.trimToNull(heroe.getBio()) == null) {
			isValid = false;
		}
		if (StringUtils.trimToNull(heroe.getCasa()) == null) {
			isValid = false;
		}
		if (StringUtils.trimToNull(heroe.getFecha_aparicion()) == null) {
			isValid = false;
		}
		if (StringUtils.trimToNull(heroe.getRuta_imagen()) == null) {
			isValid = false;
		}

		return isValid;

	}
	
	@GetMapping(value ="/getheroe", produces = "application/json")
	public List<Heroe> getHeroes() {
		
		return this.heroeService.findAll();	
		
	}
	

	@GetMapping(value ="/getheroebyname", produces = "application/json")
	   public Heroe getHeroeByName( @RequestParam(value = "nombre") String nombre) {
	      return this.heroeService.getHeroe(nombre);
	         
	    //return new RestResponse(HttpStatus.OK.value(), "Operación Exitosa");
 
	   }
	
	

}
