package org.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int testcases = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < testcases; i++)
		{
			try
			{
				Pattern.compile(scanner.nextLine());
				
				System.out.println("Valid");
			}
			
			catch(Exception e)
			{
				System.out.println("Invalid");
			}
		}
		
		scanner.close();
	}
}
