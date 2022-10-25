import java.util.HashMap;
import java.util.Map;

public class PT2 {
    double a, b, c;
    public PT2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta(){
        double delta = Math.pow(this.b, 2) - 4*this.a*this.c;
        return delta;
    }
    public Map<String,String> handlePT2(){
        Map<String, String> rootList = new HashMap<>();
        rootList.clear();
        if(getDelta() > 0){
            double x1 = (-b + Math.sqrt(getDelta()))/(2*a);
            double x2 = (-b - Math.sqrt(getDelta()))/(2*a);
            rootList.put("x1", Double.toString(x1));
            rootList.put("x2", Double.toString(x2));
        }else if(getDelta() < 0){
            rootList.put("vo nghiem", "PT vo nghiem");
        }else{
            double x = -b/(2*a);
            rootList.put("x", Double.toString(x));
        }
        return rootList;
    }
}
