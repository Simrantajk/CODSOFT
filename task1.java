import java.util.Random;
import java.util.*;

public class Main {
	static int trial = 5;
	static int score =0;
	static boolean flag = false;
	static int ratio=1;
	static int guess=0;
	static int rn;
	static int i;
	
	public static void check()
	{
		System.out.println("Guess the random number");
		Scanner sc = new Scanner(System.in);
		guess = sc.nextInt();
		if(guess == rn)
		{
			System.out.println("^_^ ~~~Correct guess~~~ ^_^");
			score = score + 1;
			flag = true;
			return;
		}
		ratio =Math.abs( rn - guess);
		if(ratio < 10)
		System.out.println("Yayyy, 90% close to the guess");
		else if(ratio < 50)
			System.out.println("High guess, You are 50-90% close to the correct guess");
		else
			System.out.println("low guess");
		if(i==trial)
		{
		System.out.println("\n\t\t***OOPS You ran out of chances***\nThe Random number is "+rn);
		again();
		}
	}
	public static void again()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nDo you wanna restart again? 1 for Yes and 0 for No");
		int retry = sc.nextInt();
		Random rand = new Random();
		rn = rand.nextInt(100);
		if(retry == 1)
		{
			i =1;
			start();
		}
		else
			System.out.println("Hope you enjoyed playing it ");
			System.exit(0);
		
	}
	public static void start()
	{
		for(i =1; i<=trial; i++) {
			if(flag == true) {
				System.out.println("Thank you for Playing");
				again();
			}
		check();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		System.out.println("\t\t\t^0^ ***Random Number Guessing Game*** ^0^");
		rn = rand.nextInt(100);
		Scanner sc = new Scanner(System.in);
		start();
		System.out.println("Score is "+ score);
			
		

	}

}
