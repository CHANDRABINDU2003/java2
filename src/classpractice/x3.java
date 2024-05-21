
package classpractice;
import java.util.Scanner;
public class x3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("give the day number");
        int day = x.nextInt();
       
       
        String dayname="";
        switch(day){
            case 1: dayname="SATURDAY";
            break;
            case 2: dayname="SunDAY";
            break;
            case 3: dayname="monDAY";
            break;
            case 4: dayname="TuesDAY";
            break;
            case 5: dayname="ThrusDAY";
            break;
            case 6: dayname="FriDAY";break;
            
            case 7: dayname="WednesDAY";
            break;
            default: dayname="INVALID";
            
        }
        System.out.println(dayname);
    }
    
}
