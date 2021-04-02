package com.csscorp.trainee.main;

import java.util.Arrays;

import com.csscorp.trainee.dto.Batch;
import com.csscorp.trainee.dto.Trainee;
import com.csscorp.trainee.exception.TraineeNotFoundException;

public class TraineeMain  {
	public static void main(String[] args)  {
		Trainee[] trainees = new Trainee[3];
           trainees[0] = new Trainee(123,"Nandan","9059446696","nandan.ponakala98@gmail.com","male",23);
			trainees[1] = new Trainee(456,"maha","736672384","maha98@gmail.com","female",27);
			trainees[2] = new Trainee(789,"kiyosaki","999888000","robertkiyosaki@gmail.com","male",26);
		Batch batch = new Batch(10,"21 Jan", "22 Feb",trainees);
		
			try {
	 
				System.out.println(Arrays.toString(batch.getTrainees(123)));
				System.out.println(Arrays.toString(batch.getTrainees("Male")));
			} catch (TraineeNotFoundException e) {
				// TODO Auto-generated catch block
				 e.printStackTrace();
	}
}


		
	
	}

