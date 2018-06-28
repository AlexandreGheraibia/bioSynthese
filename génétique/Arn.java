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
        //combien de groupe de 3 contenu dans le brin
        int max=strand.size()/3;
        for(int i=0;i<max;i++){
            ArrayList<Base>codons=new ArrayList<Base>();
            for(int j=0;j<3;j++){
                codons.add(strand.get(i*3+j));
            }
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
