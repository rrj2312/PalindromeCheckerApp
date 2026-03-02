import java.util.Scanner;


public class PalindromeCheckerApp {
    static boolean check(String s, int start, int end){
        if(s.charAt(start) == ' '){
            return check(s, start + 1, end);
        }
        if (s.charAt(end) == ' ') {
            return check(s, start, end - 1);
        }
        if(start>=end){
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start+1, end-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        boolean result = check(input,0,input.length()-1);
        System.out.println("Is Palindrome? :"+result);
        sc.close();
    }
}