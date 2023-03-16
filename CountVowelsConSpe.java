import java.util.*;
public class CountVowelsConSpe {

	public static void main(String[] args) 
	{ 
		//33 special characters
		//21 consonants
		// 5 vowels
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string value : ");
		String sb = sc.nextLine();
		
	    StringBuilder s = new StringBuilder();
	    StringBuilder s1 = new StringBuilder();
	    StringBuilder s2 = new StringBuilder();

		int count =0;
		int count1=0;
		int count2 =0;
		
		//char[] ch = sb.toCharArray();
		
		for(int i =0; i<sb.length();i++)
		{
			if((sb.charAt(i)>=32 && sb.charAt(i)<=47)||(sb.charAt(i)>=58 && sb.charAt(i)<=64)
			  ||(sb.charAt(i)>=91 && sb.charAt(i)<=96)||(sb.charAt(i)>=123 && sb.charAt(i)<126))
			{
				count++;
				 s.append(sb.charAt(i));
			}
			else if(sb.charAt(i)==65 || sb.charAt(i)== 69 || sb.charAt(i) == 73 
					|| sb.charAt(i)==79 || sb.charAt(i)== 85 || sb.charAt(i) == 97
					|| sb.charAt(i)==101 || sb.charAt(i)== 105 || sb.charAt(i) == 111
					|| sb.charAt(i)==117)
			{
				count1++;
				s1.append(sb.charAt(i));
			}
			else if((sb.charAt(i)>=65 && sb.charAt(i)<=90)||(sb.charAt(i)>=97 && sb.charAt(i)<=122))
			{
				count2++;
				s2.append(sb.charAt(i));
				
			}
			else
			{
				System.out.println("it is some unknown number");
			}
		}
		System.out.println("Special character count is : "+count);
		System.out.println(" And they are : "+s);
		
		System.out.println();
		
		System.out.println("Vowels count is : "+count1);
		System.out.println(" And they are : "+s1);

		System.out.println();
		
		System.out.println("Consonants count is : "+count2);
		System.out.println(" And they are : "+s2);

		
	}

}
