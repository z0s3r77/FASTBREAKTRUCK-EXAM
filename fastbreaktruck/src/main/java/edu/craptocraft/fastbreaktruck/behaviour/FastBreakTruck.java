package edu.craptocraft.fastbreaktruck.behaviour;

import edu.craptocraft.fastbreaktruck.domain.Desayuno;
import edu.craptocraft.fastbreaktruck.domain.Eyeholes;
import edu.craptocraft.fastbreaktruck.domain.TurbulentJuice;

public class FastBreakTruck {
    

    public FastBreakTruck(){}
    
    public static Desayuno prepararEyeHoles(){

        Desayuno eyeDes = new Desayuno();

        Eyeholes eyeholes = new Eyeholes();
        TurbulentJuice turbulent = new TurbulentJuice();

        eyeDes.addItem(eyeholes);
        eyeDes.addItem(turbulent);

        return eyeDes;

    }

}
