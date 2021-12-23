import java.util.Scanner;
public class PerfectNumber 
{
	public static void main(String[] args) 
{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any input number");
		int number = sc.nextInt();
		for (int i = 1; i <= number/2; i++)
 {
			if(number % i == 0)
 {
				sum = sum + i;
			}
		}
		if (sum == number)
 {
			System.out.println(number+" is a perfect number");
		}
		else
 {
			System.out.println(number+" is not a perfect number");
		}

	}

}
