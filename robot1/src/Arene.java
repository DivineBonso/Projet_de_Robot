public class Arene {
    private Robot foo;
    private Robot bar;

    public Arene (Robot foo, Robot bar){
          this.foo= foo;
          this.bar=bar;
          fight();
    }

    public String fight() {
        while(!foo.isDead() && !bar.isDead()){
            foo.fire(bar);
            boolean Val1 = foo.isDead();
            boolean Val2 = bar.isDead();
            if (Val2 == false) {
                bar.fire(foo);
             } 
        }
       if (foo.isDead()) {
        System.out.println("le robot "+bar.getNom_robot()+" est vainquer");
       }
        else{
            System.out.println("le robot "+foo.getNom_robot()+" est vainquer");
        }
        return "le combat s'est bien terminé";

    }
}
