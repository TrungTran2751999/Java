import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] numberArray = new int[10];
        System.out.println("old ARRAY=======================");
        for(int i=0; i< numberArray.length; i++){
            numberArray[i] = i;
            System.out.printf("array[%s]: %s",i, numberArray[i]);
            System.out.println("");
        }
        for(int i=numberArray.length-1; i>=0; i--){
            stack.push((Integer) numberArray[i]);
        }
        System.out.println("new ARRAY========================");
        for(int i=0; i<numberArray.length; i++){
            numberArray[i] = stack.get(i);
            System.out.printf("array[%s]: %s",i, numberArray[i]);
            System.out.println("");
        }
    }
}