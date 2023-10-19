package seminars.first.homework.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private ArrayList<Product> shop;

    // Геттеры, сеттеры:
    public void ShopOrders() {
        this.shop = new ArrayList<>();
    }

    public void addProductToShop(Product product) {
        shop.add(product);

    }

    public ArrayList getShop() {
        return shop;
    }

    public void printShopContent() {
        for (Product product : shop) {
            System.out.println(product);
        }
    }

    public int getLength(){
        return shop.size();
    }

    public float getProductCostInShop(int i){
        return shop.get(i).getCost();
    }

    /**
     Метод должен вернуть отсортированный по возрастанию по цене список продуктов
     */

    public List<Product> sortProductsByPrice() {
        Comparator compare = new CompareCost();
        Collections.sort(shop, compare);
        return shop;
    }

    /**
     Метод должен вернуть самый дорогой продукт
     */

    public Product getMostExpensiveProduct() {
        float maxCost = 0;
        int index = 0;
        for (Product product : shop) {
            if (product.getCost() > maxCost) {
                maxCost = product.getCost();
                index = shop.indexOf(product);
            }
        }
        return shop.get(index);
    }

}