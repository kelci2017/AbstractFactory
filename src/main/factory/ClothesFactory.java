package main.factory;

import main.Enums;
import main.base.AbstractStuff;
import main.clothes.Jackets;
import main.clothes.Pajams;
import main.clothes.WinterCoats;

public class ClothesFactory extends AbstractFactory {
    @Override
    public AbstractStuff produce(Enums.Type type, String color, int quantity, int size) {
        if (type.equals(Enums.Type.Winter)) {
            return new WinterCoats(color, quantity, size);
        } else if (type.equals(Enums.Type.Indoor)){
            return new Pajams(color,quantity, size);
        } else {
            return new Jackets(color,quantity, size);
        }
    }
}
