package areaofcircle;
import java.util.Scanner;
class areaofcircle {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter area of circle:");
double radius = sc.nextDouble();
double area = Math.PI * (radius*radius);
System.out.println("the area of circle is:"+area);

double circumference=Math.PI * 2*radius;
System.out.println("the area of circumference of the circle is:"+circumference);


	}

}
