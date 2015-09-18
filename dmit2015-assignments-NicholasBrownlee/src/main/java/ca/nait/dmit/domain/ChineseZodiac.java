package ca.nait.dmit.domain;

/**
 * This class ChineseZodiac is used to determine the animal type of a user based on the input of their 
 * Birth Year by doing a calculation and outputting a remainder.
 * @author Nicholas Brownlee
 * @version 2015.09.18
 */
public class ChineseZodiac {
	
	private int birthYear;
	
	public ChineseZodiac() {
		this.birthYear = 1900;
	}	
	
	public ChineseZodiac(int birthYear) {
		super();
		this.birthYear = birthYear;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * This method utilizes the input from the user (Birth Year) and equates the remainder for an
	 * Animal of the ChineseZodiac.
	 * @param birthYear the Birth Year of user input.
	 * @return The Animal of the user for the ChineseZodiac.
	 */
	public static String animal(int birthYear) {
		
		String Animal = null;
		
		int remainder = (birthYear - 1900)%12;
				
		if (remainder == 0){
			Animal = "Rat";
		} else if (remainder == 1){
			Animal = "Ox";
		} else if (remainder == 2){
			Animal = "Tiger";
		} else if (remainder == 3){
			Animal = "Rabbit";
		} else if (remainder == 4){
			Animal = "Dragon";
		} else if (remainder == 5){
			Animal = "Snake";
		} else if (remainder == 6){
			Animal = "Horse";
		} else if (remainder == 7){
			Animal = "Goat";
		} else if (remainder == 8){
			Animal = "Monkey";
		} else if (remainder == 9){
			Animal = "Rooster";
		} else if (remainder == 10){
			Animal = "Dog";
		} else {
			Animal = "Pig";
		}
		
		return Animal;
	}
}


