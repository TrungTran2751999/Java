import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Palindrome palindrome = new Palindrome();
//        palindrome.splitPalindrome("terihreut");
//        System.out.println(palindrome.getStack());
//        System.out.println(palindrome.isPalindrome());
        Stack<Integer> number = new Stack<>();
        for(int i=0; i< 5; i++){
           number.add(i);
        }
        number.add(4,888);
        number.add(0, 156);
        System.out.println(number);
    }
}