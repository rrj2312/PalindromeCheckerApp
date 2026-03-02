import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        input = input.toLowerCase().replace(" ", "");
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}