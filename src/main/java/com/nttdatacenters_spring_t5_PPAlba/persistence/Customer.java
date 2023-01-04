package com.nttdatacenters_spring_t5_PPAlba.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Alba
 *
 */

@Entity
@Table(name= "CLIENTE")
public class Customer implements Serializable{
	
	//Serializable//
	private static final long serialVersionUID = 1L;
	
	//Atributos//
	private int ID;
	private String name;
	private String surnames;
	private Integer DNI;
	private Date birthDate;
	
	//Métodos Getter y setter//
	/**
	 * 
	 * @return ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getID() {
		return ID;
	}
	/**
	 * 
	 * @param iD
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
	/**
	 * 
	 * @return name
	 */
	@Column(name = "Nombre")
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return surname
	 */
	@Column(name= "Apellidos")
	public String getSurnames() {
		return surnames;
	}
	/**
	 * 
	 * @param surname
	 */
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	/**
	 * 
	 * @return DNI
	 */
	@Column(name= "DNI")
	public Integer getDNI() {
		return DNI;
	}
	/**
	 * 
	 * @param dNI
	 */
	public void setDNI(Integer DNI) {
		this.DNI = DNI;
	}
	/**
	 * 
	 * @return birthDate
	 */
	@Column(name="Fecha_Nacimiento")
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * 
	 * @param birthDate
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Customer (Id = " +ID+ ",Name = " +name+ ",Surnames = " +surnames+ ",DNI = " +DNI+ ",birthDate = " +birthDate;
	}
	
}
