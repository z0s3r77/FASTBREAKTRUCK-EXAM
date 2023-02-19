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

}
