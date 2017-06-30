
public class Racer implements Runnable{
	int id, cont;

	public Racer(int id) {
		super();
		this.id = id;
	}
	
	public void run(){
		while(cont < 100){
			System.out.println("Racer " + id + "- imprimindo");
			cont++;
		}
	}
}
