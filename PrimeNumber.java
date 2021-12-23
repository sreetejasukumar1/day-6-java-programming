import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 int counter = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter input number to check prime or not");
		 int number = sc.nextInt();
		 if(number >= 2) {
			 for (int i = 2; i < number/2; i++) {
				 if(number % i == 0) {
					 counter++;
				 }
			 }
		 	if(counter == 0)
 {
		 		System.out.println(number+" is a prime number");
			}
			else {
				System.out.println(number+" is not a prime number");
			}
		 }
		 else {
			 System.out.println(number+" is not a prime number");
		 }
	}

}
