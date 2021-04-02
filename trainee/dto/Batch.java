package com.csscorp.trainee.dto;

	import java.util.Arrays;
	import java.util.Objects;

import com.css.corp.trainee.dao.TraineeDetails;
import com.csscorp.trainee.exception.TraineeNotFoundException;

	public class Batch {
		private int batchCode;
		private String startDate;
		private String endDate;
		private Trainee[] trainees;
		
		// TODO Auto-generated constructor stub
		public int getBatchCode() {
			return batchCode;
		}
		public void setBatchCode(int batchCode) {
			this.batchCode = batchCode;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public Trainee[] getTrainees() {
			return trainees;
		}
		public void setTrainees(Trainee[] trainees) {
			this.trainees = trainees;
		}
		
		@Override
		public String toString() {
			return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainees="
					+ Arrays.toString(trainees) + "]";
		}
public Batch(int d, String t, String e, Trainee[] s) {
			
			batchCode = d;
			startDate = t;
			endDate = e;
			trainees = s;
		}
		public Batch() {
			super();
			// TODO Auto-generated constructor stub
		}
		

		public  Trainee[] getTrainees(String gender) throws TraineeNotFoundException{
			Trainee[] foundTrainees = new Trainee[2];
			for(Trainee trainee : trainees ){
				if(trainee.getGender().equals(gender)){
					int i = 0;
					foundTrainees[i] = trainee;
					i++;
				}
			}
			return foundTrainees;
		}
		
		
		public  Trainee[] getTrainees(int traineeId) throws TraineeNotFoundException{
			Trainee[] foundTrainees = new Trainee[2];
			for(Trainee trainee : trainees ){
				if(trainee.getTraineeId()== traineeId){
					int i = 0;
					foundTrainees[i] = trainee;
					i++;
				}
			}
			
			return foundTrainees;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
