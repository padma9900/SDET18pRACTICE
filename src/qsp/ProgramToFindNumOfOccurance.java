package qsp;

import java.util.HashSet;

public class ProgramToFindNumOfOccurance {
	
	public static void main(String[] args) {
		String s="india";
		
	//step1:craete set collection to remove duplicate of given string
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		//	System.out.println(s.charAt(i));
		}
		
		 
		//step2:compare each char of set with all char of given string
		for (Character ch : set) {
			int count=0;  //NO OF OCCURANCE
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i)) 
				{
					count++;
				}
				
			}
			////step3:print char and count
			System.out.println(ch  +"="+count);
		}
	}

}
