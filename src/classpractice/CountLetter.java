
package classpractice;

import java.util.Scanner;
public class CountLetter {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        String x =inp.nextLine();
        int ch=0;
        int num=0;
        int emj=0;
        System.out.println("The string is "+x);
        char [] p = x.toCharArray();
        for(int i=0;i<=p.length-1;i++){
            if(p[i]>='a'&& p[i]<='z'){
                ch++;}
            else if(p[i]>='0'&&p[i]<='9'){
                num++;
            }
            else
                emj++;
                
        }
        System.out.println("the characters are"+ch);
         System.out.println("the numbers are"+num);
          System.out.println("the emj are"+emj);
    }
 
}
