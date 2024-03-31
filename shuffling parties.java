import java.util.*;
public class Shuffling_Parties
{
    public static void main (String[] args)   //main function
    {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();                // taking variable t for no. of test cases
        while(t>0)
        {
           int N = in.nextInt();           //Number of Positive Integers
           int even =0;                    //Counter for even numbers
           int odd =0;                     //Counter for odd numbers
           int sum=0;                       //Variable to store sum
           for(int i =0; i<N; i++)         // Loop to get input from user and check whether the input is odd or even.
           {
               int inp =in.nextInt();
               if(inp % 2==0)              // Input is even
               {
                   even++;
               }
               else                         //Input is odd
               {
                   odd++;
               }
               
           }
           int eind =N/2, oind = N/2+N%2; //Calculating no. of all the even and odd indices possible for n numbers.
           //we have to find the maximum possible sum of integer for array B. So maximum value which we can have is 1 at a particular index to get that we should have (Ai+i) = odd.
           int x = Math.min(oind,even);  //Calculating No.of 1s possible by even numbers  
           int y = Math.min(eind,odd);   //Calculating No.of 1s possible by odd numbers
           sum = x+y;      //Calculating sum
           System.out.println(sum);      //Printing the sum
           t--;      //decrementing the value after running a testcase.
        }
    }
    
}
