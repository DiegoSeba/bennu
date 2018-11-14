package cl.tutorial.spring.boot.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


import cl.tutorial.spring.boot.demo.repository.CustomerRepository;

public class CustomerServiceImpl {
	
	@Autowired 
	CustomerRepository customerRepository;
		
	
	public boolean buscarCustomer(int idCustomer)  {
		
		return customerRepository.buscarCustomer(idCustomer);
	
	}

}
