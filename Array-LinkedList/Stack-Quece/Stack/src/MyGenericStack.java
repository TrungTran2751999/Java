import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public Object pop(){
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public T get(int item){
        return stack.get(item);
    }
    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}
