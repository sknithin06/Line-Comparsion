package Bridgelabz;
import java.util.*;
public class line {
	void distance(double x1, double x2, double y1, double y2) {
		double p = 2;
		double x= Math.pow((x2 - x1),p) + Math.pow((y2- y1),p);
		System.out.println("Length of the Line is:"+Math.sqrt(x));
	}
	void checkEquality(double a1, double a2, double b1, double b2, double c1, double c2) {
		if (a1 / a2 == b1 / b2) {
			if (b1 / b2 == c1 / c2) {
				if (a1 / a2 == c1 / c2) {
					System.out.println("Lines are identical");
				}
			}
		}
		else
			System.out.println("Lines are not identical");
	}
	void compareLength(double x1, double x2, double y1, double y2, double m1, double m2, double n1, double n2) {
		double g1 = (y2 - y1) * m1 + (x1 - x2) * n1
	            + (x2 * y1 - x1 * y2);
		double g2 = (y2 - y1) * m2 + (x1 - x2) * n2
	            + (x2 * y1 - x1 * y2);;
	     if (Double.compare(g1, g2) == 0) {
	    	 System.out.println("Both lines are equal");
	     }
	     else if (Double.compare(g1, g2) < 0) {        
	    	 System.out.println("One line is lesser than another line");
	     }
	     else {
	    	 System.out.println("One is greater than another line");
	     }
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
	
	System.out.print("Enter first number:");  
	double a1=sc.nextInt();  
	System.out.print("Enter second number:");  
	double a2=sc.nextInt();  
	System.out.print("Enter third number:");  
	double b1= sc.nextInt();  
	System.out.print("enter fourth number:");
	double b2= sc.nextInt();
	System.out.print("Enter fifth number:");  
	double c1=sc.nextInt();  
	System.out.print("Enter sixth number:");  
	double c2=sc.nextInt(); 
	
	System.out.print("Enter first number- ");  
	double m1=sc.nextInt();  
	System.out.print("Enter second number- ");  
	double m2=sc.nextInt();  
	System.out.print("Enter third number- ");  
	double n1= sc.nextInt();  
	System.out.print("enter fourth number-");
	double n2= sc.nextInt();
	
	line point = new line();
	point.distance(x1, x2, y1, y2);
	point.checkEquality(a1, a2, b1, b2, c1, c2);
	point.compareLength(x1, x2, y1, y2, m1, m2, n1, n2);
	}
}
