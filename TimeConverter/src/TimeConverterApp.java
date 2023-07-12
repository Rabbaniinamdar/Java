import java.util.Scanner;

public class TimeConverterApp {
	public static double convertToHours(double minutes) {
		return minutes/60;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the minutes");
		double minutes=sc.nextDouble();
		
		System.out.printf("%.1f",convertToHours(minutes));
		sc.close();

	}
}
