package cl.tutorial.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.tutorial.spring.boot.demo.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario buscarUsuario(@Param ("idUsuario")Long idUsuario);
		
	

}
