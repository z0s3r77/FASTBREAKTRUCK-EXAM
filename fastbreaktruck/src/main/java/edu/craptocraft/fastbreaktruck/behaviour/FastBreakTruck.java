package edu.craptocraft.fastbreaktruck.behaviour;

import edu.craptocraft.fastbreaktruck.domain.Desayuno;
import edu.craptocraft.fastbreaktruck.domain.Eyeholes;
import edu.craptocraft.fastbreaktruck.domain.FleebJuice;
import edu.craptocraft.fastbreaktruck.domain.Smiggles;
import edu.craptocraft.fastbreaktruck.domain.TurbulentJuice;

public class FastBreakTruck {
    

    public FastBreakTruck(){}
    
    public static Desayuno prepararEyeHoles(){

        Desayuno desayuno = new Desayuno();

        Eyeholes eyeholes = new Eyeholes();
        TurbulentJuice turbulent = new TurbulentJuice();

        desayuno.addItem(eyeholes);
        desayuno.addItem(turbulent);

        return desayuno;

    }


    public static Desayuno prepararSmiggles(){


        Desayuno desayuno = new Desayuno();

        Smiggles smiggle = new Smiggles();
        FleebJuice fleebJuice = new FleebJuice();

        desayuno.addItem(smiggle);
        desayuno.addItem(fleebJuice);

        return desayuno;

    }
}
