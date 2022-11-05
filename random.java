import java.util.Random;
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		boolean bool = random.nextBoolean();
		System.out.println("Enter Your name \nto check you are Intelligent or Not");
		
		String Name = sc.nextLine();
		System.out.println("Hello "+Name+" you are Intelligent and that is Completely : "+ bool);
		
	}
}
