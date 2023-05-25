import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octalNumber = scanner.nextLine().trim();

        int decimalNumber = octalToDecimal(octalNumber);

        System.out.println(decimalNumber);
    }

    public static int octalToDecimal(String s) {
        int decimal = 0;
        int power = 0;

        // Iterate over each digit in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(s.charAt(i));
            decimal += digit * Math.pow(8, power);
            power++;
        }

        return decimal;
    }
}
