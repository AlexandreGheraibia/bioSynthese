package génétique;

import java.util.ArrayList;
import java.util.Arrays;
//principe
//https://www.youtube.com/watch?v=VQJKDgpRcnI
public class Adn {
    private ArrayList<Base>strand=new ArrayList<>();


    public Adn(String strand){
        //todo
         if(strand.length()!=0){
             generateStrand(strand);
         }
         else{
             System.err.println("the adn sequence is void ");
         }


    }
    private void generateStrand(String strand){
        for(int i=0;i<strand.length();i++){
            String symbol=strand.substring(i,i+1);
            if(!symbol.equals("U")){
                this.strand.add(new Base(""+symbol));
            }
            else{
                System.err.println("wrong and strand arn detected");
            }

        }
    }

    public ArrayList<Base>getComplStrand(){
        //todo
        // maturation
        ArrayList<Base> strandComp=new ArrayList<Base>();
        for(Base elem:strand){
                strandComp.add(elem.compl());
            }
        return strandComp;
    }
    //todo
    // remplacement du sucre desoxribose par l'ribose
    //substution dans le noyau des nucléotides T par des U par l'enzyme arm polymérase
    //soit un arn
    //soit une liste
    public Arn transcription(){
        ArrayList<Base>arnM=new ArrayList<Base>();
        for(Base elem:strand){
            if(elem.isThymine()){
                arnM.add(new Base("U"));
            }
            else{
                arnM.add(elem);
            }
        }
        return new Arn(arnM);
    }

    public ArrayList<Base> getBrin() {
        return strand;
    }

    public String toString() {
        return strand.toString();
    }


}
