package corejava;

public class PointImplCLass implements PointInterface{
	
	public int x;
	public int y;
	public PointImplCLass() {
		
	}
	public PointImplCLass(int x,int y) {
		this.x=x;
		this.y=y;
	}
 @Override
	public PointImplCLass add(PointImplCLass p, PointImplCLass p1, PointImplCLass p2) {
		// TODO Auto-generated method stub
	 p2.x=p.x+p1.x;
	 p2.y=p.y+p1.y;
		return p2 ;
	}

	@Override
	public PointImplCLass sub(PointImplCLass p, PointImplCLass p1, PointImplCLass p2) {
		// TODO Auto-generated method stub
		p2.x=p.x-p1.x;
		 p2.y=p.y-p1.y;
			return p2 ;
	}

	@Override
	public double dis(PointImplCLass p, PointImplCLass p1) {
		// TODO Auto-generated method stub
		int diffx=p1.x-p.x;
		int diffy=p1.y-p.y;
		return Math.sqrt(diffx*diffx+diffy*diffy);
	}
//	public String tostring() {
//		return (this.x+" "+this.y);
//	}
	
	public static void main(String[] args) {
		PointImplCLass p=new PointImplCLass(1,3);
		PointImplCLass p1=new PointImplCLass(2,3);
		PointImplCLass p2 = new PointImplCLass();
		PointInterface si=new PointImplCLass();
    	System.out.println(si.add(p, p1, p2));
		p2.display();
		System.out.println(si.sub(p, p1, p2));
     	p2.display();
		System.out.println(si.dis(p2, p1));
		}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.x);
		System.out.println(this.y);
		
	}
}

