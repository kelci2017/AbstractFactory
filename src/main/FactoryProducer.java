package main;

import main.factory.AbstractFactory;
import main.factory.ClothesFactory;
import main.factory.ShoesFactory;
import main.factory.AccessoriesFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(Enums.Type type){
        if(type.equals(Enums.Type.Shoes)){
            return new ShoesFactory();
        } else if (type.equals(Enums.Type.Accessories)){
            return new AccessoriesFactory();
        } else {
            return new ClothesFactory();
        }
    }
}
