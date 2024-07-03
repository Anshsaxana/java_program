import java.util.Scanner;

public class Identifing_alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your alphabet:");
        char c = scanner.next().charAt(0);

        if (c >= 65 && c <= 90) {
            System.out.println("Your alphabet is big");
        } else if (c >= 97 && c <= 122) {
            System.out.println("Your alphabet is small");
        } else {
            System.out.println("Unidentified ");
        }
    }
}
