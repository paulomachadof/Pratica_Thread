
public class Racerb extends Thread {
	int id;

	public Racerb(int id) {
		super();
		this.id = id;
	}
	
	public void run(){
		while(true){
			System.out.println("Racer " + id + "- imprimindo");
		}
	}
}
