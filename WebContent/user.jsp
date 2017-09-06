<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
</head>
<body>
       <script type="text/javascript">
            function validate()
            {
                var a = document.getElementById("name");
                var age;
                try{
            		age = Number(document.getElementById("age").value); //get age
            	}
            	catch(err){
            		document.getElementById("age").innerHTML = err.message;
            	}
            	if(age=="" || isNaN(age))   {
                     alert("Please Enter proper age"); 
            	     return;
            	}
				
				
                var valid = true;
                if(a==null || a.value.length<=0 )
                    {
                        alert("Please Enter your Name!");
                        valid = false;
                    }
                    if(isNaN(b) ){
                            alert("Enter a valid number");
                    	valid = false;
                    }
                
                return valid;
            };

        </script>
<h1  align="center"> Enter Details to Know Your Premium </h1>
	  <form:form method="POST" action="/healthInsurancePremiumQuoteGenerator/addUserinfo"  onsubmit="return validate();" >
	                               
		<div>
			 Name:
			 <input type="text" name="name" id="name" value="Norman Gomes"><br><br>
			 Age:
			 <input type="text" id="age" name="age" value="34"><br><br><br>
				 <div id="gender">
				      <input type="radio" name="gender"  value="Male" checked> Male
					  <input type="radio" name="gender"  value="Female"> Female
                      <input type="radio" name="gender"  value="Other"> Other
                 </div>	  <br>
                 <div id="Problems">
                 	  <input type="checkbox" name="Problems"  value="Hypertension"> Hyper Tension
                 	  <input type="checkbox" name="Problems"  value="Blood pressure"> Blood pressure
                      <input type="checkbox" name="Problems"  value="Blood sugar"> Blood sugar
                      <input type="checkbox" name="Problems"  value="Overweight"> Overweight
                 </div>	<br>

                 <div id="habits">
				 	  <input type="checkbox" name="habits"  value="Smoking"> Smoking
				 	  <input type="checkbox" name="habits"  value="Alcohol"> Alcohol
				      <input type="checkbox" name="habits"  value="Daily exercise"> Daily exercise
				      <input type="checkbox" name="habits"  value="Drugs"> Drugs
                 </div>	<br>

			 <input type="submit" value="Submit" ></input>

		  </div>
		</form:form>

</body>
</html>