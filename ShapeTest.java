package assignment5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Circle> array= new ArrayList<>();
		Circle c1=new Circle(0,1,2);
		array.add(c1);
		Circle c2=new Circle(3,2,4);
		array.add(c2);
		Circle c3=new Circle(4,5,1);
		array.add(c3);
		Collections.sort(array);
		System.out.println(array);
		
		ArrayList<Rectangle> array2=new ArrayList<>();
		Rectangle r1=new Rectangle(5,10,20,3);
		array2.add(r1);
		Rectangle r2=new Rectangle(4,8,5,2);
		array2.add(r2);
		Rectangle r3=new Rectangle(6,9,8,10);
		array2.add(r3);
		Collections.sort(array2);
		System.out.println(array2);
		
		c1.move(3,2);
		r2.move(2,3);
		System.out.println(array);
		System.out.println(array2);
		
		Cuboid cu1=new Cuboid(5,10,2,20,3,2);
		Cuboid cu2=new Cuboid(4,8,6,5,2,10);
		int x=cu1.compareTo(cu2);
		if(x==-1) {
			System.out.println(cu2);
		}
		else if(x==1) {
			System.out.println(cu1);
		}
		else {
			System.out.println("They are the same");
		}
		
	}

}
