package exercise_spring_demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	//Create an array of strings
	private String[] data = {
			"You will have a great day!",
			"Never give up!",
			"Hardwork brings real fortune!"
	};
	
	//create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
