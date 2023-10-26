package corejava;

public class SimpleInterestImpl implements SimpleInterest{
	private Arthmetic arthmetic;
	
	public SimpleInterestImpl(Arthmetic arthmetic) {
		this.arthmetic=arthmetic;
		// TODO Auto-generated constructor stub
	}


	public void setArthmetic(Arthmetic arthmetic) {
		this.arthmetic = arthmetic;
	}

	
	@Override
	public double computeInterest(int prin, int roi, int duration) {
		// TODO Auto-generated method stub
		int result= arthmetic.mul(prin, roi);
		result=arthmetic.mul( result,duration);
		return arthmetic.div( result,100);
	}
	public static void main(String[] args) {
		Arthmetic arthmetic=new Arthmeticimpl();
		SimpleInterest si=new SimpleInterestImpl(arthmetic);
		System.out.println(si.computeInterest(200,3,4));
	}
	

}
