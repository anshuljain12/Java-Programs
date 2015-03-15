package SpringSprint;

import java.util.Scanner;

public class identifySmithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int suma=0;
		int sumb = getSum(n);
		for(int i=2;n>1;i++){
			while(n%i==0){
				suma+=getSum(i);
				n=n/i;
			}
		}
		if(suma==sumb)
			System.out.println(1);
		else
			System.out.println(0);
	}
	public static int getSum(int n){
		int sum = 0;
		while(n>0){
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
}
