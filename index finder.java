import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
       
         Scanner scan= new Scanner(System.in);
         System.out.println("Enter the size:");
         int size=scan.nextInt();
         int num[] =new int[size];
         // input
         System.out.println("Enter the numbers one by one:");
          for(int i=0;i<size;i++) {
             num[i]=scan.nextInt();
          }
          System.out.println("Enter the number to find:");
          int x= scan.nextInt();
         //  output
         for(int i=0;i<num.length;i++) {
             if (num[i]==x){
                 System.out.println("x found at index: "+i);
             }
         }
     }
}
