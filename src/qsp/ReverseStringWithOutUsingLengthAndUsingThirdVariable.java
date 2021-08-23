package qsp;

import java.util.Iterator;

public class ReverseStringWithOutUsingLengthAndUsingThirdVariable {
	public static void main(String[] args) {
		String s="india";
		char[] c = s.toCharArray();
		int count=0; // NO OF OCCURANCE
		
		for (char ch : c) {
			count++;
			
		}
	String	rev="";
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
			
	}

}
