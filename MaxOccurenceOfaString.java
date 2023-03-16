import java.util.*;

public class MaxOccurenceOfaString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String  s = sc.nextLine();
		
		s = s.replace(" ", ""); // here in this line we are removing the spacing in between the words
		
		char[] ch = s.toCharArray(); // converting the string to character array
		
		int[] ar = new int[26]; // new array to store how many times a variables is present in the string
		
		int index;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i] = (char)(ch[i]-32); // logic to convert the small letters into caps
				 
 			}
			else
			{
				ch[i] = ch[i];
			}
		}
		
		for(int i =0;i<ch.length;i++)
		{
			index = ch[i]-65; 
			ar[index]++;   // trying to store number of times a varaible has appeard 
		}
		 
		
		int max =0;
		for(int i=0;i<ar.length;i++)
		{
			 
			if(ar[i]>max)
			{
				max = ar[i]; // finding which variable has occured maximum times
			}
		}
		
		l:for(int i =0;i<ar.length;i++)
		{
			if(ar[i]==max)
			{
				char c =  (char)(i+65); //converting into to character
				System.out.println("The Maximum Ocurence of a character is : "+c+ " and it appeard "+max+" times");
				break l;
			}
		}
 	}

}
