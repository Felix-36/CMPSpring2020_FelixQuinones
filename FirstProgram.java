/**
 * 
 * @author Felix
 * Created : 1.29.20
 * desc. : This program calculates the Birth Year
 **/

import java.util.Scanner;
public class FirstProgram {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Welcome to my first Program\n" + "This progrma calculates the Birth Year");
		
		System.out.println("Enter Your Age:");
		int age = keyboard.nextInt();
		
		int BY = 2020-age;
		System.out.println("The most likely year you were born is "+ BY + ".");
	}
}
