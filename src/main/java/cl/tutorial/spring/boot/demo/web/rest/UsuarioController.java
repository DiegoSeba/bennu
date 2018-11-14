package cl.tutorial.spring.boot.demo.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.tutorial.spring.boot.demo.domain.Usuario;
import cl.tutorial.spring.boot.demo.service.UsuarioService;
import cl.tutorial.spring.boot.demo.util.RestResponse;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired 
	UsuarioService usuarioService;
	
	@GetMapping(value = "/buscarUsuario", produces = "application/json")
	public Usuario buscarUsuario(@RequestParam(value = "idUsuario")Long idUsuario){
		
		Usuario usuario =this.usuarioService.buscarUsuario(idUsuario);
		if(usuario!=null){
			return usuario;
			
		}else{
			
			System.out.println("el usuario no esta registrado");
		}
		return usuario;
	}

}
