package edu.craptocraft.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.behaviour.Packing;

public abstract class Cereales implements Item{
    

    public Cereales(){}

    @Override
    public String nombre() {
        return null;
    }

    @Override
    public Packing empaquetado() {
        return null;
    }

    @Override
    public Float pvp() {
        return null;
    }

}
