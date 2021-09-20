package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	
	@Id
	@Column(name="PRD_ID")
	private int prdid;
	

	@Column(name="PRD_NAME")
	private String prdName;
	

	@Column(name="PRD_COST")
	private double prdCost;
	public Product() {
		super();
	}
	public Product(int prdid, String prdName, double prdCost) {
		super();
		this.prdid = prdid;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}
	public int getPrdid() {
		return prdid;
	}
	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}
	@Override
	public String toString() {
		return "Product [prdid=" + prdid + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}
	
	
	
}
