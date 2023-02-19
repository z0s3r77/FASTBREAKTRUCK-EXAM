package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Bebida;

public class FleebJuice extends Bebida {
    
    private final String NOMBRE = "Fleeb Juice";
    private final Float PVP = (float) 35.0;


    @Override
    public String toString() {
        
        StringBuilder eyehole = new StringBuilder();
        eyehole.append("Item: Fleeb Juice,"+" Empaquetado: "+this.empaquetado().envoltorio()+", Precio: "+this.PVP);
        return eyehole.toString();

    }

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}
