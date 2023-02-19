package edu.craptocraft.fastbreaktruck.behaviour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.domain.Desayuno;

public class FastBreakTruckTest {
    

    static Desayuno eyeDes;

    @BeforeClass public static void onlyOnce(){

        eyeDes = FastBreakTruck.prepararEyeHoles();
        

    }

    @Test public void constructorTest(){
        assertNotNull(eyeDes);
    }


    @Test public void getItemTest(){

       assertEquals(2, eyeDes.getItems().size()); 

    }


    @Test public void getCosteTest(){

        assertEquals( 55.0, eyeDes.getCoste(), 0);

    }




}
