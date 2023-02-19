package edu.craptocraft.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.behaviour.Packing;

public class Caja implements Packing{

    @Override
    public String envoltorio() {
        return "Caja";
    }

}
