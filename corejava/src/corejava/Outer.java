package corejava;

public class Outer {
private int x=0;

//if constructor is private class is public ,object is allowed created within that class 

public Inner createInner(){
	return new Inner();
}


public static interface abcd{
	
}
public abstract static class StaticInner implements abcd{
	public void jumpBy10(Outer o) {
		o.x=o.x+10;
	}
	public abstract void jump100(Outer o);
}

public class Inner{
	public void printx() {
		System.out.println(x);
	}
	public void Increment() {
		x++;
	}
	
}
public static void main(String[] args) {
	Outer o=new Outer();
	Outer.Inner i=o.createInner();
	i.printx();
	Outer.Inner i1=o.createInner();
	i1.Increment();
	i.printx();
	new Outer().createInner().printx();
	StaticInner si=new StaticInner() {
		
		@Override
		public void jump100(Outer o) {
			o.x=o.x+100;
			// TODO Auto-generated method stub
			
		}
	};
	si.jump100(o);
	si.jumpBy10(o);
	i.printx();
	Arthmetic a1=new Arthmetic() {
		
		@Override
		public int sub(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int mul(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int div(int a, int b) throws DivideByZero {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
}

}
