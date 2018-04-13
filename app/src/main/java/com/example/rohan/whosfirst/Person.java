package com.example.rohan.whosfirst;

import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable {
	private String name;
	private ArrayList<CompDate> times;

	public Person(String n){
		name = n;
	}

	public void addTime(CompDate newTime){
		times.add(newTime);
	}

	public String getName(){
		return name;
	}
	public ArrayList<CompDate> getTimes(){
		return times;
	}
}
