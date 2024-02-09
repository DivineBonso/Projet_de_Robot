

import org.junit.Test;

import junit.framework.TestCase;

public class testFighter extends TestCase{

    @Test
    // test de la methode Afficher
    public void testAfficcher() throws Exception{
        Robot R1 = new Robot("divine");
        Fighter Fighter1 = new Fighter ("divine");
        String result = Fighter1.Afficher();
        assertEquals("hey robot", result);
    } 

    @Test 
    //test de la methode fire
    public void testFire(){
        Robot R1 = new Robot("divine");
        Fighter Fighter1 = new Fighter ("divine");
        Fighter Fighter2 = new Fighter ("grace");

        String result = Fighter1.fire(Fighter2);
        assertEquals("le combat a bien eu lieu", result);
    }

}
