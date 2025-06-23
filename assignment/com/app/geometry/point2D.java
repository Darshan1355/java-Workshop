package com.app.geometry;
import tester.testPoint;
import java.lang.Math;
public class point2D {
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	
	public point2D(int x1,int x2,int y1,int y2){
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public boolean isEqual() {
		if(x1==x2 && y1==y2 && x1==y1)
			return false;
		else 
			return true;
	}
	
	public void getDetails() {
		System.out.println("point p1 co ordinates = p1("+x1+","+y1+")");
		System.out.println("point p2 co ordinates = p2("+x2+","+y2+")");
	}
	
	public double computeDistance() {
		double dist=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return dist;
	}
}
