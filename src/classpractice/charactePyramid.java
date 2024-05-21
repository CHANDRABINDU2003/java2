
package classpractice;
 import java.util.Scanner;

public class charactePyramid {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character to use for the rhombus: ");
        char character = scanner.next().charAt(0);

        System.out.print("Enter the number of rows for the rhombus: ");
        int rows = scanner.nextInt();

        // Display the rhombus
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print characters
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(character);
            }

            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print characters
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(character);
            }

            System.out.println();
        }

        scanner.close();
    }
}
   

