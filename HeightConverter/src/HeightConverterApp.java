import java.util.Scanner;

public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inches");
		double inches=sc.nextDouble();
		HeightConverter explorer=new HeightConverter();
		System.out.printf("%.2f",explorer.convertInchesToFeet(inches));
		sc.close();

	}
}
