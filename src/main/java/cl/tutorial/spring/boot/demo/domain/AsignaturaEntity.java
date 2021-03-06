package cl.tutorial.spring.boot.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignatura")
public class AsignaturaEntity implements Serializable {
	
	@Id
    @Column(name = "id_asignatura")
    private int id;
	@ManyToOne
    @JoinColumn(name = "nota")
	private NotaEntity idNota;
	
	@Column(name="nombre_asignatura",nullable=false,length=40)
	private String nombreAsig;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NotaEntity getIdNota() {
		return idNota;
	}

	public void setIdNota(NotaEntity idNota) {
		this.idNota = idNota;
	}

	public String getNombreAsig() {
		return nombreAsig;
	}

	public void setNombreAsig(String nombreAsig) {
		this.nombreAsig = nombreAsig;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((idNota == null) ? 0 : idNota.hashCode());
		result = prime * result + ((nombreAsig == null) ? 0 : nombreAsig.hashCode());
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
		AsignaturaEntity other = (AsignaturaEntity) obj;
		if (id != other.id)
			return false;
		if (idNota == null) {
			if (other.idNota != null)
				return false;
		} else if (!idNota.equals(other.idNota))
			return false;
		if (nombreAsig == null) {
			if (other.nombreAsig != null)
				return false;
		} else if (!nombreAsig.equals(other.nombreAsig))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", idNota=" + idNota + ", nombreAsig=" + nombreAsig + "]";
	}
	

}
