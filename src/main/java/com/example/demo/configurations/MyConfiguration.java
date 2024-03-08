package com.example.demo.configurations;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.models.Courses;
import com.example.demo.models.Institution;

@Configuration
public class MyConfiguration {
	
	@Bean("course")
	@Scope("prototype")
	public Courses getCourse() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course:");
		String name=  sc.next();
		System.out.println("Enter Duration:");
		double duration = sc.nextDouble();
		System.out.println("Enter Fee:");
		int fees = sc.nextInt();
		return new Courses(name,duration,fees);
	}
	
	@Bean(name = "institute")
	public Institution getInstitute()
	{
		return new Institution();
	}
	
	

}
