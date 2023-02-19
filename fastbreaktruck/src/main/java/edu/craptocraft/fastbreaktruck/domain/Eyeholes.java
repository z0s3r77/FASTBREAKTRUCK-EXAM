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

    @Override
    public String toString() {
        
        StringBuilder eyehole = new StringBuilder();
        eyehole.append("Item: Eyeholes,"+" Empaquetado: "+this.empaquetado().envoltorio()+", Precio: "+this.PVP);
        return eyehole.toString();

    }

}
