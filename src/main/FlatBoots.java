package main;

public class FlatBoots extends AbstractShoes {
    int shoesSize;
    String color;
    int quantity;

    public FlatBoots(String color, int quantity, int shoesSize) {
        this.quantity = quantity;
        this.shoesSize = shoesSize;
        this.color = color;
    }

    @Override
    public int getShoesSize() {
        return shoesSize;
    }
    public void setShoesSize(int size) {
        this.shoesSize = size;
    }
    @Override
    public String getShoesColor() {
        return color;
    }
    public void setShoesColor(String shoesColor) {
        this.color = shoesColor;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
