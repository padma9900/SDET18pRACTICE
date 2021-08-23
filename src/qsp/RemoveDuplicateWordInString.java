package qsp;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordInString {

	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] str = s.split(" ");

		//step1:create set coll and add all words of array
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
			
			
		for (String word : set)
		    {
			System.out.println(word);
			}
	}
}