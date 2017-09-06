package com.healthInsurancePremiumQuoteGenerator;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class InsuranceQuoteGenerator {
	
	 BeanFactory factory = new XmlBeanFactory(new FileSystemResource("C:\\Users\\30161064\\eclipse-workspace\\healthInsurancePremiumQuoteGenerator\\WebContent\\WEB-INF\\HelloWeb-servlet.xml"));

	   @RequestMapping(value = "/user", method = RequestMethod.GET)
	   public ModelAndView user() {
	      return new ModelAndView("user", "command", new Userinfo());
	   }
	   @RequestMapping(value = "/addUserinfo", method = RequestMethod.POST)
	      public String addUserinfo(@ModelAttribute("userinfo")Userinfo userinfo, 
	   
	   ModelMap model) {
		   
	      model.addAttribute("name", userinfo.getName());
	      model.addAttribute("age", userinfo.getAge());
	      if(userinfo.getGender().toUpperCase().contains("FEM"))	
	    	  model.addAttribute("Title", "Mis/Mrs.");
	     
	      else if(userinfo.getGender().toUpperCase().contains("MALE"))
	    	  model.addAttribute("Title", "Mr.");
	      else 
	    	  model.addAttribute("Title", "");
	    	  
	    	  
	      model.addAttribute("gender", userinfo.getGender());
	      model.addAttribute("Problems", userinfo.getProblems());
	      model.addAttribute("Habits", userinfo.getHabits());
	      model.addAttribute("Premium", getInsuranceQuoteGenerator(userinfo));
	      
	      
	      
	      return "result";
	   }
	   
	   public double getInsuranceQuoteGenerator(Userinfo userinfo)	{
		  // String title="";
		   double extra_perc=0.0, tot_premium=0.0, basic_premium=5000.00;
		    int c_age = userinfo.getAge();
		    if(c_age<=18)
				extra_perc=0.0;
			else if(c_age<=25)	{
				extra_perc=10;
			}
			else if(c_age<=30)	{
				extra_perc=20;
			}
			else if(c_age<=35)	{
				extra_perc=30;
			}
			else if(c_age<=40)	{
				extra_perc=40;
			}
			else {
				int gap = c_age-40;
				extra_perc = 40+ ((gap/5)*20);
				
			}
		    
		    String gender = userinfo.getGender();
		    if(gender.toUpperCase().startsWith("MALE"))	{
		    	extra_perc+=2;
		    	//title = "Mr.";
		    }
		    //else if(gender.toUpperCase().startsWith("FEM"))
		    	//title = "Mis/Mrs.";

	         
		    List<String> health =userinfo.getProblems();
		    
		    
		    if (health != null) {
		       
		        for (String h : health) {
		        	extra_perc+=1;
		        }
		    }
		    
		    List<String> habits = userinfo.getHabits();
		    
		    if (habits != null) {
		        //System.out.println("Languages are: ");
		        for (String h : habits) {
		             if(h.toUpperCase().contains("ALC") || h.toUpperCase().contains("SMOK") || h.toUpperCase().contains("DRUG"))
		            	extra_perc+=3; 
		             else
		            	 extra_perc-=3;
		        }
		    }
	        tot_premium = basic_premium + (basic_premium*(extra_perc/100));
		   
		   return tot_premium;
		   
	   }

	
	

}
