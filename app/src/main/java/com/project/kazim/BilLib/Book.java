package com.project.kazim.BilLib;

public class Book
{
	//PROPERTIES
	private String name;
	private String callNum;
	private String auther;
	private String location;
	
	public Book (String name,String callNum,String auther,String location) {
		this.name=name;
		this.callNum = callNum;
		this.auther = auther;
		this.location = location;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCallNum() {
		return callNum;
	}
	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() 
	{
		return "Name: "+name+"\nCallNum: "+callNum+"\nAuther: "+auther+"\nLocation: "+location;
	}

	

	
}
