package edu.craptocraft.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.behaviour.Packing;
import edu.craptocraft.fastbreaktruck.domain.Caja;

public class Juguete implements Item{

    private Caja caja = new Caja();

    @Override
    public String nombre() {
        return null;
    }

    @Override
    public Packing empaquetado() {
        return this.caja;
    }

    @Override
    public Float pvp() {
        return null;
    }
    
}
