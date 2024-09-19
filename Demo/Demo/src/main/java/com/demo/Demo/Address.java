package com.demo.Demo;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="isopen")
	private boolean isopen;
	
	@Transient
	private double x;
	
	@Column(name="Added_date")
	@Temporal(TemporalType.DATE)
	private Date added_date;
	
	@Lob
	private byte[] addimage;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String street, String city, boolean isopen, double x, Date added_date, byte[] addimage) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
		this.added_date = added_date;
		this.addimage = addimage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isIsopen() {
		return isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAdded_date() {
		return added_date;
	}

	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}

	public byte[] getAddimage() {
		return addimage;
	}

	public void setAddimage(byte[] addimage) {
		this.addimage = addimage;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", isopen=" + isopen + ", x=" + x
				+ ", added_date=" + added_date + ", addimage=" + Arrays.toString(addimage) + "]";
	}
	
	

}
