package com.sxf.goods.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Goods {

	private Integer gid;
	private String gname;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datea;
	
	private Brand brand;//多对一
	private Integer bid;
	private String bname;
	private Goodskind goodskind;//多对一
	
	private Double price;
	private Integer status;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Date getDatea() {
		return datea;
	}
	public void setDatea(Date datea) {
		this.datea = datea;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Goodskind getGoodskind() {
		return goodskind;
	}
	public void setGoodskind(Goodskind goodskind) {
		this.goodskind = goodskind;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	
	
}
