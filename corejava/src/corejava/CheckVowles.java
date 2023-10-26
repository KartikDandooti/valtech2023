package corejava;

import java.util.HashMap;

public class CheckVowles {
	public static void main(String[] args) {
		String s="Hello how are you";
		String [] words=s.split(" ");
		System.out.println(words[0]);
	HashMap<String , Integer> count=new HashMap<String, Integer>();
		
		for(int i=0;i<words.length;i++)  {
			count.put(words[i],0);
			for(int j=0; j<words[i].length(); j++) {
				char current=words[i].charAt(j);
				if(current=='a'|| current=='e'||current=='i'||current=='o'||current=='u') {
					count.put(words[i],(count.get(words[i])+1));
				}
				
			}
			
			
		}
		int max=0;
		count.get
		HashMap<String , Integer> sort=new HashMap<String, Integer>();
		HashMap<String , Integer> sort1=new HashMap<String, Integer>();
		
		for(int i=0;i<words.length;i++) {
		
		 if(count.get(words[i])>=max) {
			 
			 max=count.get(words[i]);
			 sort.put(words[i],count.get(words[i]));
			 
		 }
		 else {
			 sort1.put(words[i],count.get(words[i]));
			 
			 
		 }
		}
		
		System.out.println(sort);
		System.out.println(sort1);
		for(e:count.entrySet()) {
			
		}
	}

}
