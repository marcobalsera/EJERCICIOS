package ejemplosClase;

import java.util.Objects;

public class Coordinate {

	private int x;
	private int y;
	
	public Coordinate (int i, int j) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
	
	
}
