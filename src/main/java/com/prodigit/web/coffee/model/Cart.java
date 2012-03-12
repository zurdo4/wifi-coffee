package com.prodigit.web.coffee.model;

// Generated 1/05/2011 12:57:56 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Cart generated by hbm2java
 */
public class Cart implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 691353990617711597L;
	private Integer idcart;
	private Customer customer;
	private Date dtcart;
	private Integer stcart;
	private Set itemcarts = new HashSet(0);

	public Cart() {
	}

	public Cart(Customer customer, Date dtcart) {
		this.customer = customer;
		this.dtcart = dtcart;
	}

	public Cart(Customer customer, Date dtcart, Integer stcart, Set itemcarts) {
		this.customer = customer;
		this.dtcart = dtcart;
		this.stcart = stcart;
		this.itemcarts = itemcarts;
	}

	public Integer getIdcart() {
		return this.idcart;
	}

	public void setIdcart(Integer idcart) {
		this.idcart = idcart;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDtcart() {
		return this.dtcart;
	}

	public void setDtcart(Date dtcart) {
		this.dtcart = dtcart;
	}

	public Integer getStcart() {
		return this.stcart;
	}

	public void setStcart(Integer stcart) {
		this.stcart = stcart;
	}

	public Set getItemcarts() {
		return this.itemcarts;
	}

	public void setItemcarts(Set itemcarts) {
		this.itemcarts = itemcarts;
	}

}
