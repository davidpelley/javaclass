public class swytch{
	public static void main(String [] args){
		// if else
		int value = 3;
		if(value == 1){
			System.out.println("Value was 1");
		}
		else if (value == 2){
			System.out.println("Value was 2");
		}
		else{
			System.out.println("Value was not 1 or 2");
		}
		// switch 
		int switchValue = 4;
		switch (switchValue){
			case 1: 
			System.out.println("Value was 1");
			break;
			case 2:
			System.out.println("Value was 2");
			break;
			case 3: case 4: case 5: 
			System.out.println("Was a 3 or a 4 or a 5");
			System.out.println("Actually it was a " + switchValue);
			break;
			default:
			System.out.println("Value was not 1, 2, 3, 4 or 5");
			break;
		}
		// char switch statement
		char switchChar = 'G';
		switch(switchChar){
			case 'A': 
			System.out.println("Value was A");
			break;
			case 'B': 
			System.out.println("Value was B");
			break;
			case 'C': 
			System.out.println("Value was C");
			break;
			case 'D': 
			System.out.println("Value was D");
			break;
			case 'E': 
			System.out.println("Value was E");
			break;
			default: 
			System.out.println("Value was not A, B, C, D or E");
			break;
		}
		String month = "July";
		switch(month){
			case "January": 
			System.out.println("January");
			break;
			case "February": 
			System.out.println("February");
			break;
			case "March": 
			System.out.println("March");
			break;
			case "July": 
			System.out.println("July ;)");
			break;
			default:
			System.out.println("Don't want to write all 12 months");
			break;
		}
	}
}