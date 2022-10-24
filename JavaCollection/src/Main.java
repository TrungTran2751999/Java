import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, StudentList> hashMap = new HashMap<>();
        String[] name = {"aaa", "bbb", "ccc", "ddd", "kkk"};
        int[] id = {123, 456, 321, 789, 905};
        for(int i=1; i<=5; i++){
            hashMap.put(i, new StudentList(i, name[i-1], id[i-1]));
        }
        System.out.println(hashMap.get(1).getAge());
    }
}