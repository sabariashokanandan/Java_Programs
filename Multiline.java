import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
class Multiline
{
	public static void main(String[] args)
	{
	SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy");
	double num=123.5678;
	DecimalFormat t=new DecimalFormat("##.#");
	String str=f.format(new Date());
	System.out.println("Formatted date: " +str);
    System.out.println("Formatted to give precise number:num = " +t.format(num));

	}
}