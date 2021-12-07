package assignment5;

public class Cuboid extends Rectangle {
	private int h;
	private int z;
	
	public Cuboid(int x, int y, int z, int l, int w, int h) {
		super(x, y, l, w);
		
		this.h = h;
		this.z = z;
	}
	
	public double getArea() {
//		2(ab + ac + bc)
		return 2*(getL()*getW() + getL()*h + getW()*h);
	}
	
	public double getVolume() {
		return getL()*getW()*h;
	}
	
	public String toString() {
		String s = super.toString();
		return s + ", " + h + ", " + z + "; ";
	}
	
	public boolean equals(Object obj) {
		if(super.equals(obj) == false) {
			return false;
		}
		
		if(obj instanceof Cuboid) {
			Cuboid other = (Cuboid) obj;
			if(this.h == other.h && this.z == other.z) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public int compareTo(Object cube1) {
		if(cube1 instanceof Cuboid) {
			Cuboid other=(Cuboid)cube1;
			if(this.getVolume()<other.getVolume()) {
				return -1;
			}
			else if(this.getVolume()>other.getVolume()) {
				return 1;
			}
			else {
				return 0;
			}
		}
		return 0;
	}
}
