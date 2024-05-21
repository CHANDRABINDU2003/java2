
package classpractice;

import java.util.Scanner;
public class PrimeSum {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int x=inp.nextInt();
        int y=inp.nextInt();
       
        int sum=0;
        int a=0;
        while(a!=1){
            if(x>=2){
                a++;
                break;
                
                
            }
            else{
                System.out.println("give another range");
                x=inp.nextInt();
                y=inp.nextInt();
            }
        }
        for(int i=x;i<=y;i++){
             int count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
              sum=sum+i;  
            }
        
    }
        System.out.println("the sum is "+sum);
   
}}

