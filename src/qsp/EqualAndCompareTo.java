package qsp;

public class EqualAndCompareTo {
public static void main(String[] args) {
	

	String s="welcome";
	String s1="tyss";
	
	//adress of the varible return type boolean
	System.out.println(s==s1);
	
	// it ll going to check the content(value)
	System.out.println(s.equals(s1));
	
	//it ll comapre with first ascii value
	System.out.println(s.compareTo(s1)); 
	
	
}
}