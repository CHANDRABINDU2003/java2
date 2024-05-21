
package classpractice;

import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int q=0;
        while(q!=1){
        if((x>=25&&x<=75)&&(y>=25&&y<=75)){
            System.out.println("ok");
            q++;
        }
        else
        { System.out.println("give another number");
        x=sc.nextInt();
         y=sc.nextInt();
        
    }}
        if((x%10==y%10)||(x%10==y/10)||(x/10==y/10)||(y%10==x/10)){
            System.out.println("TRUE");  
        }
        else
            System.out.println("false");
 
}}
