package cl.tutorial.spring.boot.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import cl.tutorial.spring.boot.demo.domain.pk.ParentEntity;
import cl.tutorial.spring.boot.demo.domain.pk.UsuarioPK;


	
	@Entity
	@Table(name="usuario")
	@NamedQueries({
		@NamedQuery(name = "Usuario.buscarUsuario", query = 
				"SELECT d FROM Usuario d WHERE d.id = :idUsuario")})
	public class Usuario  implements Serializable{


		private static final long serialVersionUID = 1358317738009113664L;
		
		//defino el nombre de la columna en la BD
		
	        @Id
	        @Column(name = "id_usuario")
	        private Long id;
			@ManyToOne
	        @JoinColumn(name = "id_persona")
			private Persona idPersona;
			
			
			@Column(name="username")
			private String username;
			
			
			@Column(name="password")
			private String password;

			


			public Persona getIdPersona() {
				return idPersona;
			}


			public void setIdPersona(Persona idPersona) {
				this.idPersona = idPersona;
			}


	        public Long getId() {
				return id;
			}


			public void setId(Long id) {
				this.id = id;
			}
			public String getUsername() {
				return username;
			}


			public void setUsername(String username) {
				this.username = username;
			}


			public String getPassword() {
				return password;
			}


			public void setPassword(String password) {
				this.password = password;
			}


			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((id == null) ? 0 : id.hashCode());
				result = prime * result + ((idPersona == null) ? 0 : idPersona.hashCode());
				result = prime * result + ((password == null) ? 0 : password.hashCode());
				result = prime * result + ((username == null) ? 0 : username.hashCode());
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
				Usuario other = (Usuario) obj;
				if (id == null) {
					if (other.id != null)
						return false;
				} else if (!id.equals(other.id))
					return false;
				if (idPersona == null) {
					if (other.idPersona != null)
						return false;
				} else if (!idPersona.equals(other.idPersona))
					return false;
				if (password == null) {
					if (other.password != null)
						return false;
				} else if (!password.equals(other.password))
					return false;
				if (username == null) {
					if (other.username != null)
						return false;
				} else if (!username.equals(other.username))
					return false;
				return true;
			}


			@Override
			public String toString() {
				return "Usuario [id=" + id + ", idPersona=" + idPersona + ", username=" + username + ", password="
						+ password + "]";
			}
			
			
			
			
			
			
			

			
			

			
			


			
			
			
			
			
	}			

