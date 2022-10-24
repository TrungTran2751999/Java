import java.util.*;

public class Palindrome {
    private String str;
    private Stack<String> queue;
    private Stack<String> stack;
    private Queue<String> queueq;
    public void splitPalindrome(String str){
        String[] arrStr = str.split("");
        stack = new Stack<>();
        for(int i=0; i<arrStr.length; i++){
            stack.add(arrStr[i]);
        }
    }
    public Stack<String> getStack(){
        return stack;
    }
    private Stack<String> getQueue(){
        queue = new Stack<>();
        for(int i= stack.size()-1; i>=0; i--){
            queue.add(stack.get(i));
        }
        return queue;
    }
    public boolean isPalindrome(){
        getQueue();
        for(int i=0; i<stack.size(); i++){
            System.out.printf(stack.get(i) + " " + queue.get(i) + "\n");
            if(!stack.get(i).equalsIgnoreCase(queue.get(i))){
                return false;
            }
        }
        return true;
    }
}
