package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {
	
	private void traditionl() {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7);
		List <Integer> sqrs=new ArrayList<Integer>();
		for(int i:l1) {
			sqrs.add(i*i);
		}
		System.out.println(l1);
		System.out.println(sqrs);
		

	}
	public static void main(String[] args) {
		Streams s1=new Streams();
		s1.traditionl();
		
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> sqrs=l1.stream().map(i->i*i).collect(Collectors.toList());
		
		List<Integer> odd= l1.stream().filter(i->(i%2)==1).collect(Collectors.toList());
		
		
		
		
	}
	
	
}
		
