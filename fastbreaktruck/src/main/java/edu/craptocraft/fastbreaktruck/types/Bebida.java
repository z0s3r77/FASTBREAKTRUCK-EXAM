package edu.craptocraft.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.behaviour.Packing;
import edu.craptocraft.fastbreaktruck.domain.Tubo;

public abstract class Bebida implements Item{

    private Tubo tubo = new Tubo();

    public Bebida(){}

    public Packing empaquetado(){
        return this.tubo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
