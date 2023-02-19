package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Cereales;

public class Smiggles extends Cereales {
    
    private final String NOMBRE = "Smiggles";
    private final Float PVP = (float) 50.0;
    
    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }


    @Override
    public String toString() {
        
        StringBuilder smiggle = new StringBuilder();
        smiggle.append("Item: Smiggles,"+" Empaquetado: "+this.empaquetado().envoltorio()+", Precio: "+this.PVP);
        return smiggle.toString();

    }
}
