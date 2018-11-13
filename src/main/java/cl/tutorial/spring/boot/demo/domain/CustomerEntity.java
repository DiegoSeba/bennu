package cl.tutorial.spring.boot.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import cl.tutorial.spring.boot.demo.domain.pk.CustomerPk;

@Entity
@Table(name="customer")

@NamedQueries({
	
	@NamedQuery(name = "CustomerEntity.buscarCustomer", query = "SELECT d "
	    + " FROM customer d WHERE d.customer_id = :idCustomer"),
		
	    })





















public class CustomerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CustomerPk id;
	
	
	@Column(name="nombre",nullable=false,length=255)
	private String email;
	@Column(name="name",nullable=false,length=255)	
	private String name;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
