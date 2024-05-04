import java.util.Arrays;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        String order = scanner.next();

        Arrays.sort(numbers);
        for (int i = 0; i < 3; i++) {
            char letter = order.charAt(i);
            if (letter == 'A') {
                System.out.print(numbers[0]);
            } else if (letter == 'B') {
                System.out.print(numbers[1]);
            } else {
                System.out.print(numbers[2]);
            }

            if (i < 2) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
