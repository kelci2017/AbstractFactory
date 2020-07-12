package main.factory;

import main.Enums;
import main.shoes.Hiking;
import main.base.AbstractStuff;
import main.shoes.Sandals;
import main.shoes.WinterBoots;

public class ShoesFactory extends AbstractFactory {
    @Override
    public AbstractStuff produce(Enums.Type type, String color, int quantity, int size) {
        if (type.equals(Enums.Type.Winter)) {
            return new WinterBoots(color, quantity, size);
        } else if (type.equals(Enums.Type.Indoor)){
            return new Hiking(color,quantity, size);
        } else {
            return new Sandals(color,quantity, size);
        }
    }
}
