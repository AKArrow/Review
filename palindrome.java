import java.util.*;
class palindrome
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int n = sc.nextInt();
		int a,temp;
		String str="";
		temp=n;
		while(n!=0)
		{
			a=n%10;
			str=str+a;
			n=n/10;
		}
		if(temp==Integer.parseInt(str))
		{
			System.out.println(temp+ " No Is Palindrome!");
		}
		else
		{
			System.out.println(temp+ " No Is Not Palindrome!");
		}
	}
}