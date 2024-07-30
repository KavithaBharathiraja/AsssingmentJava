package InterviewPreparationAssignments;

import java.util.Scanner;

public class Q8_fournumbersqual {

	public static void main(String[] args) {
		// 8.Write a java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a posstive number for a: ");
		
		 int a = scanner.nextInt();
		
		 System.out.println("Enter a posstive number for b: ");
			
		 int b = scanner.nextInt();
		 
		 System.out.println("Enter a posstive number for c: ");
			
		 int c = scanner.nextInt();
		 
		 System.out.println("Enter a posstive number for d: ");
			
		 int d = scanner.nextInt();
		
		 
		 if(a==b && b ==c && c == d) {
			 
			 System.out.println("four numbers are equal!");
			 
		 }else {
			 
			 System.out.println("four numbers are not equal!");
			 
		 }
		
		
		
	}

}
