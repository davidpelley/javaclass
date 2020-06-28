public class positivenegativezero{
	public static void main(String[]args){
		checkNumber(5);
		checkNumber(-10);
		checkNumber(0);
	
	}
	public static void checkNumber(int number){
		
		if(number > 0 ){
			System.out.println("Greater than zero");
		}
		else if (number < 0){
			System.out.println("Negative");
		}
		else 
			System.out.println("Zero");
	}
	
}