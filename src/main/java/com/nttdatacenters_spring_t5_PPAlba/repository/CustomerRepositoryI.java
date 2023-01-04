package com.nttdatacenters_spring_t5_PPAlba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdatacenters_spring_t5_PPAlba.persistence.Customer;

/**
 * 
 * @author Alba
 *
 */
public interface CustomerRepositoryI extends JpaRepository<Customer, Integer>{
	/**
	 * Método para devolver un cliente que se busque por su nombre y apellidos
	 * 
	 * @param name
	 * @param surname
	 * @return Customer
	 */
	public Customer findByNameAndSurnames(String name, String surnames);
	
	/**
	 * Método para devolver un cliente que se busque por su ID
	 * 
	 * @param id
	 * @return
	 */
	public Customer findById(int id);
}
