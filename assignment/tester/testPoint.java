package tester;
import java.util.Scanner;
import com.app.geometry.point2D;
public class testPoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter co ordinates of p1 point: ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        
        System.out.println("Enter co ordinates of p2 point: ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        
        point2D pt=new point2D(x1,x2,y1,y2);
      
        pt.getDetails();
        boolean isvalid=pt.isEqual();
        
        if(isvalid==false) {
          System.out.println("both coordinates are on same point.");	
          return;
        } 
        double distance=pt.computeDistance();
        System.out.println("distance between point p1 and p2 = "+distance);
        
      }

}
