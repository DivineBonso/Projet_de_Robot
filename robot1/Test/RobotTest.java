

import org.junit.Test;

import junit.framework.TestCase;

public class RobotTest extends TestCase{
    
    @Test
    //test de la methode qui permet recuperer le nom d un robot
    public void testGetNom_robot() throws Exception{
        Robot R1 =  new Robot("divine");
        String result = R1.getNom_robot();
        assertEquals("divine", result);
    }


    @Test
    // test de la methode qui recupere le nombre de points de vie
    public void testGetPointVie() throws Exception{
        Robot R1 =  new Robot("divine");
        int result = R1.getPointVie();
        assertEquals(10, result);
    }


    @Test
    // test de la methode qui decris un robot
    public void testDescribe()throws Exception{
        Robot R1= new Robot("divine");
        int result = R1.Describe();
        assertEquals(1, result);
    }

   @Test
   //test de la methode isDead
   public void testIsDead(){
        Robot R1 = new Robot("divine");
        boolean result = R1.isDead();
        assertEquals(false, result);
   }

   @Test
   //test de la methode de tire fire
   public void testFire(){
        Robot R1 =new Robot("divine");
        Robot R2 = new Robot("grace");
        int result = R1.fire(R2);
        assertEquals(1, result);
   }


}
