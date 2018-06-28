package génétique;

import java.util.ArrayList;

public class Main {
  //  ArrayList<Base>test( ArrayList<Base>l){
    //    return l;
  // }
    public static void main(String[] args) {
	// write your code here
    //test symbolr
       /* ArrayList<Base>l=new ArrayList<>();
       // System.err.println(new Symbol("7"));
       // System.err.println(new Symbol("A"));
        System.err.println(new Base("A").compl());
        System.err.println(new Base("7"));
        System.err.println(new Adn("ACGTGCT"));
        //System.err.println(new Adn("ACGTGUCT").getComplStrand());
        */
        //System.out.println(new Adn("ACGTGCT").transcription());
        System.out.println("codon:");
        for(AcideAmine codonEquivalent: (new Adn("ACGTGCT").transcription()).translate()){

            System.out.print(codonEquivalent+" ");

        }
    }
}
