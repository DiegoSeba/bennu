package cl.tutorial.spring.boot.demo.domain.pk;

import java.io.Serializable;

import javax.persistence.Column;

public class UsuarioPK implements Serializable{
	
	@Column(name="id_usuario",nullable=false,length=5000)
	private Long idUsuario;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	

	@Override
	public String toString() {
		return "UsuarioPK [idUsuario=" + idUsuario + "]";
	}
	
	
	
	
	

}
