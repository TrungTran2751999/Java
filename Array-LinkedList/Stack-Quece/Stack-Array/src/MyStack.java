import java.util.Arrays;

public class MyStack {
    public int[] arr;
    public int size;
    public int index;
    public String alert;

    public MyStack(int size){
        this.size = size;
        arr = new int[this.size];
    }
    public boolean isFull(){
        if(index == size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    public void push(int element){
        if(!isFull()){
            arr[index] = element;
            index++;
        }else{
            throw new StackOverflowError("Stack is full");
        }
    }
    public void pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        size--;
        int[] fakeArr = Arrays.copyOf(arr, arr.length-1);
        for(int i=0; i<fakeArr.length; i++){
            fakeArr[i] = arr[i];
        }
        arr = fakeArr;
    }
    public int size(){
        return size;
    }
}
