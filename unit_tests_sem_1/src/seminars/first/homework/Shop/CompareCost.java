package seminars.first.homework.Shop;

import java.util.Comparator;

public class CompareCost implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getCost() - p2.getCost());
    }
}
