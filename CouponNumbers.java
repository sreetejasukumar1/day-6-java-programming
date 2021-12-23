import java.util.Scanner;
public class CouponNumbers {
	static int array[] = new int[20];
	static int COUNTER_FOR_NUMBERS=0;
	static int COUNTER_FOR_DISTINCTS=0;
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many random coupons do you want to generate");
			int total = sc.nextInt();
			randomNumberGenerate(total);
			System.out.println("Distinct coupons are:");
			processDistinctCoupon(total);
			System.out.println();
			System.out.println("Total coupon generated "+ COUNTER_FOR_NUMBERS +" times for "+ COUNTER_FOR_DISTINCTS +" distinct coupons");
	}
	public static void randomNumberGenerate(int n) {
		for (int i = 0; i < n; i++) {
			array[i] = (int)Math.floor(Math.random() * 10 + 1);
			System.out.println(array[i]+" ");
			COUNTER_FOR_NUMBERS++;
		}
	}
	public static void processDistinctCoupon(int m) {
		int j, k;
		for (j = 0; j < m ; j++) {
			int count = 0;
			for ( k = 0; k < m; k++) {
				if(array[j] == array[k]) { 
				count++;
				}
			}
			if(count == 1) {
				System.out.println(array[j]+" ");
				COUNTER_FOR_DISTINCTS++;
			}
		}
	}
}
