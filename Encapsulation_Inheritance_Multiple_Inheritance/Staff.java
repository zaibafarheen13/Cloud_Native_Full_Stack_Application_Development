package Encapsulation_Inheritance_Multiple_Inheritance;
import java.util.Scanner;

public class Staff extends Person implements StaffOp{

    private int id;
    private double salary;

    public Staff(String name,String address,String email,String phone,int id,double salary){
        super(name,address,email,phone);
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
    public double calculateSalary(){
        salary+=salary*0.5;
        return salary;
    }
}
