import java.util.Scanner;

class TempConverter{
	public double convertFahrenheitToCelsius(double fahrenheit)
	{

		return (fahrenheit - 32) * 5/9;

	}
}
public class TemperatureConeverter {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter temp in F");

		double f=scan.nextDouble();

		TempConverter temperatureConverter=new TempConverter();

		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
		scan.close();
	}

}
