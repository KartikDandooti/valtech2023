package corejava;

public interface Arthmetic {
	int ZERO= 0;// by default these are constant ie static final
	
  int add(int a,int b);// by these method is public not default
  int sub(int a,int b);
  int mul(int a,int b);// method overloading possible 
  int div(int  a,int b)throws DivideByZero;
  
}
