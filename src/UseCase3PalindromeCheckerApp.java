import java.util.Scanner;
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Is it a Palindrome? : ");
        String s = input.nextLine();
        String cleanedString = s.toLowerCase();
        int length = s.length();
        String rev_s = "";
        for(int i=length-1; i>=0; i--) {
            rev_s = rev_s + s.charAt(i);
            if (s.equals(rev_s))
                System.out.println("String is palindrome");
            else
                System.out.println("String is not palindrome");
        }
    }
}