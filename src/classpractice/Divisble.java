
package classpractice;
import java.util.Scanner;
public class Divisble {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num=0;
        for(int i=1;i<=99;i++){
            if(i%3==0&&i%5==0){
                num++;
                System.out.println(i);
            }
    }
        System.out.println("numbers are "+num);
    }
  
}
