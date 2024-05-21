
package classpractice;
import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner p= new Scanner(System.in);
        int x;
        x=p.nextInt();
        double area=6*(x*x)/((4*Math.tan(Math.PI))/6);
        System.out.println(area);
        
    }
  
}
