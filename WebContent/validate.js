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
            }