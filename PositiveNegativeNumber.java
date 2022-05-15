package basicOfJava;

import java.util.Scanner;

public class PositiveNegativeNumber {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int number=sc.nextInt();
	if(number>0) {
		System.out.println("Number is positive");
		
	}
	else if(number<0){
		System.out.println("Number is negative");
		
	}else {
		System.out.println("number is zero");
	}
}
}
