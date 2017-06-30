
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Racer r1 = new Racer(1);
		Racer r2 = new Racer(2);
		Racer r3 = new Racer(3);
		Racer r4 = new Racer(4);
		Racer r5 = new Racer(5);
		Racer r6 = new Racer(6);
		Racer r7 = new Racer(7);
		Racer r8 = new Racer(8);
		Racer r9 = new Racer(9);
		Racer r10 = new Racer(10);


		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		Thread t6 = new Thread(r6);
		Thread t7 = new Thread(r7);
		Thread t8 = new Thread(r8);
		Thread t9 = new Thread(r9);
		Thread t10 = new Thread(r10);
	
		t1.start();
		t3.start();
		t5.start();
		t7.start();
		t9.start();
		
        //come�a o segundo s� quando o primeiro � executado
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t2.start();
        
        //come�a o 4 s� quando o 3 � executado
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t4.start();
       
        //come�a o 6 s� quando o 5 � executado
        try {
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t6.start();
        
        //come�a o 8 s� quando o 7 � executado
        try {
            t7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t8.start();
        
        //come�a o 10 s� quando o 9 � executado
        try {
            t9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t10.start();
               
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("All threads are dead, exiting main thread");
    }	

}
