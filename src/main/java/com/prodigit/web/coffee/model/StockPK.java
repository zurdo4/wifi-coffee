package com.prodigit.web.coffee.model;

import java.io.Serializable;

public class StockPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6044234639516598064L;
	private Integer idproduct;
	private Integer idwarehouse;
	
	
	public StockPK(Integer idproduct, Integer idwarehouse ){
		this.idproduct = idproduct;
		this.idwarehouse = idwarehouse;
	}
	
	public StockPK(){
	}	
	
	
	public void setIdwarehouse(Integer idwarehouse) {
		this.idwarehouse = idwarehouse;
	}
	public Integer getIdwarehouse() {
		return idwarehouse;
	}
	public void setIdproduct(Integer idproduct) {
		this.idproduct = idproduct;
	}
	public Integer getIdproduct() {
		return idproduct;
	}	

	public boolean equals(Object o){
		if ( o !=null && o instanceof StockPK){
			 if (((StockPK)o).idproduct.intValue() == this.getIdproduct() && ((StockPK)o).idwarehouse.intValue() == this.idwarehouse)
			 return true;
		}
		return false;
	}
	
	public int hashCode(){
		return 0;
		
	}
	
	
	
}
