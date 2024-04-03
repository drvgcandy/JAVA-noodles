/*
Input Format
First line will contain 
T, number of test cases. Then the test cases follow.
Each test case contains two lines of input.
First line contains a single integer 
N, the length of the sequence.
Second line contains binary string 
S of length N.
Output Format
For each test case, output in a single line the encoded sequence.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
 String result="";
            for (int i=0;i<n ;i+=2 ){
                 if(s.charAt(i)=='0' && s.charAt(i+1)=='0'){
                     result+="A";
                 }else if (s.charAt(i)=='0' && s.charAt(i+1)=='1') {
                     result+="T";
                 }else if (s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                     result+="C";
                 }else {
                     result+="G";
                     
                 }
                 
                
            } 
             System.out.println(result);
    	}
        }
    }

