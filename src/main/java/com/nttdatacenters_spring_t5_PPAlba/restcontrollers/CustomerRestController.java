package com.nttdatacenters_spring_t5_PPAlba.restcontrollers;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdatacenters_spring_t5_PPAlba.persistence.Customer;

/**
 * 
 * @author Alba
 *
 */
@RestController
@RequestMapping("/home/customers")
public class CustomerRestController {
	
	//LOGGER//
	private static final Logger log = LoggerFactory.getLogger(CustomerRestController.class);
	
	//Map - Mapeo de los clientes//
	private Map<Integer, Customer> map = new HashMap<>();
	
	//CONSTRUCTOR//
	//MÉTODOS//
	public CustomerRestController() {
		
		log.info("Creación de clientes");
		
		log.info("Ceación Cliente 1");
		Customer c1 = new Customer();
		c1.setID(1);
		c1.setName("Alba");
		c1.setSurnames("Parrón Pérez");
		c1.setDNI(77807151);
		c1.setBirthDate(Date.valueOf("1993-06-26"));
		
		map.put(c1.getDNI(), c1);
		
		log.info("Creación Cliente 2");
		
		Customer c2 = new Customer();
		c2.setID(2);
		c2.setName("Santiago");
		c2.setSurnames("López Arredondo");
		c2.setDNI(60813254);
		c2.setBirthDate(Date.valueOf("2003-04-21"));
		
		map.put(c2.getDNI(), c2);
		
		log.info("Creación Cliente 3");
		
		Customer c3= new Customer();
		c3.setID(3);
		c3.setName("Christian");
		c3.setSurnames("Lobón Sevilla");
		c3.setDNI(54320981);
		c3.setBirthDate(Date.valueOf("2000-09-15"));
	
		map.put(c3.getDNI(), c3);
		
		log.info("Clientes Creados");
	}
	
	/**
	 * 
	 * @return Customers
	 */
	@GetMapping
	public Map<Integer, Customer> searchAll(){
		log.info("Busqueda de todos los clientes");
		return map;
	}
	
	/**
	 * Devuelve un solo cliente por su DNI
	 * 
	 * @param c - Customer
	 * @return Customer
	 */
	@GetMapping(path="/client", consumes="application/json")
	public Customer searchClient(@RequestBody Customer c) {
		log.info("Buscando cliente con DNI: {}", c);
		return map.get(c.getDNI());
	}
	
	/**
	 * Añade un cliente al repositorio
	 * 
	 * @param c - Customer
	 */
	@PostMapping
	public void addClient(@RequestBody Customer c) {
		log.info("Añadiendo cliente: {}", c);
		map.put(c.getDNI(), c);
	}
	
	/**
	 * Elimina un cliente por el pin o código del repositorio
	 * 
	 * @param pin
	 */
	@DeleteMapping(value = "/{pin}")
	public void deleteClient(final @PathVariable Integer pin) {
		log.info("Eliminando cliente con dni: {}", pin);
		map.remove(pin);
	}

}
