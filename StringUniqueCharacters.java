import java.util.*;

public class StringUniqueCharacters {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String s1 ="";
		
		char [] ch = s.toCharArray();
		
		boolean f = true;
		
		l:for(int i=0;i<ch.length;i++)
		{
			for(int j =i;j<ch.length-1;j++)
			{
				if(ch[i]==ch[j+1])
				{
					System.out.println("The String doesn't have all unique values");
					 f = false;
						break l;
				}
		
			}
		}
		if(f == true)
		{
			System.out.println("The entire characters in the String are unique ");
		}
	}

}
