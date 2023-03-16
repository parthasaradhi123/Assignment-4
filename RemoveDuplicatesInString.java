import java.util.*;
public class RemoveDuplicatesInString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
		 String s = sc.nextLine();
		// String s1;
		 char[] ch = s.toCharArray();
		 
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();

		 
		 for(int i = 0; i<ch.length;i++)
		 {
			 boolean flag = false;
			 for(int j =i+1;j<ch.length;j++)
			 {
				 if(ch[i]==ch[j])
				 {
					 flag = true;
					 break;
				 }
			 }
			 if(flag)
			 {
				 sb.append(ch[i]);
 			 }
			 else
			 {
				sb1.append(ch[i]); 
			 }
		 }
		 int n = sb.length();
		 sb.delete(0, n);
		 System.out.println("String without duplicate elements : ");
		 System.out.println(sb1);
		  

	}

}
