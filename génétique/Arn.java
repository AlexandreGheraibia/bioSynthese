package génétique;

import java.util.ArrayList;

//principe
//https://www.youtube.com/watch?v=7-hLLR3Y4bI
public class Arn {
    private ArrayList<Base> strand;
    public Arn(ArrayList<Base> strand){
        this.strand=strand;
    }
    //todo
    // renvoie quoi?
    //une liste d'acide aminé ou une liste de proteines
    //tout les trois nucléotide détermine l'acide aminé
    //produit par le ribosome
    //chercher marqueur de fin
    public ArrayList<AcideAmine> translate(){

        ArrayList<AcideAmine>proteine=new ArrayList<AcideAmine>();
        //combien de groupe de 3 sont contenus dans le brin
        int nbGroup=strand.size()/3;
        for(int i=0;i<nbGroup;i++){
            ArrayList<Base>codons=new ArrayList<Base>();

            for(int j=0;j<3;j++){
                codons.add(strand.get(i*3+j));//les cases sont de la forme 3i+reste de 3
            }                                 //autre soluce faire courir i sur 0..n avec un pas de 3
                                              // La limite de i est part(i/3)*3
                                              //soit le nombre de groupe multiplier par le nombre d'élément d'un groupe
            //                                //=nombre d'element total à parcourir
                                              // et  j sur [i%3 à 2] position relative de l'element i dans un groupe de 3

            //l'acidde amine ne se génére pas lui même
            proteine.add(generateAcideAmine(codons));

        }

        return proteine;
    }
    private AcideAmine generateAcideAmine(ArrayList<Base>codons){
        String aEval="";
        for(Base nucl:codons){
            aEval+=nucl;
        }
        return new AcideAmine(aEval);
    }




    public ArrayList<Base> getStrand() {
        return strand;
    }

    public String toString(){
        return strand.toString();
    }


}
