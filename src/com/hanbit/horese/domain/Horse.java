package com.hanbit.horese.domain;

public class Horse {
 private String name, number;
 public Horse(String number,String name){
	 this.name=name;
	 this.number=number;
 }
 	public String getName(){
 		return name;
 	}
 	public String getNumber(){
 		return number;
 	}
}
