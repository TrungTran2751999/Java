import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Binary binary = new Binary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap number: ");
        int input = scanner.nextInt();
        binary.toBinary(input);
        for(int i=0; i< binary.size(); i++){
            System.out.print(binary.get(i));
        }
    }
}