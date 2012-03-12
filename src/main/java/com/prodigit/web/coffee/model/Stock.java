package com.prodigit.web.coffee.model;


public class Stock {
	private Integer stock;
	private StockPK stockPK;
	
	public StockPK getStockPK() {
		return stockPK;
	}
	public void setStockPK(StockPK stockPK) {
		this.stockPK = stockPK;
	}
	
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
