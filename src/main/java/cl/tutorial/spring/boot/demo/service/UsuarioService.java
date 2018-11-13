package cl.tutorial.spring.boot.demo.service;

import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.Usuario;

@Service
public interface UsuarioService {
	
	public Usuario buscarUsuario(Long idUsuario);

}
