import java.util.*;
import java.lang.*;//imports of packages and classes
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s=sc.nextLine();
		for(int j=0;j<t;j++)
		{ 
		    s=sc.nextLine();
		    HashSet<Character> set=new HashSet<>();//hashset for compairing the duplicates
		   // s=sc.nextLine();
		   boolean flag=false;
		    for(int i=0;i<s.length();i++)
		    {
		        if(set.contains(s.charAt(i)))
		        {
		            System.out.println(s.charAt(i));
		            flag=true;//flag to check element is found or not
		            break;
		        }
		        set.add(s.charAt(i));//if not contains then add it to set
		    }
		    if(flag!=true)
		    System.out.println(-1);//if not found then print -1
		}
	}
}