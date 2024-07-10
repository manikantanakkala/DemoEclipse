package pack1;

import java.util.Scanner;

public class StringExecutor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter input string");
		String inputString=sc.nextLine();
		System.out.println("enter filter string");
		String filterString=sc.next();
		System.out.println("enter addition  string");
		String additionString=sc.next();
		
		StringFiter sf=new StringFiter();
		sf.setInputString(inputString);
		sf.setFilterString(filterString);
		sf.setAdditionString(additionString);
		
		sf.transform();
		String output=sf.getOutputString();
		System.out.println(output.strip());
;		
		
	}
}
