package qsp;

public class UseOfSplit {

	public static void main(String[] args) {
		String s="prakasha";
		String[] str = s.split("a");
		for (String string : str) {
			System.out.println(string);
		}
		System.out.println(str.length); //length varible of given array of string
		System.out.println(s.length());//length of given array of string
	}
}
