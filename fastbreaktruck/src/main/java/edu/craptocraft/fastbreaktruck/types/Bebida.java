package edu.craptocraft.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.behaviour.Packing;

public abstract class Bebida implements Item{



    public Bebida(){}

    public Packing empaquetado(){
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
