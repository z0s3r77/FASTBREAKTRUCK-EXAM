package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.behaviour.Packing;

public class Tubo implements Packing {

    @Override
    public String envoltorio() {
        return "Tubo";
    }
    
}
