package InterviewPreparationAssignments;

import java.util.HashMap;

public class Q1_findDuplicateCharacter {
	//1.How to find duplicate characters in a String?
	
	public static void main(String[] args) {
		
		
		String Str = "I love java Coding";
		
		Str = Str.toLowerCase().replace(" ", "");
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		
		for(char c : Str.toCharArray() ) {
			
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c) +1);	
				
			}else {
				
				map.put(c, 1);
			}
		}
		
		
 StringBuilder  Duplicatecharacters = new  StringBuilder();
	
		 
		 for(char c : map.keySet() ) {
			 
			 if(map.get(c)> 1) {
				
				 Duplicatecharacters.append(c);
			 }
		 }
		 
		 System.out.println("Duplicatecharacters are: " + Duplicatecharacters);
		 
		 
		 
		
		System.out.println(map);
		
		
		
	}
	
	
	
}
