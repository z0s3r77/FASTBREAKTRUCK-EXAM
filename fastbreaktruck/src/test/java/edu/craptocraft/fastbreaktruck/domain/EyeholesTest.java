package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.types.Cereales;

public class EyeholesTest {
    
    static Eyeholes eyehole;

    @BeforeClass public static void onlyOnce(){

        eyehole = new Eyeholes();

    }

   
    @Test public void constructorTest(){

        assertNotNull(eyehole);
        assertTrue(eyehole instanceof Cereales);
    }

    @Test public void nombreTest(){

        assertEquals("Eyeholes", eyehole.nombre());

    }

    @Test public void pvpTest(){

        assertEquals(25.0, eyehole.pvp(), 0);
    }
}
