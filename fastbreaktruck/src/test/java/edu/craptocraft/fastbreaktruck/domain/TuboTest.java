package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.behaviour.Packing;

public class TuboTest {
    

    static Tubo tubo;
    
    @BeforeClass public static void onlyOnce(){

        tubo = new Tubo();

    }

    @Test public void constructorTest(){

        assertNotNull(tubo);
        assertTrue(tubo instanceof Packing);
    }


    @Test public void envoltorioTest(){

        assertEquals("Tubo", tubo.envoltorio());

    }

}
