public class Product {
    public static int id = 0;
    private String name;
    private String address_product;
    private int cost;
    public Product(String name, String address_product, int cost){
        this.address_product = address_product;
        this.name = name;
        this.cost = cost;
        id++;
    }

    public static void setId(int id) {
        Product.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(){
        id++;
    }
    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress_product() {
        return address_product;
    }

    public void setAddress_product(String address_product) {
        this.address_product = address_product;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", address_product='" + address_product + '\'' +
                '}';
    }

}
