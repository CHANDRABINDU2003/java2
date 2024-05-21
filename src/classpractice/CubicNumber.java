
package classpractice;

import java.util.Scanner;
public class CubicNumber {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int i= x.nextInt();
        for(int j=1;j<=i;j++){
            double p=Math.pow(j, 3);
            System.out.println("the cubic of "+j+" is "+p);
        }
    }
   
}
