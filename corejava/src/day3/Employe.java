package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employe {
	String name;
	double salary;
	int experience;
	int age;
	int seniority;
	public Employe(String name,double salary,int experience,int age,int seniority) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.experience=experience;
		this.seniority=seniority;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name= "+name+" "+"Experience= "+experience+" "+" seniority="+seniority;
	}
	
	public int getExp() {
		return this.experience;
	}
	
	public int getSeniority(){
		return this.seniority;
	}
	public String getName() {
		return this.name;
	}
	
	public static void sortingByName(List<Employe> elist) {
		Collections.sort(elist,new Comparator<Employe>() {

			@Override
			public int compare(Employe o1, Employe o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		for(Employe e:elist) {
			System.out.println(e);
		}
		
	}
	public static void sortByExperience(List<Employe>elist) {
		Collections.sort(elist,new Comparator<Employe>() {

			@Override
			public int compare(Employe o1, Employe o2) {
				// TODO Auto-generated method stub
				return o2.getExp()-(o1.getExp());
			}
		});
		for(Employe e:elist) {
			System.out.println(e);
		}
		
		
	}
	public static void sortBySeniority(List<Employe>elist) {
		Collections.sort(elist,new Comparator<Employe>() {
			@Override
			public int compare(Employe o1, Employe o2) {
				// TODO Auto-generated method stub
				return o1.getSeniority()-(o2.getSeniority());
			}
		
		});
		for(Employe e:elist) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		List<Employe> elist=new ArrayList<Employe>();
		elist.add(new Employe("kartik", 40000, 10, 23, 1));
		elist.add(new Employe("pradeep", 40000, 8 ,23, 4));
		elist.add(new Employe("praveen", 40000, 7, 23, 3));
		elist.add(new Employe("govind", 40000, 5, 23, 2));
		System.out.println("sort by names\n");
		sortingByName(elist);
		System.out.println("\nsort by experience\n");
		sortByExperience(elist);
		System.out.println("\nsort by seniority\n");
		sortBySeniority(elist);
		
		}

}
