
package classpractice;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
       int p=x.nextInt();
        int [] num= new int[p];
        for(int i=0;i<p;i++){
            num[i]=x.nextInt();
        }
        int y=x.nextInt();
       for(int i=0;i<p;i++){
           if(y==num[i])
           { System.out.println("index number is "+num[i]);
           break;
       }
           
               }
    }
   
}
