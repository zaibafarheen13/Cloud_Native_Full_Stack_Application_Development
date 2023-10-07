package Packages;
import java.util.Scanner;

import Packages.Circle.circle;
import Packages.Square.square;
import Packages.Triangle.triangle;

public class main {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        while(true){
            System.out.println("\nMenu\n1.Circle\n2.Square\n3.Triangle\n4.Exit");
            System.out.print("Enter your choice: ");
            int choice=scan.nextInt();
    
            switch(choice){
                case 1:
                    System.out.print("Enter radius: ");
                    double r=scan.nextDouble();
                    circle c=new circle(r);
                    System.out.println("Area of circle: "+ c.calculateArea());
                    break;
                case 2:
                    System.out.print("Enter side: ");
                    double si=scan.nextDouble();
                    square s=new square(si);
                    System.out.println("Areas of square: "+s.calculateArea());
                    break;
                case 3:
                    System.out.print("Enter base: ");
                    double b=scan.nextDouble();
                    System.out.print("Enter height: ");
                    double h=scan.nextDouble();
                    triangle t=new triangle(h,b);
                    System.out.println("Area of triangle: "+t.calculateArea());;
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");

        }
    }
    }
}
