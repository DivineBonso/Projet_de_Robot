public class App {
    public static void main(String[] args) throws Exception {
        Robot R1=new Robot("D2R2");
        Robot R2=new Robot("Data");
        //execution de la methode describbe de la classe robot
        R1.Describe();
        R2.Describe();


        // execution de la methode fire de la classe Robot
        R1.fire(R2);


        //execution de la methode fight de la classe Arene
       Arene A1 = new Arene(R1, R2);
       A1.fight();


        //execution de la mthode fire de la classe fighter
        Fighter combat1 = new Fighter("Bonso");
        Fighter combat2 = new Fighter("divine");
        combat1.fire(combat2);
        
    }
    
}
