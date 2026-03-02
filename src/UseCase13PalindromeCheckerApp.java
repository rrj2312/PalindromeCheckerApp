import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    public static boolean isPalindromeReverse(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static boolean isPalindromeTwoPointer(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String input) {
        return checkRecursive(input, 0, input.length() - 1);
    }

    private static boolean checkRecursive(String input, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (input.charAt(left) != input.charAt(right)) {
            return false;
        }
        return checkRecursive(input, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nInput : " + input);

        long start1 = System.nanoTime();
        boolean result1 = isPalindromeReverse(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        System.out.println("Reverse Method Result : " + result1);
        System.out.println("Execution Time        : " + time1 + " ns\n");

        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("Two Pointer Result    : " + result2);
        System.out.println("Execution Time        : " + time2 + " ns\n");

        long start3 = System.nanoTime();
        boolean result3 = isPalindromeRecursive(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("Recursive Result      : " + result3);
        System.out.println("Execution Time        : " + time3 + " ns\n");

        System.out.println("Performance Comparison (in nanoseconds)");
        System.out.println("Reverse Method   : " + time1);
        System.out.println("Two Pointer      : " + time2);
        System.out.println("Recursive        : " + time3);

        scanner.close();
    }
}