package RuntimePolymorphism;

import java.util.Scanner;

interface Vehicle{
    public void drive();
}

abstract class AbstractVehicle implements Vehicle{
    public abstract void drive();
}

class Car extends AbstractVehicle{
    public void drive(){
        System.out.println("Driving car...");
    }
}

class MotorCycle extends AbstractVehicle{
    public void drive(){
        System.out.println("Driving motorcycle...");
    }
}

public class main {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        Car obj1=new Car();
        MotorCycle obj2=new MotorCycle();

        while(true){
            System.out.println("\nMenu\n1.Drive Car\n2.Drive MotorCycle\n3.Exit");
            System.out.print("Enter your choice: ");
            int choice=scan.nextInt();
        
            switch(choice){
                case 1:
                    obj1.drive();
                    break;
                
                case 2:
                    obj1.drive();
                    break;
                
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");

            }
        }

    }
}
