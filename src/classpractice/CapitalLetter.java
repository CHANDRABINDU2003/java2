
package classpractice;
import java.util.Scanner;
public class CapitalLetter {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       String x=inp.nextLine();
       x=" "+x;
       char[] p=x.toCharArray();
       for(int i=0;i<=x.length()-1;i++){
           if(p[i]==' '){
               i++;
               p[i]=Character.toUpperCase(p[i]);
           }
       }
       String res=new String(p);
        System.out.println(res.trim());
    }
  

}
