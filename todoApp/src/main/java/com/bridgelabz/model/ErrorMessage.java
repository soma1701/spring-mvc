package com.bridgelabz.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
	
	String errorMsg;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String string) {
		this.errorMsg = string;
	}
	

}
