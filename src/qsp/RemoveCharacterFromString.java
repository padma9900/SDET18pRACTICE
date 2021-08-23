package qsp;

import java.util.LinkedHashSet;

public class RemoveCharacterFromString {
	public static void main(String[] args) {
		String s="india";
		
		//step1:craete set collection to remove duplicate of given string
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
		
			set.add(s.charAt(i));
			
		}
		
		for (Character ch : set) {
			System.out.print(ch);
		}    
	}
	
}
