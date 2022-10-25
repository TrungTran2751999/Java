public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        double a=3, b=4, c=5;
        new Triagle(a, b, c);
    }
}
class IllegalTriangleException extends Exception{
    String message;
    public IllegalTriangleException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
class Triagle{
    double a, b, c;
    public Triagle(double a, double b, double c) throws IllegalTriangleException{
        this.a = a;
        this.b = b;
        this.c = c;
        if(checkTriagle()==false){
            throw new IllegalTriangleException("Meo Phai tam giac");
        }else{
            System.out.println("Phai la tam giac");
        }
    }
    public boolean checkTriagle(){
        if(this.a + this.b <= this.c || this.a+this.c <= this.b || this.b + this.c <= this.a){
            return false;
        }
        return true;
    }
}