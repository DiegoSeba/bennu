package cl.tutorial.spring.boot.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="nota")
public class NotaEntity implements Serializable {
	//identificador de la tabla
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_nota", unique=true, nullable=false  )
    private int id;
	
	@Column(name = "nota",nullable=false)
    private float nota;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(nota);
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
		NotaEntity other = (NotaEntity) obj;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(nota) != Float.floatToIntBits(other.nota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nota [id=" + id + ", nota=" + nota + "]";
	}

	
}
