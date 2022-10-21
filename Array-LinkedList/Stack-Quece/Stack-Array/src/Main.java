public class Main {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(5);
        for(int i=0; i< myStack.size(); i++){
            myStack.push(i);
        }
        System.out.println("SIZE: "+myStack.size());
        for(int i=0; i< myStack.size; i++){
            System.out.printf("arr[%s] = %s\n", i, myStack.arr[i]);
        }
        for(int i=1; i<= myStack.index; i++){
            myStack.pop();
        }
        System.out.println("SIZE: "+myStack.size());
        System.out.println("===================================");
        for(int i=0; i< myStack.size; i++){
            System.out.printf("arr[%s] = %s\n", i, myStack.arr[i]);
        }

    }
}