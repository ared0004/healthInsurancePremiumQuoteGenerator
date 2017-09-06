<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Submitted User Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${name}</td>
         </tr>
         <tr>
            <td>Age</td>
            <td>${age}</td>
         </tr>
         <tr>
            <td>Gender</td>
            <td>${gender}</td>
         </tr>
         <tr>
            <td>Health Status</td>
            <td>${Problems}</td>
         </tr>
         <tr>
            <td>Habits</td>
            <td>${Habits}</td>
         </tr>
         
        
		
		<tr>
            <td><h1>Total Premium For ${Title} ${name} is :</h1></td>
            <td><h1>${Premium}</h1></td>
         </tr>
		
      </table>  
      
   </body>
   
</html>