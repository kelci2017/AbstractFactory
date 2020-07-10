package main;

public class BootsFactory extends AbstractShoesFactory {
    @Override
    public AbstractShoes produceShoes(Enums.Type type, String color, int quantity, int size) {
        if (type.equals(Enums.Type.Heel)) {
            return new HeelBoots(color, quantity, size);
        } else {
            return new FlatBoots(color,quantity, size);
        }
    }
}
