package SpringSprint;

import java.util.Scanner;

public class TimeInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		String s = "";
		if(m==0)
			System.out.println(convertToWord(h)+" o' clock");
		//else if(m<=30)
			//System.out.println(convertToWord(h)+" past "+);
	}
	public static String convertToWord(int n){
		switch(n){
			case 1: return "one";
			case 2: return "two";
			case 3: return "three";
			case 4: return "four";
			case 5: return "five";
			case 6: return "six";
			case 7: return "seven";
			case 8: return "eight";
			case 9: return "nine";
			case 10: return "ten";
			case 11: return "eleven";
			case 12: return "twelve";
			case 13: return "thirteen";
			case 14: return "fourteen";
			case 15: return "quarter";
			case 16: return "sixteen";
			case 17: return "seventeen";
			case 18: return "eighteen";
			case 19: return "nineteen";
			case 20: return "twenty";
			case 30: return "half";
			default: return "";
		}
	}
}
