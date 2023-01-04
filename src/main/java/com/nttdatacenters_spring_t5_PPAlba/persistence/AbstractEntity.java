package com.nttdatacenters_spring_t5_PPAlba.persistence;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * 
 * @author Alba
 *
 */
@MappedSuperclass
public class AbstractEntity implements Serializable {
	
	//Serializable//
	private static final long serialVersionUID = 1L;
}
