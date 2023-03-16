import java.util.*;
public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number to check whether it is a palindrome or not : ");
		int n = sc.nextInt();
		int r, sum =0,temp;
		
		temp = n;
		
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if(sum == temp)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a palindrome Number");
		}
		 
	}

}
