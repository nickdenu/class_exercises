public class class_exercise
{
	public static void main(String [] args)
	{
		if(args.length == 0)
		{
			System.out.println("Enter inputs guy");
			System.exit(3);
		}
		String choice = new String(args[0]);
		int args_int = Integer.parseInt(args[1]);
		if(args_int < 0)
		{
			System.out.println("Give us a positive number");
			System.exit(2);
		}
		int answer;
		if(choice.equals("triangle"))
		{
			answer = triangle(args_int);
			System.out.println("triangle(" + args_int + ") = " + answer);
		}
		else if(choice.equals("lazy"))
		{
			answer = lazy(args_int);
			System.out.println("lazy(" + args_int + ") = " + answer);
		}
		else
		{
			System.out.println("Give an actual choice");
			System.exit(1);
		}
	}
	
	static public int triangle(int num)
	{
		if(num != 0)
		{
			return (num + triangle(num - 1));
		}
		return 0;
	}
	
	static public int lazy(int num)
	{
		return (1 + triangle(num));
	}
}