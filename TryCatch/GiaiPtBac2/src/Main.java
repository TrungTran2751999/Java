import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean checkContinue = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Giai pt bac 2\n [1]: HANDLE \n [2]: EXIT");
            System.out.print("Nhap option: ");
            String input = scanner.nextLine();
            switch (input){
                case "1":{
                    inputElement(scanner);
                    break;
                }
                case "2":{
                    checkContinue = false;
                }
            }
        }while (checkContinue);

    }
    public static boolean inputElement(Scanner scanner){
        boolean checkLoop = true;
        double a = 0, b = 0, c = 0;
        do{
            try {
                System.out.print("Nhap a: ");
                a = scanner.nextDouble();
                checkLoop = false;
            }catch (Exception e){
                checkLoop = true;
                scanner.next();
            }
        }while (checkLoop);
        checkLoop = true;
        do{
            try {
                System.out.print("Nhap b: ");
                b = scanner.nextDouble();
                checkLoop = false;
            }catch (Exception e){
                checkLoop = true;
                scanner.next();
            }
        }while (checkLoop);
        checkLoop = true;
        do{
            try {
                System.out.print("Nhap c: ");
                c = scanner.nextDouble();
                checkLoop = false;
            }catch (Exception e){
                checkLoop = true;
                scanner.next();
            }
        }while (checkLoop);
        PT2 pt2 = new PT2(a, b, c);
        System.out.println(pt2.handlePT2());
        return true;
    }
}