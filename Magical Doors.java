import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class MagicalDoors
{   //Main Function
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in); //Scanner for taking input
        int t = in.nextInt(); //Variable t for no of test case 
        while(t>0)  //loop for every test case
        {
                
             StringBuilder str = new StringBuilder(in.next()); //Taking input int String builder str
             long res = 0;  //Variabe of long type for storing result
             if(str.charAt(0) == '0')   //checking the first character of the string (Whether it is 0 or 1)
             res++;  //if 0 then we are adding 1 to result
             for(int i = 1; i<str.length(); i++) //for loop starting from 2nd character
             {
                 if(str.charAt(i) != str.charAt(i-1)) //Checking that is the previous charcter same or not
                     res++; //if not same then adding 1 to result
             }
             System.out.println(res); //printing the result
             t--; //decrementing the value of t
        }     
    }
}
