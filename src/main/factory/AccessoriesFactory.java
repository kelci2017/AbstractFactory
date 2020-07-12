package main.factory;

import main.Accessories.Backpack;
import main.Accessories.Socks;
import main.Accessories.Minton;
import main.Enums;
import main.base.AbstractStuff;

public class AccessoriesFactory extends AbstractFactory {
    @Override
    public AbstractStuff produce(Enums.Type type, String color, int quantity, int size) {
        if (type.equals(Enums.Type.Winter)) {
            return new Minton(color, quantity, size);
        } else if (type.equals(Enums.Type.Indoor)){
            return new Socks(color,quantity, size);
        } else {
            return new Backpack(color,quantity, size);
        }
    }
}
