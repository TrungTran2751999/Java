import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean checkFinish = true;
        do{
            System.out.println("Menu\n [1]: ADD\n [2]: UPDATE\n [3]: REMOVE\n [4]: SHOW\n [5]: SEARCH\n [0]: Exit");
            String number = scanner.nextLine();
            switch (number){
                case "1":{
                    addProduct(productList, scanner);
                    break;
                }
                case "2":{
                    updateProduct(productList, scanner);
                    break;
                }
                case "3":{
                    removeProduct(productList, scanner);
                    break;
                }
                case "4":{
                    showProduct(productList, scanner);
                    break;
                }
                case "5": {
                    searchProduct(productList,scanner);
                }
                case "0":{
                    checkFinish = false;
                }
                default:{
                    checkFinish = true;
                }
            }
        }while (checkFinish);
    }
    public static void showProduct(List<Product> productList, Scanner scanner){
        boolean checkConti = true;
        CompareIncrease compareIncrease = new CompareIncrease();
        CompareDecrease compareDecrease = new CompareDecrease();
        do{
            System.out.println("Sap xep theo:\n [1]: Tang\n [2] Giam");
            String number = scanner.nextLine();
            switch (number){
                case "1":{
                    Collections.sort(productList, compareIncrease);
                    checkConti = false;
                    break;
                }
                case "2":{
                    Collections.sort(productList, compareDecrease);
                    checkConti = false;
                    break;
                }
            }
        }while (checkConti);
        System.out.println("|====id====|Name Product======================|Address Product Name=====|Cost==============|");
        for(int i=0; i<productList.size(); i++){
            System.out.printf("|    %-6s|%-34s|%-25s|%-18s|", i+1, productList.get(i).getName(), productList.get(i).getAddress_product(), productList.get(i).getCost());
            System.out.println("");
        }
    }
    public static void addProduct(List<Product> productList, Scanner scanner){
        String productName;
        String name;
        int cost;
        do{
            System.out.print("Nhap ten hang: ");
            name = scanner.nextLine();
        }while(name.equals(""));
        do{
            System.out.print("Nhap ten nha san xuat: ");
            productName = scanner.nextLine();
        }while (productName.equals(""));
        do{
            System.out.print("Nhap gia: ");
            cost = Integer.parseInt(scanner.nextLine());
        }while (productName.equals(""));

        productList.add(new Product(name, productName, cost));
    }
    public static void updateProduct(List<Product> productList, Scanner scanner){
        int id;
        String name;
        String address_name;
        int cost;
        do{
            System.out.println("Nhap id: ");
            id = Integer.parseInt(scanner.nextLine());
        }while (id <= 0 || id >= productList.size());
            System.out.println("Nhap name: ");
            name = scanner.nextLine().trim();
        if(!name.equals("")) productList.get(id-1).setName(name);
            System.out.println("Nhap address product: ");
            address_name = scanner.nextLine().trim();
        if(!address_name.equals("")) productList.get(id-1).setAddress_product(address_name);
            System.out.println("Nhap cost product: ");
            cost = Integer.parseInt(scanner.nextLine().trim());
        if(cost != 0) productList.get(id-1).setCost(cost);
    }
    public static void removeProduct(List<Product> productList, Scanner scanner){
        int id;
        do {
            System.out.println("Nhap id: ");
            id = Integer.parseInt(scanner.nextLine());
        }while (id <= 0 || id >= productList.size()) ;
        if(id != 0) productList.remove(id-1);
    }
    public static void searchProduct(List<Product> productList, Scanner scanner){
        boolean checkContinue = true;
        do{
            System.out.println("Search for:\n [1]: Product Name\n [2] Address Product Name");
            String number = scanner.nextLine();
            switch (number){
                case "1":{
                    boolean checkExit = true;
                    do{
                        System.out.print("Nhap Product Name: ");
                        String name = scanner.nextLine();
                        List<Product> searchProduct = new ArrayList<>();
                        for(int i=0; i<productList.size(); i++){
                            if(name.equals(productList.get(i).getName())){
                                searchProduct.add(productList.get(i));
                            }
                        }
                        if(searchProduct.size() > 0){
                            System.out.println("|====id====|Name Product======================|Address Product Name=====|Cost==============|");
                            for(int i=0; i< searchProduct.size(); i++){
                                System.out.printf("|    %-6s|%-34s|%-25s|%-18s|", i+1, searchProduct.get(i).getName(), searchProduct.get(i).getAddress_product(), searchProduct.get(i).getCost());
                                System.out.println("");
                            }
                            checkExit = false;
                        }else{
                            System.out.println("San pham ban tim ko co:\n [1]: Exit\n [2]: Continue");
                            String option = scanner.nextLine();
                            switch (option){
                                case "1":{
                                    searchProduct.clear();
                                    checkExit = false;
                                    break;
                                }
                                case "2":{
                                    checkExit = true;
                                }
                            }
                        }
                    }while (checkExit);
                    checkContinue = false;
                    break;
                }
                case "2":{
                    boolean checkExit = true;
                    do{
                    System.out.println("Nhap Address Product Name: ");
                    String name = scanner.nextLine();
                    List<Product> searchProduct = new ArrayList<>();
                    for(int i=0; i<productList.size(); i++){
                        if(name.equals(productList.get(i).getAddress_product())){
                            searchProduct.add(productList.get(i));
                        }
                    }
                    if(searchProduct.size() > 0){
                        System.out.println("|====id====|Name Product======================|Address Product Name=====|Cost==============|");
                        for(int i=0; i< searchProduct.size(); i++){
                            System.out.printf("|    %-6s|%-34s|%-25s|%-18s|", i+1, searchProduct.get(i).getName(), searchProduct.get(i).getAddress_product(), searchProduct.get(i).getCost());
                            System.out.println("");
                        }
                        checkExit = false;
                    }else{
                        System.out.println("Address Product Name ban tim ko co:\n [1]: Exit \n[2]: Continue");
                        String option = scanner.nextLine();
                        switch (option){
                            case "1":{
                                searchProduct.clear();
                                checkExit = false;
                                break;
                            }
                            case "2":{
                                checkExit = true;
                            }
                        }
                    }
                    }while (checkExit);
                }
                checkContinue = false;
                break;
                default:{
                    checkContinue = true;
                }
            }
        }while (checkContinue);
    }
}