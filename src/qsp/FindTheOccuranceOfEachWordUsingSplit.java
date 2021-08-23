package qsp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class FindTheOccuranceOfEachWordUsingSplit {
	
public static void main(String[] args) {
	String s="welcome to tyss";
	String[] str = s.split(" ");

	//step1:create set coll and add all words of array
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	
	for(int i=0;i<str.length;i++) {
		set.add(str[i]);
	}
		//System.out.println(set);
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
		System.out.println(word +"  "+count);
	}
}
}
}

