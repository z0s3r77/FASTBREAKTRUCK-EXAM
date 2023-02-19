package edu.craptocraft.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.behaviour.Packing;
import edu.craptocraft.fastbreaktruck.domain.Caja;

public abstract class Cereales implements Item{
    
    private Caja caja = new Caja();

    public Cereales(){}

    @Override
    public Packing empaquetado() {
        return this.caja;
    }


}
