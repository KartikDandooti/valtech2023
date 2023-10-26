package day3;

public class ThreadTest {
	public static class PrinterThread extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+" "+i);
				
			}
			
		}
	}
	public static class PrintThreadByInterface implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+""+i);
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new PrinterThread().start();
		new PrinterThread().start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread()+""+i);
					
				}
				
			}
		}).start();
		new Thread(new PrintThreadByInterface()).start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread()+""+i);
			
		}
	}
	

}
