package assignment;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		int row;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j<=row;j++)
			{
	        	System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
