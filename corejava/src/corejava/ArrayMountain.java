package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMountain {
	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(4,2,3,2,1);
		System.out.println(checkAsending(l1));
		
		
	}
	 private static boolean checkAsending(List<Integer> l1) {
		// TODO Auto-generated method stub
		 boolean res1=false;
		 
		 static int middle=0;
		 
		 for(int i=0;i<l1.size()-1;i++) {
			 if(l1.get(i)<l1.get(i+1))
			 { 
				 res1 =true;
			   middle=i+1;
			   System.out.println(middle);
			 }
			 break;
		 }
//		 System.out.println(res1);
		 System.out.println(middle);
		 static int last=0;
		 
		 boolean res2=false;
		 
		 for(int j=middle+1;j<l1.size()-1;j++) {
//			 System.out.println(middle);
			 if(l1.get(j) > l1.get(j+1)) {
				 res2=true;
				 System.out.println(res2);
		        last=j+1;
		        System.out.println(last);
			 }
			 
			 
			 break;
			 
			
			
		 }
//		 System.out.println(res2);
		 System.out.println(last);
				 
		if(res1==res2 && last==(l1.size()-1)) {
			return true;
		}
		return false;
			 
		 
		
	}

}
