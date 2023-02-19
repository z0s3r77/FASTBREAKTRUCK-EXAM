package edu.craptocraft.fastbreaktruck.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.types.Bebida;

public class TurbulentJuiceTest {
    

    static TurbulentJuice turbulentJuice;


    @BeforeClass public static void onlyOnce(){

        turbulentJuice = new TurbulentJuice();

    }

    @Test public void constructorTest(){

        assertNotNull(turbulentJuice);
        assertTrue( turbulentJuice instanceof Bebida);
    }

    @Test public void nombreTest(){

        assertEquals("Turbulent juuuuuice", turbulentJuice.nombre());

    }

    @Test public void pvpTest(){

        assertEquals( 30.0, turbulentJuice.pvp(), 0);
    }

    @Test public void empaquetadoTest(){

        assertEquals("Tubo", turbulentJuice.empaquetado().envoltorio());
    }


    @Test public void toStringTest(){

        assertEquals("Item: Turbulent juuuuuice, Empaquetado: Tubo, Precio: 30.0", turbulentJuice.toString());
    }


}
