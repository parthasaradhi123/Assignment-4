import java.util.Arrays;

public class PrintDuplicatesInString 
{

	public static void main(String[] args)
	{
		
/*		     APROACH -1
		 
*/
		String s = "parthasaradhireddy";
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();

		
		for(int i=0; i<s.length();i++)
		{
			char ch = s.charAt(i); // ch =p,a,r
			int x  = s.indexOf(ch, i+1); // p, 1//a, 2 to 5//r , 3 to 17//
			if(x == -1)
			{
				s1.append(ch); // p, t
			}
			else
			{
				s2.append(ch); // a, r
			}
		}
		System.out.print(s1); /// unique values
		
		System.out.println();
		
		System.out.println(s2); // repeated values.
		
		System.out.println();
		
/*
 *          APROACH - 2
 */
		StringBuilder s3 = new StringBuilder();
		char[] ch1 = s.toCharArray();
		
		for(int i =0; i<ch1.length;i++)
		{
			boolean dup = false;
			
			for(int j = i+1;j<ch1.length;j++)
			{
				if(ch1[i] == ch1[j])
				{
					dup = true;
					break;
				}	
			}
			if(!dup)
			{
				s3.append(ch1[i]);
			}
		}
		System.out.println(s3);
		  
	}

}
