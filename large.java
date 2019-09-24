/* Expriment No. 3(a)  

	Aim:- WAP to find largest amongst 3 numbers */

import java.util.*;
class large
{ 
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Three numbers\n");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int greatest=((a>b)&&(a>c)?a:(b>c)?b:c);
		
		System.out.println("Largest no.="+greatest);
	}
}	

/* 
C:\Users\Desktop\java>javac large.java

C:\Users\Desktop\java>java large
Enter Three numbers

3
45
67
Largest no.=67 */