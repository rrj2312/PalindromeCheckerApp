import java.util.Scanner;

public class UseCase12PalindromeStrategyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        System.out.print("Choose Strategy (1-Stack, 2-Deque): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeContext context = new PalindromeContext(strategy);
        boolean result = context.executeStrategy(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}