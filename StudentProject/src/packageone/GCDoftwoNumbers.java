package packageone;
import java.util.Scanner;
public class GCDoftwoNumbers {

	public static void main(String[] args) {
	 
		int x = 10, y = 4, gcd = 1;  
		//running loop form 1 to the smallest of both numbers  
		for(int i = 1; i <= x && i <= y; i++)  
		{  
		//returns true if both conditions are satisfied   
		if(x%i==0 && y%i==0)  
		//storing the variable i in the variable gcd  
		gcd = i;  
		}  
		//prints the gcd  
		System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
		}  
		}  
