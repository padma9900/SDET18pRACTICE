package qsp;

public class ReverseStringWithOutUsingLengthVarible {

	public static void main(String[] args) {
		String s="india";
		char[] c = s.toCharArray();
		int count=0;
		
		for (char ch : c) {
			count++;
			
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
	}
}
