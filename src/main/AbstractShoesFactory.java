package main;

public abstract class AbstractShoesFactory {
    public abstract AbstractShoes produceShoes
            (Enums.Type type, String color, int quantity, int size);
}
