package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;



public class CajaTest {
    

    static Caja caja;

    @BeforeClass public static void onlyOnce(){

        caja = new Caja();
    
    }

    @Test public void constructorTest(){

        assertNotNull(caja);
    }

    @Test public void envoltorioString(){

        assertEquals("Caja", caja.envoltorio());

    }
}
