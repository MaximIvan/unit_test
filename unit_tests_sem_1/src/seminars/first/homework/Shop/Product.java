package seminars.first.homework.Shop;

public class Product {

    private String title; // Название
    private float cost; // Стоимость продукта

    public Product(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }
    // Геттеры, сеттеры:
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s\n Стоимость: %d р.", getTitle(), getCost());
    }
}