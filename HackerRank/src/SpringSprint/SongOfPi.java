package SpringSprint;

import java.util.Scanner;

public class SongOfPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t>0){
			String a = "31415926535897932384626433833";
			String s = sc.nextLine();
			boolean flag = true;
			String arr[] = s.split("\\s");
			for(int i=0;i<arr.length && i<a.length();i++){
				arr[i] = arr[i].replaceAll("[^\\w]", "");
				if(arr[i].length()!=Integer.parseInt(""+a.charAt(i)))
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("It's a pi song.");
			else
				System.out.println("It's not a pi song.");
			t--;
		}
	}

}
