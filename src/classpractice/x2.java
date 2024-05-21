
package classpractice;

import java.util.Scanner;
public class x2 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner x = new Scanner(System.in);
        a=x.nextDouble();
        b=x.nextDouble();
        c=x.nextDouble();
        double result= b*b-4.0*a*c;
        if(result>0.0){
            double r1=(-b + Math.pow(result, 0.5))/(2.0*a);
            double r2=(-b - Math.pow(result, 0.5))/(2.0*a);
            System.out.println(" "+r1+" "+r2 );  
        }
        else if(result==0){
            double r1= -b/(2.0*a);
            System.out.println(""+r1);
        }
        else
            System.out.println("there is no result");
        
    }
}
