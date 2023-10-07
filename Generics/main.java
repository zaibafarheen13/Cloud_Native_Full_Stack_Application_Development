package Generics;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static double calculateSum(List<Number> list){
        double sum=0;
        for(Number number:list){
            sum+=number.doubleValue();
        }
        return sum;
    }

    public static void sort(List<Number> list){
        Collections.sort(list,(a,b)->Double.compare(a.doubleValue(),b.doubleValue()));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Number> list=new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Integer");
            System.out.println("2. Add Double");
            System.out.println("3. Sum");
            System.out.println("4. Sort");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice=0;
            try{
                choice = scan.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
                scan.nextInt();
            }

            switch(choice){
                case 1:
                    System.out.print("Enter an integer: ");
                    try{
                        int intVal=scan.nextInt();
                        list.add(intVal);
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("Invalid input. Please enter an integer.");
                        scan.nextInt();
                    }
                
                case 2:
                    try{
                        System.out.print("Enter a double: ");
                        double doubleVal=scan.nextDouble();
                        list.add(doubleVal);
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("Invalid input. Please enter a double.");
                        scan.nextDouble();
                    }

                case 3:
                    double ans=calculateSum(list);
                    System.out.println("Sum: "+ans);
                    break;

                case 4:
                    sort(list);
                    System.out.println("Sorted list: " + list);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            scan.close();
        }
    }
}
