package com.nttdatacenters_spring_t5_PPAlba.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nttdatacenters_spring_t5_PPAlba.persistence.Customer;
import com.nttdatacenters_spring_t5_PPAlba.repository.CustomerRepositoryI;

/**
 * 
 * @author Alba
 *
 */
public class CustomerManagementServiceImpl implements CustomerManagementServiceI{

	//Logger//
	private static final Logger log = LoggerFactory.getLogger(CustomerManagementServiceImpl.class);

	@Autowired
	CustomerRepositoryI customerRepo;
	
	//Métodos CRUD//
	
	@Override
	public void create(Customer c) {
		customerRepo.save(c);	
		log.info("Creación de cliente");
	}
	
	@Override
	public void update(Customer c) {
		log.info("Actualización del cliente: {}", c);
		customerRepo.save(c);
		log.info("Cliente actualizado");
		
	}

	@Override
	public void delete(Customer c) {
		log.info("Eliminación del cliente: {}", c);
		customerRepo.delete(c);
		log.info("Cliente eliminado");
		
	}
	
	@Override
	public Customer searchByNameAndSurnames(String name, String surnames) {
		log.info("Busqueda de cliente por nombre y apellidos");
		log.info("Cliente devuelto {}", customerRepo.findByNameAndSurnames(name, surnames));
		return customerRepo.findByNameAndSurnames(name, surnames);
	}
	
	@Override
	public Customer searchById(int id) {
		log.info("Búsqueda de cliente por ID");
		log.info("Cliente devuelto {}", customerRepo.findById(id));
		return customerRepo.findById(id);
	}
	
	@Override
	public List<Customer> searchAll() {	
		return customerRepo.findAll();
	}
	
}
