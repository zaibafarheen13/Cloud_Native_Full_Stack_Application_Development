package Encapsulation_Inheritance_Multiple_Inheritance;

public class Person {
    protected String name,address,email,phone;

    public Person(String name,String address,String email,String phone){
       this.name=name;
       this.address=address;
       this.email=email;
       this.phone=phone;
    }

    public void displayDetails(){
         System.out.println("Name: "+name);
         System.out.println("Address: "+address);
         System.out.println("Email: "+email);
         System.out.println("Phone: "+phone);
    }
}
