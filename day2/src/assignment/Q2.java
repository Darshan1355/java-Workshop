package assignment;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		  System.out.print("Enter a 1st no: ");
		  
		  if(!sc.hasNextDouble() || sc.hasNextInt())
		    {
			  System.out.print("Error! enter correct no! ");
			  sc.close();
	          return;
        	}
		  double no1=sc.nextDouble();
		  
			System.out.print("Enter a 2nd no: ");
			if(!sc.hasNextDouble() || sc.hasNextInt())
			{
				System.out.print("Error!Enter correct no! ");
				sc.close();
				return;
			}
			double no2=sc.nextDouble();
		
		System.out.print("Average of two numbers = "+((no1+no2)/2));
	}

}
