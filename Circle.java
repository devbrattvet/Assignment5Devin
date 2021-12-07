package assignment5;

public class Circle extends Shape implements Comparable, Moveable {
	private int x;
	private int y;
	private int r;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getArea() {
		return Math.PI * Math.pow(r, 2); 
	}
	
	public String toString() {
		String s = this.getClass().toString();
		s = s + ": " + this.x + ", " + this.y + ", " + this.r + "; ";
		return s;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle other = (Circle) obj;
			if (this.x == other.x && this.y == other.y && this.r == other.r) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Circle) {
			Circle other=(Circle)obj;
			if(this.getArea()<other.getArea()) {
				return -1;
			}
			else if(this.getArea()>other.getArea()) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		return 0;
	}
	
	public void move(double deltax,double deltay) {
		
	}
}
