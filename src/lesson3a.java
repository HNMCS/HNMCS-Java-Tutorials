/* Wednesday 26 October 2016
 * Lesson 3a - Instructor Dr. Kozma
 * FOR loops, Calling Functions/Methods, Input Output
 * Write a program to count from user input to user input + 10 by 1s, 2s
 */

import java.util.Scanner;									// Imports go outside
public class lesson3a{
	public static void main(String[] args){                 // MAIN METHOD - put code here
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the starting number here:");
		int x = s.nextInt();								// get x from user
		int y = f(x);
		
		for (int ii=x; ii<=y; ii++){
		   System.out.print(" "+ii+" ");
		}
	}

	public static int f(int x){
		int y=x+10;
		return y;
	}
	
}