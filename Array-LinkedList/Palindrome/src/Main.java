public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.splitPalindrome("terihreut");
        System.out.println(palindrome.getStack());
        System.out.println(palindrome.isPalindrome());
    }
}