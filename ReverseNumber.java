import java.util.Scanner;
public class ReverseNumber 
{
	public static void main(String[] args)
 {
			int reverse = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a input number");
			int number = sc.nextInt();
			for (int i = 0; number > 0; i++)
 {
				int remainder = number % 10;
				reverse = (reverse * 10) + remainder;
				number = number / 10;
			}
			System.out.println(reverse+" is reverse of given input number");
	}

}
