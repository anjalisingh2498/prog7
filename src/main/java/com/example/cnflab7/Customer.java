package com.example.cnflab7;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	
	private String lastName;

	protected Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
