package com.csscorp.trainee.dto;
	
public class Trainee {
		private int traineeId;
		private String traineeName;
		private String contactNo;
		private String email;
		private String gender;
		private int age;
		
		// TODO Auto-generated constructor stub
		public int getTraineeId() {
			return traineeId;
		}
		public void setTraineeId(int traineeId) {
			this.traineeId = traineeId;
		}
		public String getTraineeName() {
			return traineeName;
		}
		public void setTraineeName(String traineeName) {
			this.traineeName = traineeName;
		}
		public String getContactNo() {
			return contactNo;
		}
		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Trainee(int i, String n, String o, String l, String e, int g) {
			
			 traineeId = i;
		     traineeName = n;
			 contactNo = o;
		     email = l;
			 gender = e;
			 age = g;
		}
		public Trainee() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo
					+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
