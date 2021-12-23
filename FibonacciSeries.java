import java.util.*;

public class FibonacciSeries
{
public static void main(String args[]) {
int previousNumber = 0;
int currentNumber = 1;
int sum;
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many numbers of fibonacci series you want to print");
int limit = sc.nextInt();
System.out.print("Fibonacci series upto "+ limit +" limit is "+previousNumber+ ","+currentNumber);
for(int i = 2; i < limit; i++)
{
sum = previousNumber + currentNumber;
previousNumber = currentNumber;
currentNumber = sum;
System.out.print(","+sum);
}
}
}
