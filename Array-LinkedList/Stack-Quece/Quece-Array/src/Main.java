public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(8);
        for(int i=1; i<9; i++){
            queue.enqueue(i);
        }
        queue.getQueueArr();
    }
}