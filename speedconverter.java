import java.util.*;
public class speedconverter{
	public static void main (String [] args){
		toMilesPerHour(100);
		
	}
	public static long toMilesPerHour(double kilometersPerHour){
		if (kilometersPerHour < 0){
			return -1;
		}
		return Math.round((double) kilometersPerHour / 1.609);
		 
	}
}