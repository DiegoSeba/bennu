package cl.tutorial.spring.boot.demo.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cl.tutorial.spring.boot.demo.domain.pk.ParentEntity;



@Entity
@Table(name="heroes")
public class Heroe extends ParentEntity implements Serializable{


	private static final long serialVersionUID = 1358317736009113664L;
	
	//defino el nombre de la columna en la BD
	
		
		@Column(name="nombre",nullable=false,length=25)
		private String nombre;
		
		
		@Column(name="bio",nullable=false,length=5000)
		private String bio;
		
		
		@Column(name="ruta_imagen",nullable=false,length=30)
		private String ruta_imagen;
		
		
		@Column(name="casa",nullable=false,length=25)
		private String casa;
		
		
		@Column(name="fecha_aparicion", nullable=false,length=25)
		private String fecha_aparicion;

		public String getNombre() {
			return nombre;
		}

		public String getBio() {
			return bio;
		}

		public String getRuta_imagen() {
			return ruta_imagen;
		}

		public String getCasa() {
			return casa;
		}

		public String getFecha_aparicion() {
			return fecha_aparicion;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setBio(String bio) {
			this.bio = bio;
		}

		public void setRuta_imagen(String ruta_imagen) {
			this.ruta_imagen = ruta_imagen;
		}

		public void setCasa(String casa) {
			this.casa = casa;
		}

		public void setFecha_aparicion(String fecha_aparicion) {
			this.fecha_aparicion = fecha_aparicion;
		}
		
		@Override
	    public int hashCode() {
	        int hash = 5;
	        hash = 89 * hash + Objects.hashCode(this.nombre);
	        hash = 89 * hash + Objects.hashCode(this.bio);
	        hash = 89 * hash + Objects.hashCode(this.ruta_imagen);
	        hash = 89 * hash + Objects.hashCode(this.casa);
	        hash = 89 * hash + Objects.hashCode(this.fecha_aparicion);
	        
	        return hash;
	    }
		
		@Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Heroe other = (Heroe) obj;
	        if (!Objects.equals(this.nombre, other.nombre)) {
	            return false;
	        }
	        if (!Objects.equals(this.bio, other.bio)) {
	            return false;
	        }
	        if (!Objects.equals(this.casa, other.casa)) {
	            return false;
	        }
	        if (!Objects.equals(this.fecha_aparicion, other.fecha_aparicion)) {
	            return false;
	        }
	        if (!Objects.equals(this.ruta_imagen, other.ruta_imagen)) {
	            return false;
	        }
	        
	        
	        return true;
	    }

		@Override
		public String toString() {
			return "Heroe [nombre=" + nombre + ", bio=" + bio + ", ruta_imagen=" + ruta_imagen + ", casa=" + casa
					+ ", fecha_aparicion=" + fecha_aparicion + "]";
		}
		
		
		
		
}
