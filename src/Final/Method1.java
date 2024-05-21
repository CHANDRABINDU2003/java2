
package Final;
import java.util.Scanner;
import java.lang.Math;

public class Method1 {

static int logic(int x,int y,int p){
int z= Math.min(Math.min(x,y),p);
return z;
        
 }
    public static void main(String[] args) {
        int x,y,z;
        Scanner p = new Scanner(System.in);
        x=p.nextInt();
        y=p.nextInt();
        z=p.nextInt();
        int u=logic(x,y,z);
        System.out.println(u);

        
        
    }}
   

