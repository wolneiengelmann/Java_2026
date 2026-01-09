package application;

import java.awt.GraphicsDevice;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double court = 60.00;

		Student student1 = new Student();

		student1.name = sc.nextLine();
		student1.note1 = sc.nextDouble();
		student1.note2 = sc.nextDouble();
		student1.note3 = sc.nextDouble();

		double finalAverage = student1.finalGrade();
		System.out.printf("Final Grade = %.2f%n", finalAverage);
		
		if (finalAverage>court) {
			System.out.println("PASS");
		} else {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points%n", student1.missingPoint());
		}

		sc.close();

	}

}
