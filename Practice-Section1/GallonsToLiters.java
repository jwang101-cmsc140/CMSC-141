//package GallonsToLiters;
import java.util.Scanner;
public class GallonsToLiters {

	public static void main(String[] args) {
		Scanner scanterm = new Scanner(System.in);
		int numGallons = 0;
		System.out.println("Enter number of gallons to conver to liters:");
		numGallons = scanterm.nextInt(); //nextInt method to read integer input
		Double convertToLiters = numGallons * 3.785;
		System.out.println(numGallons + " gallons is " + convertToLiters + " liters.");
	}
}
