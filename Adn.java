package génétique;

import java.util.ArrayList;
import java.util.Arrays;
//principe
//https://www.youtube.com/watch?v=VQJKDgpRcnI
public class Adn {
    private ArrayList<Base>brin=new ArrayList<>();
    private ArrayList<Base>brinComp=new ArrayList<>();

    public Adn(ArrayList<Base>brin){
        //todo
        // if(brin.size()==0){
        // verifier qu'on démarre sur la séquence d'inititation
        // et qu'on une séquence de fin
            this.brin=brin;
            this.complementaryBrin();
        //}
       //
        // else{
            //TODO erreur
       //}
    }
    private void complementaryBrin(){
        //todo
        // maturation
        for(Base elem:brin){
                this.brinComp.add(elem.compl());
            }

    }
    //todo
    // remplacement du sucre desoxribose par l'ribose
    //substution dans le noyau des nucléotides T par des U par l'enzyme arm polymérase
    //soit un arn
    //soit une liste
    public ArrayList<Base> transcription(ArrayList<Base>brin){
        return null;
    }

    public ArrayList<Base> getBrin() {
        return brin;
    }
    /*Sert à rien
    private void setBrin(ArrayList<Base> brin) {
        this.brin = brin;
    }
    */
    public ArrayList<Base> getBrinComp() {
        return brinComp;
    }
    public String toString() {
        return brin.toString()+brinComp.toString();
    }

    /* sert à rien
    public void setBrinComp(ArrayList<Base> brinComp) {
        this.brinComp = brinComp;
    }
    */
}
