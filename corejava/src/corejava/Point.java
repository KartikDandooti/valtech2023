package corejava;

import java.io.Serializable;

public class Point implements Comparable<Point> ,Serializable{
	public static final Point ORIGIN=new Point();// constant
	static {
		ORIGIN.x=1000;
		ORIGIN.y=1000;
		}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		
		
	}
	protected int x=10;// 
	protected int y=20;
	
	public Point(){
//		System.out.println("point class");
		}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point p=(Point) obj;
		return p.x==x && p.y==y;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return toString().hashCode();
	}
	public double distance(Point other) {
		System.out.println("distance from one point to another");
		return distance(other.x,other.y);
		
	}
	public double distance(int x,int y) {
		int diffx=this.x-x;
		int diffy=this.y-y;
		return Math.sqrt(diffy*diffy+diffx*diffx);
	}
	
	public double distance(){
		// normally methods are public data are private
		System.out.println("point");
		return Math.sqrt(x*x +y*y);
		
	}
	public String toString() {
		return "X="+x+" Y="+y+" Distance= "+distance();
	

}
	public static void main(String[] args) {
		Point p=new Point();
		p.x=10;
		p.y=20;
		//
		System.out.println(p);
	}
	
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		return (x-o.x==0)? (y-o.y):(x-o.x);
	}
}
