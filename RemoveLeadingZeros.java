import java.util.Scanner;

public class RemoveLeadingZeros {
    public static String removeLeadingZeros(String input) {

        int index = 0;
        while (index < input.length() && input.charAt(index) == '0') {
            index++;
        }

        return input.substring(index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any String :");
        String input = scanner.nextLine();

        String output = removeLeadingZeros(input);

        System.out.println("Output: " + output);

        scanner.close();
    }
}

