package corejava;

public class Point3D extends Point{

    transient int z=30;
	
	 public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	
	@Override
	public double distance() {
		// TODO Auto-generated method stub
		System.out.println("point3D");
		return Math.sqrt(x*x+ y*y+z*z);
	}
	public static void main(String[] args) {
		Point3D p1=new Point3D(10,20,30);
		//System.out.println(p1.x);
		System.out.println(p1);
		
		}
	public String toString(){
		return "x= "+x+" y= "+y+" z= "+z;
	}
		
		public boolean equals(Object obj) {
			Point3D p1=(Point3D) obj;
			//to conform the object referring is itself
			return p1.x==x && p1.y==y && p1.z==z;
			
		

	
	}
	

}
