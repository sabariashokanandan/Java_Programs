import java.util.Scanner;
import java.io.*;

class Interest
{
	public static void main(String[] args)
	{
		Interest interest=new Interest();
		SimpleInterest();
		interest.CompoundInterest();
	}

	public static void SimpleInterest()
	{
		float si,p,r,t;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value for p");
		p=scan.nextFloat();
		System.out.println("Enter the value for r");
		r=scan.nextFloat();
		System.out.println("Enter the value for t");
		t=scan.nextFloat();
		si=(p*r*t)/100;
		System.out.println("Simple Interest= " +si);
	}

	public void CompoundInterest()
	{
		double ci,p,r,t;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the p");
		p=scan.nextDouble();
		System.out.println("Enter the r");
		r=scan.nextDouble();
		System.out.println("Enter the t");
		t=scan.nextDouble();
		ci=p*(Math.pow((1+r/100),t));
		System.out.println("Compound Interest= " +ci);
	}
}