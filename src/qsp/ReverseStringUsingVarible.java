package qsp;

public class ReverseStringUsingVarible {

	public static void main(String[] args) {
		String s="padma";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		
	}
		System.out.print(rev);
}
}
