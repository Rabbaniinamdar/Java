import java.util.Scanner;

public class FinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of principal amount");
		double amount=sc.nextDouble();
		System.out.println("Enter the value of rate of interes");
		double interest=sc.nextDouble();
		System.out.println("Enter the value of interest");
		double time=sc.nextDouble();
		FinanceCalculator explorer=new FinanceCalculator();
		System.out.printf("%.2f",explorer.calculateSimpleInterest(amount,interest,time));
		sc.close();
	}
}
