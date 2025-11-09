package sincronización;

public class Increaser extends Thread{

	public Counter counter;
	
	public Increaser(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 1000000; i++) {
			
		}
	}
}
