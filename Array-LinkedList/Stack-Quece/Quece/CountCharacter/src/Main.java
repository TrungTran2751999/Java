import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        boolean checkContinue = true;
        do{
            System.out.print("Nhap string:");
            String str = scanner.nextLine();

            if(!str.trim().equals("")){
                String[] arrStr = str.split(" ");
                System.out.println(Arrays.toString(arrStr));
                for(int i=0; i<arrStr.length; i++){
                    int count =0;
                    for(int j=0; j<arrStr.length; j++){
                        if(arrStr[i].equals(arrStr[j])){
                            count++;
                        }
                    }
                    map.put(arrStr[i], count);
                }
                System.out.println(map);
                checkContinue = true;
            }else{
                checkContinue = false;
            }

        }while (checkContinue);
    }
}