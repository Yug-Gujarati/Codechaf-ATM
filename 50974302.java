/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 try{
             Scanner scin = new Scanner(System.in);
             int withdraw = scin.nextInt();
             double balance = scin.nextDouble();
             if(withdraw+0.50<=balance&&withdraw%5==0){
                balance=balance-withdraw-0.50;
             }
            System.out.println(balance);
        }
        catch(Exception e) {
            System.out.println(e);
        }
		
	}
}
