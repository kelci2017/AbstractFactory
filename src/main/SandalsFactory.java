package main;

public class SandalsFactory extends AbstractShoesFactory {
    @Override
    public AbstractShoes produceShoes(Enums.Type type, String color, int quantity, int size) {
        if (type.equals(Enums.Type.Heel)) {
            return new HeelSandals(color, quantity, size);
        } else {
            return new FlatSandals(color,quantity, size);
        }
    }
}
