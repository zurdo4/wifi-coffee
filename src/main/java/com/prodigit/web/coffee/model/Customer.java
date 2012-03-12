package com.prodigit.web.coffee.model;

// Generated 1/05/2011 12:57:56 PM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer idcustomer;
	private String name;
	private String address;
	private Set carts = new HashSet(0);

	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}

	public Customer(String name, String address, Set carts) {
		this.name = name;
		this.address = address;
		this.carts = carts;
	}

	public Integer getIdcustomer() {
		return this.idcustomer;
	}

	public void setIdcustomer(Integer idcustomer) {
		this.idcustomer = idcustomer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

}