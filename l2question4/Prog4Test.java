package L3HW;

import java.util.Scanner;

public class Prog4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner shapes=new Scanner(System.in);
		System.out.println("Enter C for circle \n Enter R for Rectangle \n Enter T for triangle ");
		String input=shapes.nextLine().toUpperCase();
		
		switch(input) {
		
		case "C":
			System.out.println("please enter Radius of the Circle");
			String c=shapes.nextLine();
			double radius=Double.parseDouble(c);
			
			Circle c1= new Circle(radius);
			double x=c1.getRadius();
			System.out.println(" The area of the circle is: "+ c1.computeArea(x));
			shapes.close();
			break;
		case "T":
			System.out.println("please enter base of the Triangle");
			String input1t=shapes.nextLine();
			System.out.println("please enter height of the Triangle");
			String input2t=shapes.nextLine();
			double baset=Double.parseDouble(input1t);
			double heightt=Double.parseDouble(input2t);
			
			
			Triangle t= new Triangle(baset,heightt);
			double base1=t.getbase();
			double height1=t.getHeight();
			System.out.println("The area of the Triangle is: "+ t.computeArea(base1,height1));
			shapes.close();
			break;
		case "R":
			System.out.println("please enter width of the Rectangle");
			String input1r=shapes.nextLine();
			System.out.println("please enter height of the Rectangle");
			String input2r=shapes.nextLine();
			double widthr=Double.parseDouble(input1r);
			double heightr=Double.parseDouble(input2r);
			
			
			Rectangle r= new Rectangle(widthr,heightr);
			double widthr1=r.getWidth();
			double height2=r.getHeight();
			System.out.println("The area of the Triangle is: "+ r.computeArea(widthr1,height2));
			shapes.close();
			break;
		default:
			System.out.println("Incorrect input");
			shapes.close();
			break;
		}
	}

}
