package Abstraction;
import java.util.Scanner;

abstract class Printer{
    public abstract void configure();
    public abstract void display();
}

class DotMatrix extends Printer{
    public void configure(){
        System.out.println("DotMatrix Configuration...");
    }
    public void display(){
        System.out.println("DotMatrix Displaying...");
    }
}

class LaserJet extends Printer{
    public void configure(){
        System.out.println("LaserJet Configuration...");
    }
    public void display(){
        System.out.println("LaserJet Displaying...");
    }
}
public class main {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        DotMatrix obj1=new DotMatrix();
        LaserJet obj2=new LaserJet();

        while(true){
            System.out.println("\nMenu\n1.Use DotMatrix Printer\n2.Use LaserJet Printer\n3.Exit");
            System.out.print("Enter your choice: ");
            int choice=scan.nextInt();
        
            switch(choice){
                case 1:
                    obj1.configure();
                    obj1.display();
                    break;
                
                case 2:
                    obj2.configure();
                    obj2.display();
                    break;
                
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");

            }
        }

    }
}
