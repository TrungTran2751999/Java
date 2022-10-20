public class GenericStackClient {
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    private static void scanStack(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        for(int i=0; i< 10; i++){
            stack.push(i);
        }
        for(int i=0; i < stack.size(); i++){
            System.out.printf("stack[%s]: %s", i, stack.get(i));
            System.out.println("");
        }
    }
    public static void main(String[] args) {
//       scanStack();
        System.out.println("1. Stack of integers");
        stackOfIntegers();
//        System.out.println("\n2. Stack of Strings");
//        stackOfIStrings();
    }
}
