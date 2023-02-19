package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.types.Cereales;

public class SmigglesTest {
    
    static Smiggles smiggle;

    @BeforeClass public static void onlyOnce(){

        smiggle = new Smiggles();
    }

    @Test public void constructorTest(){

        assertNotNull(smiggle);
        assertTrue(smiggle instanceof Cereales);
    }

    @Test public void nombreTest(){

        assertEquals("Smiggles", smiggle.nombre());

    }

    @Test public void pvpTest(){

        assertEquals(50.0, smiggle.pvp(), 0);
    }

}
