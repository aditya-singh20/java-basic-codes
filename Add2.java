/*    Experiment No. 2(a) 

    Aim :- WAP to accept input from user through keyboard using command line argument */


import java.io.*;

class Add2
{
public static void main(String args[])throws IOException{
  
    int a;
    int b;
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
      System.out.println("Sum="+(a+b));
    }
  
    } 

/* C:\Users\Desktop\java>javac Add2.java

C:\Users\Desktop\java>java Add2 5 7
Sum=12 */