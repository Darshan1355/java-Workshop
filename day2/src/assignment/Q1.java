package assignment;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no: ");
		int no=sc.nextInt();
		System.out.println("Octal of number is "+Integer.toOctalString(no));
		System.out.println("Binary of number is "+Integer.toBinaryString(no));
		System.out.println("Hexadecimal of number is "+Integer.toHexString(no));
		
	}

}
