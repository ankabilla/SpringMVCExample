package com.spring.learning;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby,String>{
    private String listOfHobbies;
    
	public void initialize(IsValidHobby isValidHobby){
		listOfHobbies = isValidHobby.listOfValidHobbies();
	}

	public boolean isValid(String hobbies, ConstraintValidatorContext arg1) {
		if(hobbies == null)
			return false;
		if(hobbies.matches(listOfHobbies))
			return true;
		else
			return false;
	}
     
	
	
}
