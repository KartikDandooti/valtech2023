package corejava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import corejava.Point;

public class UtilTest {
	public static void testList(List<Point>points) {
		Point p=new Point(2,3);
		   Point p1=new Point(2,3);
//		   Set<Point> points=new HashSet<>();
		   points.add(p);
		   points.add(p1);
		   points.add(p);
		   System.out.println(points.size());
		   points.add(new Point(3,2));
		   points.add(new Point(3,2));
		   points.add(new Point(3,2));
		   System.out.println(points.size());
		
	}
	
	public static void testHashSet(Set<Point> points) {
		// method name start with small letter significant words capital
	   Point p=new Point(2,3);
	   Point p1=new Point(2,3);
//	   Set<Point> points=new HashSet<>();
	   points.add(p);
	   points.add(p1);
	   points.add(p);
	   System.out.println(points.size());
	   points.add(new Point(3,2));
	   System.out.println(points.size());
	   }
	public static void testMap(HashMap<String, Point>points) {
		points.put("2,3", new Point(2,3));
		points.put("3,2", new Point(3,2));
		points.put("3,3",new Point(3,3));
		points.put("3,4",new Point(3,4));
		points.put("3,4",new Point(3,6));
		System.out.println(points.size());
		System.out.println(points);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testHashSet(new HashSet<>());
//		testHashSet(new TreeSet<>());
//		testList(new ArrayList<>());
		testMap(new HashMap<String, Point>());

	}

}
