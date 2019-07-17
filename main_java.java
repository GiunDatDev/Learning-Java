import java.util.Scanner;

public class main_java {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter width");
		double width = scanner.nextDouble();
		System.out.println("Enter length");
		double length = scanner.nextDouble();
		Rec_Solve st_pats_soccer_field = new Rec_Solve(length, width);
		
		// print out soccer field information
		st_pats_soccer_field.print_rectangle_information();
		System.out.println("\n");
		
		// Calculate area and the perimeter
		double area = st_pats_soccer_field.find_area();
		double perimeter = st_pats_soccer_field.find_perimeter();
		
		System.out.println("The area of the field is: " + area);
		System.out.println("The perimeter of the field is: " + perimeter);
	}
}
