package InterviewPreparationAssignments;

import java.util.Scanner;

public class Q6_positivenegativecheck {

	public static void main(String[] args) {
		// WJP to check if Number is Positive or Negative using If loop.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		if(number >0) {
			
			System.out.println("Number is a posstive number");
		}else if(number < 0) {
				
			System.out.println("Number is a negative number");
			}else {
				
				System.out.println("Number is a Zero");
		}
		
	scanner.close();
	}

}
