package com.sportapplication.model;

//import javax.persistence.Column;
//import javax.persistence.Table;


//@Table(name = "Schedule")
public class MatchSchedule 
{
	//@Column(name = "NAME")
	String name;
	//@Column(name = "DATE")
	String date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
