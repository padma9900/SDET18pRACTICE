package qsp;

import java.util.LinkedHashSet;

public class OnlyUniqueWordInString {
	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] str = s.split(" ");

		//step1:create set coll and add all words of array
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
			
			//step2:compare each word of set with all word of given string
			
			
		for (String word : set) {
			
			{
				int count=0;
				for(int i=0;i<str.length;i++)
				{
					
				
				if(word.equals(str[i]))
				{
					count++;
				}
			}
				if(count==1)
			System.out.print(word+" ");
		}
	}
	}
}
