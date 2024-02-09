// importation des package de la classe random
import java.util.Random;
import java.util.random.*;


// definition de la classe Fighter qui extends de la classe Robot 

public class Fighter extends Robot {


    //constructeur de la classe Fighter
    public Fighter( String nom_H){
     super(nom_H);
   }


    // definition de la methode qui affiche le nom de l'humain
    public  String Afficher(){
    System.out.println("Fighter"+" "+ this.getNom_robot());
    return "hey robot";
  } 


    // definition de la methode fire
    public String fire(Fighter Humain){
    Random random = new Random();
    boolean Val1 = random.nextBoolean();
    if (Val1 ==true) {
        int N = Humain.getPointVie()-2;
        Humain.setPointVie(N);
        System.out.println("Le combattant "+" "+ this.getNom_robot() + " " + "touché sa cible qui est le combatant" + " " + Humain.getNom_robot());
    }else{
        System.out.println("Le combatant" + " " + this.getNom_robot() + " " + " a raté sa cible");
    }
    return "le combat a bien eu lieu";
  }
}