package Bridgelabz;
import java.util.*;
public class line {
	void distance(double x1, double x2, double y1, double y2) {
		double p = 2;
		double x= Math.pow((x2 - x1),p) + Math.pow((y2- y1),p);
		System.out.println("Length of the Line is:"+Math.sqrt(x));
	}
	
	public static void main(String[] args) {
	System.out.println("Welcome to Line Comparsion");
	
	Scanner sc = new Scanner(System.in);   
	System.out.print("Enter first number:");  
	double x1=sc.nextInt();  
	System.out.print("Enter second number:");  
	double x2=sc.nextInt();  
	System.out.print("Enter third number:");  
	double y1= sc.nextInt();  
	System.out.print("enter fourth number:");
	double y2= sc.nextInt();
	
	line point = new line();
	point.distance(x1, x2, y1, y2);
	}
}
