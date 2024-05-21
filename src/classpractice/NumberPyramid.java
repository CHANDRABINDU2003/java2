
package classpractice;


public class NumberPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print("*");
        }
            int space= 2*(4-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
    }
   for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                
                System.out.print("*");
        }
            int space= 2*(4-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
    }
   
}
}