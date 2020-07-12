package main;

import main.Accessories.Socks;
import main.base.AbstractStuff;
import main.clothes.Jackets;
import main.factory.AbstractFactory;
import main.shoes.Sandals;
import main.shoes.Hiking;
import main.shoes.WinterBoots;

public class StoreOwner {

    public static void main(String[] args) {
        StoreOwner storeOwner = new StoreOwner();
        storeOwner.createOrder();

    }
    public void createOrder(){
        //without using Abstract Factory

       WinterBoots winterBoots = new WinterBoots(String.valueOf(Enums.Color.Black), 2, 7);
       Jackets jacket = new Jackets(String.valueOf(Enums.Color.Red), 20, 9);
       Socks socks = new Socks(String.valueOf(Enums.Color.Red), 200, 7);

       promoteBoots(winterBoots, 20);
       promoteJackets(jacket, 100);
       promoteSocks(socks, 1);

//       FlatSandals flatSandals = new FlatSandals(String.valueOf(Color.Green), 1, 6);
//       HeelSandals heelSandals = new HeelSandals(String.valueOf(Color.Grey), 3, 8);
//
//       String color = heelBoots.getShoesColor();
//       int size = heelBoots.getShoesSize();
//       int quantity = heelBoots.getQuantity();


        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory shoesFactory = factoryProducer.getFactory(Enums.Type.Shoes);
        AbstractStuff boots = shoesFactory.produce(Enums.Type.Winter, String.valueOf(Enums.Color.Black), 2, 7);

        AbstractFactory clothesFactory = factoryProducer.getFactory(Enums.Type.Clothes);
        AbstractStuff jackets = clothesFactory.produce(Enums.Type.OutDoor, String.valueOf(Enums.Color.Grey), 4, 6);

        AbstractFactory accessoriesFactory = factoryProducer.getFactory(Enums.Type.Accessories);
        AbstractStuff sockets = accessoriesFactory.produce(Enums.Type.Indoor, String.valueOf(Enums.Color.Grey), 4, 6);

        promote(jackets, 20);
        promote(boots, 10);
        promote(sockets, 1);

        System.out.println("my shoes color, size and quantity is " + boots.getColor() + boots.getSize() + boots.getQuantity());

    }

    public void promote(AbstractStuff stuff, int price)
    {
        stuff.setPrice(price);
    }

    public void promoteBoots(WinterBoots boots, int price)
    {
        boots.setPrice(price);
    }
    public void promoteJackets(Jackets jackets, int price)
    {
        jackets.setPrice(price);
    }
    public void promoteSocks(Socks socks, int price)
    {
        socks.setPrice(price);
    }
}
