/*
Chef has taken his first dose of vaccine 
𝐷
D days ago. He may take the second dose no less than 
𝐿
L days and no more than 
𝑅
R days since his first dose.

Determine if Chef is too early, too late, or in the correct range for taking his second dose.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
		    int a=scan.nextInt();
		    int b=scan.nextInt();
		    int c=scan.nextInt();
		    if(a>c){
		        System.out.println("Too Late");
		    } else if(a<b){
		        System.out.println("Too Early");
		    } else if(a<=c){
		        System.out.println("Take second dose now");
		    }
		}

	}
}
