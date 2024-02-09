public class Robot {
    private String Nom_robot;
    private int PointVie;

    public Robot(String Nom_robot) {
       this.Nom_robot= Nom_robot;
       PointVie=10;
    }

   public void setNom_robot( String Nom_robot){
       this.Nom_robot= Nom_robot;
   }

   public void setPointVie(int N){
       PointVie=N;
   }

   public String getNom_robot (){
       return Nom_robot;
   }

   public int getPointVie() {
       return PointVie;
   }

    public int Describe(){
     System.out.println("Robot" +" "+ this.getNom_robot() );
     return 1;
   }

   public boolean isDead(){
      if (PointVie ==0) {
       return true;
      } else{
       return false;
      }
   }

   public int fire(Robot bob){
       boolean Val1 = bob.isDead();
       boolean Val2 = this.isDead();
           int N = bob.getPointVie()-2;
           bob.setPointVie(N);
    System.out.println(bob.Nom_robot +" " +"a tire sur" + " " + this.Nom_robot);
        return 1;
   }
}
