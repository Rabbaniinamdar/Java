import java.util.Scanner;

public class HaveltApp {
	public static double halveTheNumber(double num) {
		return num/2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		double Number=sc.nextDouble();
		
		System.out.printf("%.1f",halveTheNumber(Number));
		sc.close();

	}
}
