package edu.craptocraft.fastbreaktruck.behaviour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.fastbreaktruck.domain.Desayuno;

public class FastBreakTruckTest {
    

    static Desayuno eyeDes;
    static Desayuno smigDes;
    static Desayuno eyeDesJuguete;

    @BeforeClass public static void onlyOnce(){

        eyeDes = FastBreakTruck.prepararEyeHoles();
        smigDes = FastBreakTruck.prepararSmiggles();
        eyeDesJuguete = FastBreakTruck.prepararEyeHoles();
        FastBreakTruck.incluirJuguete(eyeDesJuguete);

    }
    

    @Test public void constructorTest(){

        assertNotNull(eyeDes);
        assertNotNull(smigDes);
        assertNotNull(eyeDesJuguete);
    }




    @Test public void getItemTest(){

        assertEquals(2, eyeDes.getItems().size()); 
        assertEquals(2, smigDes.getItems().size()); 
        assertEquals(3, eyeDesJuguete.getItems().size()); 



    }


    @Test public void getCosteTest(){

        assertEquals( 55.0, eyeDes.getCoste(), 0);
        assertEquals( 85.0, smigDes.getCoste(), 0);
        assertEquals( 155.0, eyeDesJuguete.getCoste(), 0);


    }




}
