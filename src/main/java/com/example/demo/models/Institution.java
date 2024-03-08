package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;


public class Institution {
	
	private String name;
    private String owner;
    private int established;
    private List<Courses> courses = new ArrayList<Courses>();
	public Institution() {
	
		this.name = "SunSoft Technologies";
		this.owner = "Rahitya Teja";
		this.established = 2020;
	}
	
	public void addCourse(Object c)
	{
		courses.add((Courses)c);
	}

	@Override
	public String toString() {
		return "Institute [name=" + name + ", owner=" + owner + ", established=" + established + "]";
	}
    
    
    

}
