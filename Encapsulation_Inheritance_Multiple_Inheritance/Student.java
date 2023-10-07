package Encapsulation_Inheritance_Multiple_Inheritance;

public class Student extends Person implements StudentOp {
    private int id;
    private double fees;

    public Student(String name, String address, String email, String phone,int id,double fees) {
        super(name, address, email, phone);
        this.id=id;
        this.fees=fees;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("ID: "+id);
        System.out.println("Fees: "+fees);

    }

    public double calculateFees(){
        fees+=fees*0.5;
        return fees;
    }
}
