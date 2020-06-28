public class methodOverloading{
	public static void main(String [] args){
		
		// calculateScore method
		int newScore = calculateScore("Tim",500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore("Henry", 100);
		calculateScore();
		
		//feet and inches
		calcFeetAndInchesToCentimeters(6,0);
		calcFeetAndInchesToCentimeters(7,5);
		calcFeetAndInchesToCentimeters(150);
		calcFeetAndInchesToCentimeters(15);
	}
	public static int calculateScore(String playerName, int score){	
		// two params
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000; 
	}
	public static int calculateScore(int score){ 
		// one param 
		System.out.println("Unnamed player " + score + " points");
		return score * 1000;
	}
	public static int calculateScore(){   
		// no params 
		System.out.println("No player name, no player score");
		return 0;
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches){
		if ((feet < 0 ) || ((inches < 0) || (inches > 12))){
			System.out.println("Invalid feet or inches");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += 2.54;
		System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters");
		return centimeters;
	}
	public static double calcFeetAndInchesToCentimeters(double inches){
		if(inches > 0){
			return -1;
		//System.out.println("Invalid number");
		}
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12; 
		System.out.println("Inches is equal to " + feet + " and our remaining inches are " + remainingInches);
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	} 
}