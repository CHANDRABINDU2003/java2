
package classpractice;


public class Classpractice {

    public static void main(String[] args) {
       //fibonacci number
       int n1=0,n2=1,n3,count=10,i;
        System.out.print(n1+ " " +n2);
        for(i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(" " +n3);
            n1=n2;
            n2=n3;
        }
    }
    
}
