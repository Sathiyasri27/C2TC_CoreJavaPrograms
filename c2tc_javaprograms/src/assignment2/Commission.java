package assignment2;
import java.util.Scanner;

class Student {
 Student() {
     System.out.println("Student object is created");
 }
}


public class Commission extends Student {

 String name, address, phone;
 double salesAmount;

 public void acceptDetails() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Name: ");
     name = sc.nextLine();
     System.out.print("Enter Address: ");
     address = sc.nextLine();
     System.out.print("Enter Phone: ");
     phone = sc.nextLine();
     System.out.print("Enter Sales Amount: ");
     salesAmount = sc.nextDouble();
 }

 public void calculateCommission() {
     double commission;

     if (salesAmount >= 100000) {
         commission = salesAmount * 0.10;
     } else if (salesAmount >= 50000) {
         commission = salesAmount * 0.05;
     } else if (salesAmount >= 30000) {
         commission = salesAmount * 0.03;
     } else {
         commission = 0;
     }

     System.out.println("\n--- Commission Details ---");
     System.out.println("Name       : " + name);
     System.out.println("Sales Amt  : ₹" + salesAmount);
     System.out.println("Commission : ₹" + commission);
 }

 public static void main(String[] args) {
     Commission emp = new Commission(); 
     emp.acceptDetails();               
     emp.calculateCommission();      
 }
}


