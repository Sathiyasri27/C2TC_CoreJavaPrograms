package entityclassassignment1;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDetails[] students = new StudentDetails[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter details for Student " + (i + 1));
			
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine(); 

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Department: ");
			String dept = sc.nextLine();

			students[i] = new StudentDetails(id, name, dept);
		}

		System.out.println("\n--- Student Details ---");
		for (StudentDetails s : students) {
			System.out.println(s);
		}

		sc.close();
	}
}
