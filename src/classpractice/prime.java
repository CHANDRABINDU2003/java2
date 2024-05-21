
package classpractice;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n,m,count=0;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        if(n==0||n==1)
        {
            System.out.println("it is not a prime number");
        }
        else{
            for(m=2;m<n;m++)
            {if(n%m==0)
               count++;
               break;
            }
            if(count==1)
                System.out.println("it is not prime");
            else
                System.out.println("it is prime number");
        }
    }
}
