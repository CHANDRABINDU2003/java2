
package Final;

import java.util.Scanner;

public class Method2 {
    static int logic(int x,int y,int z){
     int p=(x+y+z)/3;
     return p;
    }
    
    public static void main(String[] args) {
        int x,y,z;
        Scanner uv = new Scanner(System.in);
        x=uv.nextInt();
        y=uv.nextInt();
        z=uv.nextInt();
        int a=logic(x,y,z);
        System.out.println(a);
    }
}
