package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.types.Bebida;

public class FleebJuiceTest {
    

    static FleebJuice fleebJuice;

    @BeforeClass public static void onlyOnce(){

        fleebJuice = new FleebJuice();

    }

    @Test public void constructorTest(){

        assertNotNull(fleebJuice);
        assertTrue( fleebJuice instanceof Bebida);
    }

    @Test public void nombreTest(){

        assertEquals("Fleeb Juice", fleebJuice.nombre());

    }

    @Test public void pvpTest(){

        assertEquals( 35.0, fleebJuice.pvp(), 0);
    }

    @Test public void empaquetadoTest(){

        assertEquals("Tubo", fleebJuice.empaquetado().envoltorio());
    }


    @Test public void toStringTest(){

        assertEquals("Item: Fleeb Juice, Empaquetado: Tubo, Precio: 35.0", fleebJuice.toString());
    }

}
