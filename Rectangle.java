package assignment5;

public class Rectangle extends Shape implements Comparable, Moveable {
	private int x;
	private int y;
	private int l;
	private int w;
	
	Rectangle(int x, int y, int l, int w) {
		this.l = l;
		this.w = w;
		this.x = x;
		this.y = y;
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

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public double getArea() {
		return l*w;
	}
	
	public String toString() {
		String s = this.getClass().toString();
		s = s + ": " + this.x + ", " + this.y + ", " + this.l + ", " + this.w + "; ";
		return s;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			
			if(this.l == other.l && 
					this.w == other.w &&
					this.x == other.x &&
					this.y == other.y) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int compareTo(Object obj) {
		// TODO: return -1, 1 or 0 depending on ordering.
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			
			if(this.getArea() < other.getArea()) {
				return -1;
			} else if(this.getArea() > other.getArea()) {
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}
	public void move(double deltax,double deltay) {
		x=x+(int)deltax;
		y=y+(int)deltay;
	}
}
