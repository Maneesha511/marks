import java.io.*;
import java.util.Scanner;
class Marks
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		if(N>90)
		{
			System.out.println("grade= A");
		}
		else if(N>80 && N<90)
		{
			System.out.println("grade=B");
		}
		else
		{
			System.out.println("grade =F");
		}
	}
}
