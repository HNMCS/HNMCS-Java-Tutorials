/* Wednesday 19 October 2016
 * Lesson 3 - Instructor Misaki Dai
 * Calling Functions/Methods
 * Input Output - Scanner - java.utilities
 * Java utilities are downloaded with Eclipse
 * Good book for learning Java "Head First Java"
 */
import java.util.Scanner;									// Imports go outside
public class lesson3{
	public static void main(String[] args){                 // MAIN METHOD - put code here
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the number here:");
		int x = s.nextInt();								// get x from user
		int y = f(x);
		
		System.out.println(y);
	}

	public static int f(int x){
		int y=3*x+6+22;
		return y;
	}
	
}


