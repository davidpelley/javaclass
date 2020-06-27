public class operators{
	public static void main(String [] args){
        //logical and
        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score");
        }
        //logical or
        if ((topScore > 90) || (topScore <= 90)){
            System.out.println("Greater than second top score");
        }
        // assignment vs logical comparison
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(isCar = true){  // you're reassigning not comparing here
            System.out.println("This is not supposed to happen");
        }
        // ! not
        isCar = false; // reassign again
        if(!isCar){
        System.out.println("Testing the not operator!");
    }
        // ternary operator  ? --> short circuit if then
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
        if(!wasCar){
        System.out.println("wasCar is false");
        }
        // operator precedence
        // (), [], . highest   left to right
        // ++, --   unary post
        // ++, --, + , ! , - , ~, (type) unary pre, plus, not, minus, bitwise complement, unary typecast
        // *, /, % multiply, divide, modulo
        // +, - add, subtract
        // <<, >>, >>> bitwise left shift, bitwise right shift w sign extension, bitwise right shift with zero extension
        // <, <=, >, >=, instanceof --> type comparison of objects
        // =, !
        double first = 20.00d;
        double second = 80.00d;
        double total = first + second * 100.00d;
        System.out.println("Total = " + total);
        double remainder = total % 40.00d;
        System.out.println("Remainder = " + remainder);
        boolean isNoRemainder = (remainder==0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
        
	}
}