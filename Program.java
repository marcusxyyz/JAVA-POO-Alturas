package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] height = new double[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println(i+1+ "st person details:");
			System.out.print("Name: ");
			names[i] = sc.nextLine();
			System.out.print("Age: ");
			ages[i] = sc.nextInt();
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i = 0; i<height.length; i++) {
			sum += height[i];
		}
		
		double avg = sum / height.length;
		
		double count = 0;
		for (int i = 0; i<ages.length; i++) {
			if (ages[i] < 16) {
				count += 1;
			}	
		}
		
		double underAge = 100.0 * count / height.length;
		
		System.out.println();
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		System.out.println("People under 16 years old: " + underAge + "%");
		
		for (int i =0; i<names.length; i++) {
			if (ages[i] < 16) {
				System.out.println(names[i]);
			}
		}
		
		
		
		sc.close();
	}

}
