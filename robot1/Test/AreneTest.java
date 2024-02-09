import org.junit.Test;

import junit.framework.TestCase;

public class AreneTest extends TestCase{

    @Test
    // test de la methode fight
    public void testFight(){
        Robot R1 = new Robot("grace");
        Robot R2 =new Robot("divine");

        Arene Arene1 = new Arene(R1,R2);
        String result = Arene1.fight();
        assertEquals("le combat s'est bien terminé", result);
    }
}
