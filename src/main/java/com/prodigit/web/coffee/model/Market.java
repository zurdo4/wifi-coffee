package com.prodigit.web.coffee.model;

// Generated 1/05/2011 12:57:56 PM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Market generated by hbm2java
 */
public class Market implements java.io.Serializable {

	private Integer idmarket;
	private String dsmarket;
	private int lft;
	private int rgt;
	private Set prices = new HashSet(0);

	public Market() {
	}

	public Market(String dsmarket, int lft, int rgt) {
		this.dsmarket = dsmarket;
		this.lft = lft;
		this.rgt = rgt;
	}

	public Market(String dsmarket, int lft, int rgt, Set prices) {
		this.dsmarket = dsmarket;
		this.lft = lft;
		this.rgt = rgt;
		this.prices = prices;
	}

	public Integer getIdmarket() {
		return this.idmarket;
	}

	public void setIdmarket(Integer idmarket) {
		this.idmarket = idmarket;
	}

	public String getDsmarket() {
		return this.dsmarket;
	}

	public void setDsmarket(String dsmarket) {
		this.dsmarket = dsmarket;
	}

	public int getLft() {
		return this.lft;
	}

	public void setLft(int lft) {
		this.lft = lft;
	}

	public int getRgt() {
		return this.rgt;
	}

	public void setRgt(int rgt) {
		this.rgt = rgt;
	}

	public Set getPrices() {
		return this.prices;
	}

	public void setPrices(Set prices) {
		this.prices = prices;
	}

}
