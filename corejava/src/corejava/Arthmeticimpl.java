package corejava;

public class Arthmeticimpl implements Arthmetic {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		if(a<b) {
			return b-a;
		}else 
		return a-b;
	}

	@Override
	public int mul(int a, int b) {

		return a*b;
	}

	@Override
	public int div(int  a,int b) throws DivideByZero {
		if(b==0) {
			throw new DivideByZero ("zero cannot be used as Denominator");
		}
		return a/b;
	}
	public static void main(String[] args) {
		Arthmetic a=new Arthmeticimpl();
		System.out.println(a.add(5, 9));
		System.out.println(a.mul(5, 9));
		try {
			System.out.println(a.div(5, 0));
		} catch (DivideByZero e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(a.sub(5, 9));
		
	}

}
