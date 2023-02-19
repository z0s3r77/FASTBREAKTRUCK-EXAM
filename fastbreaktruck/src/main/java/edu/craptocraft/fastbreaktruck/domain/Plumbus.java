package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Juguete;

public class Plumbus extends Juguete{
        
    private final String NOMBRE = "Plumbus";
    private final Float PVP = (float) 100.0;
    
    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }


    @Override
    public String toString() {
        
        StringBuilder smiggle = new StringBuilder();
        smiggle.append("Item: Plumbus,"+" Empaquetado: "+this.empaquetado().envoltorio()+", Precio: "+this.PVP);
        return smiggle.toString();

    }

}
