import java.util.*;

public class task2 {
	static int m1;
	static int m2;
	static int m3;
	static int m4;
	static int m5;
	static int m6;
	static int total;
	static int avgper;
	static char grade;
	public static void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of all Six subjects:");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		m6 = sc.nextInt();	
	}
	public static void calculate()
	{
		total = m1 + m2 + m3 + m4 + m5 + m6;
		avgper = total/6;
		if(avgper>=90)
		{
			grade = 'A';
		}
		else if(avgper>= 80)
		{
			grade = 'B';
		}
		else if(avgper>=70)
		{
			grade = 'C';
		}
		else if(avgper>=60)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
	}
	public static void display()
	{
		System.out.println("\n\nTotal Marks = "+ total);
		System.out.println("Average Percentage = "+ avgper);
		System.out.println("Grade "+ grade );
		
	}
	public static void main(String[] args) {
		getdata();
		calculate();
		display();
	}

}
