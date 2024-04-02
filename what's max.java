/*
Second Max of Three Numbers
Problem Statement
Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.

Input
First line contains the number of triples, N.
The next N lines which follow each have three space separated integers.
Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;   

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    int[] array = new int[]{x, y, z};
		    Arrays.sort(array);
		    System.out.println( array[1] );
		}
	}
}
