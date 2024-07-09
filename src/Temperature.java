import java.util.Scanner;
public class Temperature {
	public static void choices()
	{
		System.out.println("Enter 1 for celcius to Fahrenheit"
				+"\nEnter 2 for Fahrenheit to Celcius"+
				"\nEnter 3 to exit");
	}
	public static void main(String[] args) 
	{
		int choice;
	Scanner scanner = new Scanner(System.in);
	do
	{
		
		double celcius,fahrenheit;
		choices();
		System.out.print("Enter your choice :");
		choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("Enter temperature in celcius : ");
			celcius = scanner.nextDouble();
			fahrenheit = 9.0/5.0 * celcius+32;
			System.out.println(celcius+" in fahrenheit is : "+fahrenheit);
			break;
		case 2:
			System.out.print("Enter temperature in fahrenheit : ");
			fahrenheit = scanner.nextDouble();
			celcius = 5.0/9.0 * (fahrenheit-32);
			System.out.println(fahrenheit+" in celcius is : "+celcius);
			break;
			default:
				System.out.println("Invalid choice, Try Again");
		}
	}
	while(choice!=3);	
	}

}
