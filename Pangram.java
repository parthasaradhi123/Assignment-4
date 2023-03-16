import java.util.*;

public class Pangram {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//The Quick brown FOX jumps over lazy dog

		System.out.println("Enter the String you wanna check :- ");
	   
		//StringBuilder sb = new StringBuilder(sc.nextLine());
		 
		String sb = sc.nextLine();
		 
		sb = sb.replace(" ", "");

		int[] ar = new int[26];
		char[] ch = new char[sb.length()];
		
		for(int i=0;i<sb.length();i++)
		{
			ch[i] = sb.charAt(i);
		}
		
		for(int i = 0; i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				ch[i] = ch[i];
			}
			else
			{
				ch[i] =  (char)(ch[i]-32);
			}
		}
		
		System.out.print(ch);

		
		int index;
 	    for(int i=0; i<ch.length;i++)
 	    {
 	    	index = ch[i]-65;
 	    	 ar[index]++;
 	    }
 	    
 	    System.out.println();
 	    
 	    for(int ele:ar)
 	    {
 	    	System.out.print(ele);
 	    }
 	    
 	    boolean f = false;
 	    
 	    for(int i =0;i<ar.length;i++)
 	    {
 	    	if(ar[i]==0)
 	    	{
 	    		System.out.println("It is not a pangram");
 	    		f = true;
 	    	}
 	    }
 	    
 	    System.out.println();
 	    
 	    if(f == false)
 	    {
 	    	System.out.println("It is a pangram");
 	    }
		
	}

}
