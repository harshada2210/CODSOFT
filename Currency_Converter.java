
import java.util.Scanner;
public class Currency_Converter {
	
	public static double USDToRupee(double USD) 
	{
		//USD amount converted into Rupee
		return USD*83.47;
	}
	
	public static double RupeeToUSD(double Rupee)
	{
		//Rupee amount converted into USD
		return Rupee*0.0119804;
	}
	
	public static double EuroToRupee(double Euro)
	{
		//Euro amount converted into Rupee
		return Euro*89.10;
	}
	
	public static double RupeeToEuro(double Rupee)
	{
		//Rupee amount converted into Euro
		return Rupee*0.0113;
	}
	
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to Currency Converter...");
		System.out.println("1. USD to Rupee");
		System.out.println("2. Rupee to USD");
		System.out.println("3. Euro to Rupee");
		System.out.println("4. Rupee to Euro");
		System.out.println("Enter your choice(1 or 2 or 3 or 4)");
		
		int choice = scanner.nextInt();
		
		//USD amount converted into Rupee 
		
		if (choice==1) 
		{
			System.out.print("Enter the amount in USD: ");
			double USD =scanner.nextDouble();
			double Rupee= USDToRupee(USD);
			System.out.println("Converted amount in Rupee :"+Rupee);
			
		}
		
		//Rupee amount converted into USD
		
		else if (choice==2) 
		{
			System.out.print("Enter the amount in Rupee: ");
			double Rupee =scanner.nextDouble();
			double USD= RupeeToUSD(Rupee);
			System.out.println("Converted amount in USD :"+USD);
			
		}
		
		//Euro amount converted into Rupee
		
		else if (choice==3) 
		{
			System.out.print("Enter the amount in Euro: ");
			double Euro =scanner.nextDouble();
			double Rupee= EuroToRupee(Euro);
			System.out.println("Converted amount in Rupee :"+Rupee);
			
		}
		
		//Rupee amount converted into Euro
		
		else if (choice==4) 
		{
			System.out.print("Enter the amount in Rupee: ");
			double Rupee =scanner.nextDouble();
			double Euro= RupeeToEuro(Rupee);
			System.out.println("Converted amount in Euro :"+Euro);
			
		}
		
		else 
		{
			System.out.println("Invalid Choice...! Please Enter your choice(1 or 2 or 3 or 4.)");	
		}
		scanner.close();
		
	}

}
