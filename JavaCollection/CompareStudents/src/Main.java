import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Trung" ,"An", "Vu" ,"Binh"};
        int[] age = {12, 12, 14, 15, 16, 17};
        String[] address = {"Tran a", "Tran b", "Tran c", "Tran d", "Tran e"};
        Stack<Student> students = new Stack<>();
        for(int i=0; i<name.length; i++){
            students.add(new Student(name[i], age[i], address[i]));
        }
        List<Student> lists = new ArrayList<Student>();
        for(int i=0; i<students.size(); i++){
            lists.add(students.get(i));
        }
//        Collections.sort(lists);
//        for(Student str: lists){
//            System.out.println(str.toString());
//        }
        System.out.println("==================================");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists);
        Collections.sort(lists, ageComparator);
        for(Student str: lists){
            System.out.println(str.toString());
        }
    }
}