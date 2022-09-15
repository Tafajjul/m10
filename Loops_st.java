package practice;

import java.util.Iterator;
import java.util.Scanner;



public class Loops_st {

	public static void main(String[] args) {
		//Giving user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18 && age<607)
		{
			System.out.println("Eligible for drive");
		}
		else if(age>=18  && age<=28) {
			System.out.println("Focus on studies");
		}
		else {
			System.out.println("you are retired");
		}}}

//Switch statement
int x=10;
 switch (x) {
case 1: 
{
	
	System.out.println("case 1");
}

	case 2:
	{
		System.out.println("case 2");
	break;
	}
	
	case 10:
	{
		System.out.println("the value of " +x);
	}
	
	     //For loop
		for(int x= 0; x<5; x++)
		{
		System.out.println("Print the value of " +x);	
		
		}}}
		
		//iterative loop
		int x=10;
		do {
			System.out.println("print the value "+x);
		} 
		while (x>20);
	System.out.println("True");
	}}


 
	

		

 
	
		

