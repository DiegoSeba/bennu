package cl.tutorial.spring.boot.demo.service;

import org.springframework.stereotype.Service;

import cl.tutorial.spring.boot.demo.domain.CustomerEntity;

@Service
public interface CustomerService {
	
	boolean buscarCustomer(int idCustomer) ;

}
