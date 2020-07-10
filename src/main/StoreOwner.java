package main;

public class StoreOwner {

    public static void main(String[] args) {
        StoreOwner storeOwner = new StoreOwner();
        storeOwner.createOrder();

    }
    public void createOrder(){
        // without using Abstract Factory
//       HeelBoots heelBoots = new HeelBoots(String.valueOf(Color.Black), 2, 7);
//       FlatBoots flatBoots = new FlatBoots(String.valueOf(Color.Red), 20, 9);
//       FlatSandals flatSandals = new FlatSandals(String.valueOf(Color.Green), 1, 6);
//       HeelSandals heelSandals = new HeelSandals(String.valueOf(Color.Grey), 3, 8);
//
//       String color = heelBoots.getShoesColor();
//       int size = heelBoots.getShoesSize();
//       int quantity = heelBoots.getQuantity();

        //new an instance of shoes producer
        ShoesFactoryProducer shoesFactoryProducer = new ShoesFactoryProducer();
        //producer has boot factories
        AbstractShoesFactory bootsFactory = shoesFactoryProducer.getFactory(Enums.Type.Boot);
        //just tell the factory what type of boots do you want
        AbstractShoes heelBoots = bootsFactory.produceShoes(Enums.Type.Heel, String.valueOf(Enums.Color.Black), 2, 7);
        //producer has sandal factories
        AbstractShoesFactory sandalsFactory = shoesFactoryProducer.getFactory(Enums.Type.Sandal);
        //just tell the factory what type of sandals do you wnat
        AbstractShoes flatSandals = bootsFactory.produceShoes(Enums.Type.Flat, String.valueOf(Enums.Color.Grey), 4, 6);
        System.out.println("my shoes color, size and quantity is " + heelBoots.getShoesColor() + heelBoots.getShoesSize() + heelBoots.getQuantity());
    }
}
