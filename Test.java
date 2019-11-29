import java.util.Random;

class MyThread extends Thread {

	@Override
	public void run() {

		try {
			System.out.println();
			Random r = new Random();
			Thread.sleep(r.nextInt((15000 - 5000) + 1) + 5000);
			System.out.println("Bana müsade (Thread " + this.getName() + ")");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Test {

	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.setName("1");
		t2.setName("2");
		t3.setName("3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("Thread 1 oluþturuldu." + "\nThread 2 oluþturuldu." + "\nThread 3 oluþturuldu.");
		
		int sinyal=3;
		boolean t1Gulegule=false,t2Gulegule=false,t3Gulegule=false;
		
		while(sinyal!=0) {
			Thread.sleep(100);
			if(!t1.isAlive() && t1Gulegule==false) {
				System.out.println("Thread 1! Yolun açýk olsun.");
				t1Gulegule=true;
				sinyal--;
			}
			else if(!t2.isAlive() && t2Gulegule==false) {
				System.out.println("Thread 2! Yolun açýk olsun.");
				t2Gulegule=true;
				sinyal--;
			}
			else if(!t3.isAlive() && t3Gulegule==false) {
				System.out.println("Thread 3! Yolun açýk olsun.");
				t3Gulegule=true;
				sinyal--;
			}
		}

	}
}