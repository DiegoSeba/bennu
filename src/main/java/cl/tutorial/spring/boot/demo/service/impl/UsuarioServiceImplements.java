package cl.tutorial.spring.boot.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.Usuario;
import cl.tutorial.spring.boot.demo.repository.UsuarioRepository;
import cl.tutorial.spring.boot.demo.service.UsuarioService;

@Service
public class UsuarioServiceImplements implements UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	public Usuario buscarUsuario(Long idUsuario)
	{
		
		
		Usuario usuario =usuarioRepository.buscarUsuario(idUsuario);
		
		
		
		return usuario;
	}

}
