package cl.tutorial.spring.boot.demo.web.rest;

import java.io.IOException;

import org.aspectj.apache.bcel.generic.TargetLostException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import cl.tutorial.spring.boot.demo.service.CustomerService;
import cl.tutorial.spring.boot.demo.util.RestResponse;
@RestController
@RequestMapping("/api")
public class CustomerController {
	
				
		@Autowired
		protected CustomerService customerService;
		
		
		
		@PutMapping(value = "/findcustomer")
		public RestResponse saveOrUpdate( @RequestParam(value = "nombre") int idCustomer)
				throws JsonParseException, JsonMappingException, IOException,TargetLostException {
			
			this.customerService.buscarCustomer(idCustomer);
			
			return new RestResponse(HttpStatus.OK.value(), "Operación Exitosa");
		}


}
