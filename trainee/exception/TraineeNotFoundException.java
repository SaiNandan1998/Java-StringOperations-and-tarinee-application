package com.csscorp.trainee.exception;

import com.csscorp.trainee.dto.Batch;

public class TraineeNotFoundException extends Batch {
	private String errorMsg = "ID not found";

	public TraineeNotFoundException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public TraineeNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		return this.errorMsg;
	}
	
}

	

