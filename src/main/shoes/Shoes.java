package main.shoes;

import main.base.AbstractStuff;

public class Shoes extends AbstractStuff {
    int size;
    String color;
    int quantity;

    public Shoes(String color, int quantity, int shoesSize) {
        this.quantity = quantity;
        this.size = shoesSize;
        this.color = color;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String shoesColor) {
        this.color = shoesColor;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int price) {

    }
}
