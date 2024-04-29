/*
Input:
The first line contains an integer 
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, three integers A,B,X.
Output:
For each test case, output in a single line the answer to the problem.
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        
        for (int t = 0; t < T; t++) {
            int A = scanner.nextInt(); 
            int B = scanner.nextInt(); 
            int X = scanner.nextInt(); 
            
            int result = Math.abs(A - B) / X;
            System.out.println(result);
        }
        
        scanner.close();
    }
}
