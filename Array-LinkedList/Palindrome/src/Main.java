public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.splitPalindrome("Able was I ere I saw Elba");
        System.out.println(palindrome.getQueue());
        System.out.println(palindrome.getStack());
        System.out.println(palindrome.isPalindrome());
    }
}