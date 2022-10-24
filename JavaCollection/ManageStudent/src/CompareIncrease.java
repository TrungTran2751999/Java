import java.util.Comparator;

public class CompareIncrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getCost() > o2.getCost()){
            return 1;
        }
        return -1;
    }
}
