package com.springdemo.model;

import java.util.LinkedHashMap;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	private String firstName;
	
	
	
	private String lastName;
	private String country;
	private String favLang;
	
	private List<String> os;
	
	public String getFavLang() {
		return favLang;
	}
	public List<String> getOs() {
		return os;
	}
	public void setOs(List<String> os) {
		this.os = os;
	}
	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	private LinkedHashMap<String,String> countryOptions;
	
	public Student()
	{
		countryOptions= new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("COL", "Colombia");
		countryOptions.put("IND", "India");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
