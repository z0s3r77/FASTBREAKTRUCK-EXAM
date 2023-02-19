package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Cereales;

public class Eyeholes extends Cereales {
        
    private final String NOMBRE = "Eyeholes";
    private final Float PVP = (float) 25.0;
    
    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }

}
