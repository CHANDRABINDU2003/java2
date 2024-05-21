package classpractice;

import java.util.Scanner;

public class CheckAlpha {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String x = p.nextLine();
        
         if (x.length() > 1) {
            System.out.println("it is invalid");
        }
       else if ((x.charAt(0) == 'a' || x.charAt(0) == 'e' || x.charAt(0) == 'i' || x.charAt(0) == 'o' || x.charAt(0) == 'u')
                || (x.charAt(0) == 'A' || x.charAt(0) == 'E' || x.charAt(0) == 'I' || x.charAt(0) == 'O'
                        || x.charAt(0) == 'U')) {
            System.out.println("this is vowel");

        } else if ((x.charAt(0) >= 'a' && x.charAt(0) <= 'z') || (x.charAt(0) >= 'A' && x.charAt(0) <= 'Z')) {
            System.out.println("this is consonant");
        }

        

    }}
