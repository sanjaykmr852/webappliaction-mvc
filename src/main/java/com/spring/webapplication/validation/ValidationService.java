package com.spring.webapplication.validation;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {

	public String doValidation(String parameter, String parameter2) {
		// TODO Auto-generated method stub
		if("sanjay".equalsIgnoreCase(parameter)&&"pass".equals(parameter2)) {
			return "success";
		}else {
			return "Error Invalid Credentials";
		}
	}

}
