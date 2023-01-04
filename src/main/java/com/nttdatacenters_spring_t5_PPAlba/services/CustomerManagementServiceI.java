package com.nttdatacenters_spring_t5_PPAlba.services;

import java.util.List;

import com.nttdatacenters_spring_t5_PPAlba.persistence.Customer;

/**
 * 
 * @author Alba
 *
 */
public interface CustomerManagementServiceI {
	
	/**
	 * Almacena un cliente en la BBDD
	 * 
	 * @param c - Customer
	 */
	public void create(Customer c);
	
	/**
	 * Actualiza un cliente en la BBDD
	 * 
	 * @param c - Customer
	 */
	public void update(Customer c);
	
	/**
	 * Elimina un cliente de la BBDD
	 * 
	 * @param c - Customer
	 */
	public void delete(Customer c);
	
	/**
	 * Devuelve un cliente por su nombre y apellidos
	 * 
	 * @param name
	 * @param surname
	 * @return - Customer
	 */
	public Customer searchByNameAndSurnames(String name, String surnames);
	
	/**
	 * Devuelve un cliente por su ID
	 * 
	 * @param id
	 * @return - Customer
	 */
	public Customer searchById(int id);
	
	/**
	 * 
	 * @return Customers
	 */
	public List<Customer> searchAll();
}
