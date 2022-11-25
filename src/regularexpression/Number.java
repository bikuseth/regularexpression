package regularexpression;

import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	   System.out.println("enter your mobile no:");
	 
		String str = scan.next();
		String regex1="[1-2]{3}[4-6]{3}[7890]{4}";
		String regex2="[1-2]{3}-[4-6]{3}-[7890]{4}";
		String regex3="[1-2]{3}.[4-6]{3}.[7890]{4}";
		String regex4="[+][1-2]{4}[4-6]{3}[7890]{4}";
		String regex5="[+][1-2]{4}.[4-6]{3}.[7890]{4}";
		String regex6="[+][1-2]{3}-[4-6]{3}-[7890]{4}";
		String regex7="[1]{1}-[1-2]{3}-[4-6]{3}-[7890]{4}";
		
		if(str.matches(regex1)) {
			
			System.out.println("valid");
			
		}else if(str.matches(regex2)) {
			
			System.out.println("valid");
			
			
		}else if(str.matches(regex3)) {
			
			System.out.println("valid");
			
		}else if(str.matches(regex4)) {
			
			System.out.println("valid");
			
			
		}else if(str.matches(regex5)) {
			
			System.out.println("valid");
		}else if(str.matches(regex6)) {
			
			System.out.println("valid");
			
			
		}else if(str.matches(regex7)) {
			
			System.out.println("valid");
			
		}else {
			
			System.out.println("invalid");
		}
		
		
	}
}
