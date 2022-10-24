class MyThread implements Runnable{
    double x;
    public void start(){
        this.run();
    }
    @Override
    public void run(){
        while (true){
            x++;
            System.out.println(x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
