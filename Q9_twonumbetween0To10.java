package InterviewPreparationAssignments;

import java.util.Scanner;

public class Q9_twonumbetween0To10 {
	
	public static void main(String[] args) {
		
		//Write a java program that accepts two "double" variables and test if both strictly between 0 and 10 and false otherwise.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number for a: ");
		
		float a = scanner.nextFloat();
		
        System.out.println("Enter a number for b: ");
		
		float b = scanner.nextFloat();
		
		if( (a >0 && a <10)  && (b >0 && b<10)) {
			
			System.out.println("True!");
			
		}else {
			
			System.out.println("False!");
		}
		
		scanner.close();
				
	}
	
}
