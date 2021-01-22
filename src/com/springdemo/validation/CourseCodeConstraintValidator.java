package com.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{
	
	
	private String coursePrefix;
	
	public void initialize(CourseCode theCode)
	{
		coursePrefix = theCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		boolean result=false;
		if(code!=null)
		{
			result=code.startsWith(coursePrefix);
		}
		else
		{
			result=true;
		}
		
		return result;
	}




}
