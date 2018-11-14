package cl.tutorial.spring.boot.demo.domain.pk;

import java.io.Serializable;

import javax.persistence.Column;

public class PersonaPK implements Serializable{
	
	@Column(name="id_persona",nullable=false,length=5000)
	private int idPersona;

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPersona;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaPK other = (PersonaPK) obj;
		if (idPersona != other.idPersona)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonaPK [idPersona=" + idPersona + "]";
	}
	
	

}
