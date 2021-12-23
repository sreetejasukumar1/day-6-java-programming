import java.util.Scanner;
public class VendingMachine{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the amount you want to withdraw");
		 int amount = sc.nextInt();
		 if(amount >= 1000) {
			 int notesOfThousand = amount / 1000;
			 amount = amount - (notesOfThousand * 1000);
			 System.out.println("1000 RS ="+notesOfThousand+" notes");
		 }
		 if(amount >= 500) {
			 int notesOfFiveHundred = amount / 500;
			 amount = amount - (notesOfFiveHundred * 500);
			 System.out.println("500 RS ="+notesOfFiveHundred+" notes");
		 }
		 if(amount >= 100) {
			 int notesOfHundred = amount / 100;
			 amount = amount - (notesOfHundred * 100);
			 System.out.println("100 RS ="+notesOfHundred+" notes");
		 }
		 if(amount >= 50) {
			 int notesOfFifty = amount / 50;
			 amount = amount - (notesOfFifty * 50);
			 System.out.println("50 RS ="+notesOfFifty+" notes");
		 }
		 if(amount >= 20) {
			 int notesOfTwenty = amount / 20;
			 amount = amount - (notesOfTwenty * 20);
			 System.out.println("20 RS ="+notesOfTwenty+" notes");
		 }
		 if(amount >= 10) {
			 int notesOfTen = amount / 10;
			 amount = amount - (notesOfTen * 10);
			 System.out.println("10 RS ="+notesOfTen+ " notes");
		 }
		 if(amount >= 5) {
			 int coinOfFive = amount / 5;
			 amount = amount - (coinOfFive * 5);
			 System.out.println("5 RS ="+coinOfFive+" coins");
		 }
		 if(amount >= 2) {
			 int coinOfTwo = amount / 2;
			 amount = amount - (coinOfTwo * 2);
			 System.out.println("2 RS ="+coinOfTwo+" coins");
		 }
		 if(amount >= 1) {
			 int coinOfOne = amount / 1;
			 amount = amount - (coinOfOne * 1);
			 System.out.println("1 RS ="+coinOfOne+" coins");
		 }
	}

}
