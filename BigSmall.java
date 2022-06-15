import java.util.Scanner;
class BigSmall
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value for a,b and c");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d;
	System.out.println("The biggest is " +(d= a>b? a :(b>c? b:c)));
	System.out.println("The smallest is " +(d= a<b? a :(b<c? b:c)));
	}
}