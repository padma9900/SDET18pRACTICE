package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ProgramToPrintUniqueCharacter {
	public static void main(String[] args) {
		String s="india";
		
		//step1:craete set collection to remove duplicate of given string
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
		
			set.add(s.charAt(i));
			
		}
	//	System.out.println(set);
		 
		//step2:campare each char of set with all char of given string
		for (Character ch : set) {
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i)) 
				{
					count++;
				}
				
			}
			
			
		//step3:print char and count ,only duplicates so count should be greater than 1(the no of occurance)
			
	if(count==1)	//	if(count<=1)   //if(count<2)
				
					
			{
				System.out.print(ch);
		    }   
			
	}
		

	}
}
