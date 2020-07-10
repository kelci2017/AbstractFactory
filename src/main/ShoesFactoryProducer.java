package main;

public class ShoesFactoryProducer {
    public AbstractShoesFactory getFactory(Enums.Type type){
        if(type.equals(Enums.Type.Boot)){
            return new BootsFactory();
        }else{
            return new SandalsFactory();
        }
    }
}
