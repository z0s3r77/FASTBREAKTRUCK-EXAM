package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class DesayunoTest {
    

    static Desayuno desayuno;

    @BeforeClass public static void onlyOnce(){

        desayuno = new Desayuno();
        Eyeholes eyehole = new Eyeholes();
        TurbulentJuice turbulentJuice = new TurbulentJuice();

        desayuno.addItem(eyehole);
        desayuno.addItem(turbulentJuice);
    
    }

    @Test public void constructorTest(){
        assertNotNull(desayuno);
    }

    @Test public void addItemTest(){



        assertEquals(2, desayuno.getItems().size()); 


    
    }

    @Test public void getItemTest(){

       assertEquals(2, desayuno.getItems().size()); 

    }


    @Test public void getCosteTest(){
        

        assertEquals( 55.0, desayuno.getCoste(), 0);

    }
} 
