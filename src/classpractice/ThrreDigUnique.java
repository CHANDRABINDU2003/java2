
package classpractice;


public class ThrreDigUnique {
    public static void main(String[] args) {
        int am=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(i!=j&&j!=k&&k!=i){
                        am++;
                        System.out.println(i+""+j+""+k);
                    
            }
        }
    }
  
}
        System.out.println("the amount are "+am);
        System.out.println("the time is %tc%n "+System.currentTimeMillis());
    }
    
}