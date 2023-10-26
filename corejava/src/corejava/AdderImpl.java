package corejava;

public class AdderImpl  implements Adder{

	public int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Adder a=new AdderImpl();
		System.out.println(a.add(2,3));
		
		Adder a1=new Adder() {
			
			@Override// anonmous class
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		//lambda expression
		
		Adder a2=(i,j) -> {return i+j;};
		System.out.println(a2.add(4,50));
	}
}
