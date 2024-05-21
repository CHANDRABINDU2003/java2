
package classpractice;

import java.util.Scanner;
public class BinaryAdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        int a=Integer.parseInt(x, 2);
         int b=Integer.parseInt(y, 2);
         int c=a+b;
         int d=a*b;
         System.out.println(c);
         System.out.println(Integer.toBinaryString(c));
         System.out.println(Integer.toBinaryString(d));
         int e=15;
         System.out.println(Integer.toHexString(e));
    }
    
}
