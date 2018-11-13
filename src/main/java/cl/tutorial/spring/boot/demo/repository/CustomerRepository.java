package cl.tutorial.spring.boot.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.tutorial.spring.boot.demo.domain.CustomerEntity;
import cl.tutorial.spring.boot.demo.domain.pk.CustomerPk;
import cl.tutorial.spring.boot.demo.repository.custom.CustomerRepositoryCustom;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,CustomerRepositoryCustom>{
	
	 boolean buscarCustomer(@Param("idCustomer") int idCustomer);
}
