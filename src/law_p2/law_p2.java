package law_p2;
import java.util.Scanner; 

public class law_p2 {

	public static void main(String[] args) {
		double heightFeet;
		double heightInches;
		double weight;
		double total = 0;
		String formula;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter formula choice (metric) or (standard):");
		formula = scnr.nextLine();
		if (formula.equals("metric"))
		{
			System.out.println("Enter height (meters):");
			heightInches = scnr.nextDouble();
			System.out.println("Enter weight (kilograms):");
			weight = scnr.nextDouble();
			
			total = weight / (Math.pow(heightInches, 2.0));
		}
		else if (formula.equals("standard"))
		{
			System.out.println("Enter height (feet):");
			heightFeet = scnr.nextDouble();
			System.out.println("Enter height (inches):");
			heightInches = scnr.nextDouble();
			heightInches = (heightFeet * 12) + heightInches;
			System.out.println("Enter weight (pounds):");
			weight = scnr.nextDouble();
			
			total = (weight * 703)/ (Math.pow(heightInches, 2.0));
		}
		else
		{
			System.out.println("Not a valid choice:");
		}
		
		System.out.printf("Your BMI is %.1f, compare it to the range\n", total);
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		scnr.close();
	}

}
