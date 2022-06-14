class TypeCasting
{
	public static void main(String[] args)
	{
		byte myb=-128;
		int myl= (int) myb;
		System.out.println("Byte number= " +myb);
		System.out.println("Integer= " +myl);
		inttofloat();
		doubletoint();
		chartoint();
		booleantoint();
		stringtochar();
	}
	public static void inttofloat()
	{
		int var1=2147483647;
		float var2=var1;
		System.out.println("Integer= " +var1);
		System.out.println("Float= " +var2);
	}
	public static void doubletoint()
	{
		double s=3442.45;
		int f=(int) s;
		System.out.println("Double= " +s);
		System.out.println("Integer= " +f);
	}
	public static void chartoint()
	{
		char h='h';
		int x=h;
		System.out.println("Character= " +h);
		System.out.println("Integer= " +x);
	}
	public static void booleantoint()
	{
		boolean m=true;
		boolean o;
		int j,y;
		j= (m)? 1:0;
		System.out.println("Boolean= " +m);
		System.out.println("Integer= " +j);
		y=2145;
		o= y==2145;
		System.out.println("Integer= " +y);
		System.out.println("Boolean= " +o);

	}
	public static void stringtochar()
	{
		String get="power";
		char give= get.charAt(1);
		System.out.println("String= " +get);
		System.out.println("Character= " +give);
	}

}