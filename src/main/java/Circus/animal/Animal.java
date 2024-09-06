package Circus.animal;

import Circus.Asset;

public class Animal implements Asset {

    public String speak() {
        return null;
    }

    @Override
    public int getValue() {
        return 10;
    }
}
