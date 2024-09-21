/*

An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
=	1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
=	2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input :
=	200  -> Value of V
=	540   -> Value of W
Output :
=	TW =130 FW=70 
Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels
Constraints :
=	2<=W
=	W%2=0
=	V<W
Print INVALID INPUT , if inputs did not meet the constraints.
The input format for testing 
The candidate has to write the code to accept two positive numbers separated by a new line.
 -	First Input line  Accept value of V.
-	Second Input line Accept value for W.
 

*/
import java.util.Scanner;
class Program18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of vehicles :" );
		int V = sc.nextInt();
		System.out.println("Enter a value of wheels : ");
		int W = sc.nextInt();
		
		if (W < 2 || W % 2 != 0 || V >= W) {
        System.out.printf("INVALID INPUT\n");
        }

		 int TW = (4 * V - W) / 2;
		 int FW = V - TW;

	    if (TW < 0 || FW < 0) {
		System.out.printf("INVALID INPUT\n");
        }
    
		System.out.printf("TW=%d FW=%d\n", TW, FW);
    
	}
}