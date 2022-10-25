import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(arrangeString("Welcome"));
    }
    public static String arrangeString(String str){
        String[] arrStr = str.split("");
        Map<Integer,String> arrChar=new TreeMap<>();
        for(int i=0; i<arrStr.length; i++){
            arrChar.put(str.codePointAt(i), arrStr[i]);
        }
        String[] arrResult = arrChar.values().toArray(new String[0]);
        String strr ="";
        for(int i=0; i<arrResult.length; i++){
            strr+=arrResult[i];
        }
        return strr;
    }
}