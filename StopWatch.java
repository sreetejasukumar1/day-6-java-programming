import java.util.Scanner;
public class StopWatch {
public static void main(String[] args) {
		long startTime=0,stopTime=0,elapsedTime=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dou you want to start stopwatch");
		System.out.println("Enter '1' if you want to start watch timer");
		int inputStart = sc.nextInt();
		if(inputStart == 1) 
		{
			startTime = System.currentTimeMillis();
			System.out.println("Start time of watch is "+startTime);
			System.out.println("Enter '1' if you want to stop watch timer");
			int inputStop = sc.nextInt();
			if(inputStop == 1)
			{
				stopTime = System.currentTimeMillis();
				System.out.println("Stop time of watch is "+stopTime);
				elapsedTime = stopTime - startTime;
				System.out.println("----------------------------------------------");
				System.out.println("Elapsed time is "+elapsedTime+" milliseconds");
				System.out.println("----------------------------------------------");
			}
			else
			{
				System.err.println("Enter only '1' to stop");
			}
		}
		else {
			System.err.println("Enter only '1' to start");
		}
	}
}
