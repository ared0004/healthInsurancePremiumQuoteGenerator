package com.healthInsurancePremiumQuoteGenerator;

import java.util.List;

public class Userinfo {
	private Integer age;
	   private String name;
	   private String gender;
	   private List<String> problems;
	   private List<String> habits;
	  // private int effect=0;

	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setGender(String gender) {
	      this.gender = gender;
	   }
	   public String getGender() {
	      return gender;
	   }
	   public void setProblems(List<String> problems) {
		    this.problems = problems;
	   }
	   public List<String> getProblems() {
		   
		   return  problems;
				  
	      
	   }
	   public void setHabits(List<String> habits) {
	      this.habits = habits;
	   }
	   public List<String> getHabits() {
		 
		   
	      return habits;
	   }
	   


}
