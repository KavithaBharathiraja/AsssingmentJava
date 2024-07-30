package InterviewPreparationAssignments;

import java.util.Scanner;

public class Q7_fibonacci {

	public static void main(String[] args) {
		// 7.WJP to print Fibonacci series using for loop
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a possitive number: ");
		
		
		int n = scanner.nextInt();
		
		
		int a =0;
		int b =1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 0; i < n; i++) {		
			int c = a+b;
			a =b;
			b =c;	
		
			System.out.println(c);
		}
		
		scanner.close();
		
		
	}

}
