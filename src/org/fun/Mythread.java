package org.fun;

public class Mythread extends Thread{
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
	}
	
	

}
