package main.factory;

import main.Enums;
import main.base.AbstractStuff;

public abstract class AbstractFactory
{
    public abstract AbstractStuff produce
            (Enums.Type type, String color,
             int quantity, int size);
}
