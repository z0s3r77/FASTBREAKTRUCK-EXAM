package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.types.Bebida;

public class TurbulentJuice extends Bebida{

    
    private final String NOMBRE = "Turbulent juuuuuice";
    private final Float PVP = (float) 30.0;


    @Override
    public String toString() {
        
        StringBuilder eyehole = new StringBuilder();
        eyehole.append("Item: Turbulent juuuuuice,"+" Empaquetado: "+this.empaquetado().envoltorio()+", Precio: "+this.PVP);
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
