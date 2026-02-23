import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String s = input.nextLine();

        String cleanedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = cleanedStr.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is it a Palindrome?: " + isPalindrome);
        input.close();
    }
}