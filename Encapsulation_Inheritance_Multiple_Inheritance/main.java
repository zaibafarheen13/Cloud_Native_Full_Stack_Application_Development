package Encapsulation_Inheritance_Multiple_Inheritance;

public class main {
    public static void main(String args[]){
        String name="siya",address="goa",email="siya@gmail.com",phone="1122334455";
        Student s=new Student(name,address,email,phone,101,20000.0);
        Staff st=new Staff(name,address,email,phone,10001,3000.0);

        s.calculateFees();
        s.displayDetails();
        System.out.println("------------------------------------------------------");
        st.calculateSalary();
        st.displayDetails();
    }
}
