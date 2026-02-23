import java.util.Scanner;

public class UseCase2PalindromeCheckerApp{
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int length = s.length();
        for(int i=0; i<length/2; i++){
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Input text: ");
        Scanner input  = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Is it a Palindrome? : "+isPalindrome(text));

    }
}