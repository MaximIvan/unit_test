package seminars.first.homework.Shop;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Product bread = new Product("Хлеб", 200);
        Product cheese = new Product("Сыр", 450);
        Product milk = new Product("Молоко", 110);
        Product expensive = new Product("Телевизор", 150_000);

        Shop shop = new Shop();
        shop.addProductToShop(bread);
        shop.addProductToShop(milk);
        shop.addProductToShop(cheese);
        shop.printShopContent();
        shop.sortProductsByPrice();
        ShopTest.testSorting(shop);
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        System.out.println("Самый дорогой продукт в магазине:\n" + mostExpensiveProduct.getTitle());
        testMostExpensiveProduct(shop, expensive);
    }

    /**
     Метод проверки сортировки
     */

    public static void testSorting(Shop shop) {
        for (int i = 0; i < shop.getLength() - 1; i++) {
            assertThat(shop.getProductCostInShop(i + 1)).isGreaterThan(shop.getProductCostInShop(i));
        }
    }

    public static void testMostExpensiveProduct(Shop shop, Product product) {
        for (int i = 0; i < shop.getLength() - 1; i++) {
            assertThat(product.getCost()).isGreaterThan(shop.getProductCostInShop(i));
        }
    }

}
