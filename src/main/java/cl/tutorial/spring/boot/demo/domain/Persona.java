package cl.tutorial.spring.boot.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import cl.tutorial.spring.boot.demo.domain.pk.PersonaPK;



@Entity
@Table(name="persona")
public class Persona implements Serializable {
	
private static final long serialVersionUID = 1358317738009113664L;
	
	//defino el nombre de la columna en la BD
	
		@EmbeddedId
		private PersonaPK id;
		@Column(name="nombre",nullable=false,length=25)
		private String nombre;
		
		
		@Column(name="apellido",nullable=false,length=5000)
		private String apellido;
		
		
		


		public PersonaPK getId() {
			return id;
		}


		public void setId(PersonaPK id) {
			this.id = id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
			Persona other = (Persona) obj;
			if (apellido == null) {
				if (other.apellido != null)
					return false;
			} else if (!apellido.equals(other.apellido))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
		}


			
		
		
		
		
	

	
	

}
