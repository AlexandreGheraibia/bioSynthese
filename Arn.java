package génétique;

import java.util.ArrayList;
//principe
//https://www.youtube.com/watch?v=7-hLLR3Y4bI
public class Arn {
    private ArrayList<Base> brin;
    public Arn(ArrayList<Base> brin){
        this.brin=brin;
    }
    //todo
    // renvoie quoi?
    //une liste d'acide aminé ou une liste de proteines
    //tout les trois nucléotide détermine l'acide aminé
    //produit par le ribosome
    //chercher marqueur de fin
    /*public  ListeProteine transcription(ArrayList<Base>brin){
        return null;
    }*/

    public ArrayList<Base> getBrin() {
        return brin;
    }

    public String toString(){
        return""+getBrin();
    }
}
