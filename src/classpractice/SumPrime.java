
package classpractice;

import java.util.Scanner;
public class SumPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
       int sum=0;
       
       for(int i=x;i<=y;i++){
           int count=0;
           for(int j=2;j<=i/2;j++){
            if(i%j==0){   
                count++;
                break;
           }}
            if(count==0){
                sum=sum+i;
            }
           }
         
       
        System.out.println(""+sum);
    }
}
