package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.types.Juguete;

public class PlumbusTest {
    
    static Plumbus plumbus;

    @BeforeClass public static void onlyOnce(){

        plumbus = new Plumbus();

    }

    @Test public void constructorTest(){

        assertNotNull(plumbus);
        assertTrue( plumbus instanceof Juguete);

    }


    @Test public void nombreTest(){

        assertEquals("Plumbus", plumbus.nombre());

    }

    @Test public void pvpTest(){

        assertEquals( 100.0, plumbus.pvp(), 0);
    }

    @Test public void empaquetadoTest(){

        assertEquals("Caja", plumbus.empaquetado().envoltorio());
    }


    @Test public void toStringTest(){

        assertEquals("Item: Plumbus, Empaquetado: Caja, Precio: 100.0", plumbus.toString());
    }

}
