package assignment;
import java.util.Scanner;
class Invoice{
   private String part_no;
   private String desc;
   private int quantity;
   private double pricePerItem;


  Invoice(String part_no,String desc,int quantity,double pricePerItem){
	this.part_no=part_no;
	this.desc=desc;
	this.quantity=quantity;
	this.pricePerItem=pricePerItem;
  }

  public double computeTotalPrice(){
	    if(quantity<0)
	    	quantity=0;
	    if(pricePerItem<0)
	    	pricePerItem=0.0;
    	return quantity*pricePerItem;
  }


  public void setPrice(int pricePerItem){
	  this.pricePerItem=pricePerItem;
  }

  public String getPart_no(){
	return part_no;
  }
  
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a price per item: ");
		double price=sc.nextDouble();
		
		System.out.println(" Enter a quantity: ");
		int quantity=sc.nextInt();
		
		Invoice inv=new Invoice("a1","soap",quantity,price);
		System.out.println(" price of "+quantity+" soaps = "+inv.computeTotalPrice());
		
		System.out.println(" part no : "+inv.getPart_no());
		inv.setPrice(50);
		System.out.println(" price of "+quantity+" soaps = "+inv.computeTotalPrice());

	}

}
