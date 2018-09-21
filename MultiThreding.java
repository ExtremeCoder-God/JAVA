import java.util.*;

class FirstThread extends Thread{
	public void run(){
	System.out.println("Using extends Thread");
		for (int i=0; i<5; i++) {
			System.out.println("FirstThread "+i);
		}
		System.out.println("Returning from FirstThread");
	}
}

class SecondThread implements Runnable{
	public void run(){
	System.out.println("Using Runnable");
		for (int i=0; i<5; i++) {
			System.out.println("SecondThread "+i);
		}
		System.out.println("Returning from SecondThread");
	}
}

class MultiThreding {
	public static void main(String[] args) {
		FirstThread T1 = new FirstThread();
		T1.run();
		Thread T2 = new Thread(new SecondThread());
		T2.start();
	}
}