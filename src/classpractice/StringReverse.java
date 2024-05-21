package classpractice;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String x = inp.nextLine();
        System.out.println("before reverse: " + x);

        // Convert the string to a char array
        char[] charArray = x.toCharArray();

        // Reverse the char array
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

        
    }
}
