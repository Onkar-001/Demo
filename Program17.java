/*
Write a C program to input month number and print total number of days in month using switch...case. C program to find total number of days in a month using switch...case. Logic to print number of days in a month using switch...case in C programming.
Example
Input
Input month number: 3
Output
Total number of days = 31

*/
import java.util.Scanner;
class Program17 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of month (1-12 ) : " );
			int n = sc.nextInt();
			switch (n)
			{
			case 1:
				System.out.print("Total number of days : 31");
			break;
			case 2:
				System.out.print("Total number of days : 29");
			break;
			case 3:
				System.out.print("Total number of days : 31");
			break;
			case 4:
				System.out.print("Total number of days : 30");
			break;
			case 5:
				System.out.print("Total number of days : 31");
			break;
			case 6:
				System.out.print("Total number of days : 30");
			break;
			case 7:
				System.out.print("Total number of days : 31");
			break;
			case 8:
				System.out.print("Total number of days : 31");
			break;
			case 9:
				System.out.print("Total number of days : 30");
			break;
			case 10:
				System.out.print("Total number of days : 31");
			break;
		   case 11:
				System.out.print("Total number of days : 30");
			break;
			case 12:
				System.out.print("Total number of days : 31");
			break;
			default :
				System.out.print("Enter valid number !!! ");
			}
	}
}