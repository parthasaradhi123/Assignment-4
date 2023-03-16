import java.util.*;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string 1 ");
		String s = sc.nextLine();
		
		System.out.println("Enter the string 2 ");
		String s1 = sc.nextLine();
		
		s = s.replace(" ", ""); // trying to eliminate the spaces in between the words
		s1 = s1.replace(" ", "");// trying to eliminate the spaces in between the words
		
		 
		int x = s.length();
 		int y = s1.length();
 		
		char [] ch = new char[x];
		char[] ch1 = new char[y];
		
		
		
		for(int i =0; i<x;i++)
		{
			
			ch[i] = s.charAt(i); // here we converted the s string to char Array ch.
 		}
		
		for(int i = 0; i<y;i++)
		{
			ch1[i] = s1.charAt(i); // here we converted the s1 string to char Array ch1.
 		}
		
		// converting present array into lower case.
		
		for(int i =0; i<ch.length;i++)
		{
			l:if(ch[i]>= 97 && ch[i]<=122 )
			{
				 break l;
			}
			else
			{
				ch[i] = (char)(ch[i]+32); // Converting a Capital letter into small letter 
				 
			}
		}
		System.out.println();
		
		for(int i =0; i<ch1.length;i++)
		{
			l:if(ch1[i]>=97 && ch1[i]<=122)
			{
				break l;
			}
			else
			{
				ch1[i] = (char)(ch1[i]+32); // Converting a Capital letter into small letter 
 			}
		}
		
		Arrays.sort(ch); // sorting the array  values  like abcdef.....
		Arrays.sort(ch1);
		
		
		Boolean f = true;
		
		l:for(int i = 0; i<ch.length;i++)
		{	 
				if(ch[i]== ch1[i]) // comparing both character arrays
				{
					continue;
				}
				else
				{
					f = false;
					System.out.println(" It is not an anagaram"); // if one value  is also not matching not anagram
					break l;
				}
			
		}
		if(f)
		{
			System.out.println("It is an anagaram");
		}
		
		
		
		
		 

/*
		s = s.toLowerCase();
		s = s.replace(" ", "");
		
		s1 = s1.toLowerCase();
		s1 = s1.replace(" ", "");
		
		char[] ch = s.toCharArray();
		char[] ch1 = s1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch, ch1))
		{
			System.out.println("It is a anagaram");
		}
		else
		{
			System.out.println("It is not a anagaram");
		}
*/		
		// william Shakespeare
		//Ill make a wise phrase
	}

}
