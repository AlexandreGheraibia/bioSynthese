package génétique;

public enum Base {

    A("adénine"),C("cytosine"),G("guamine"),T("thymine"),U("uracile");
    private String symbolName;
    //Constructeur
    Base(String symbolName){

        this.symbolName = symbolName;

    }
    public Base compl(){
        Base select=C;
        switch(this){
            case A:
                select= T;
                break;
            case T:
                select= A;
            break;
            case C:
                select= G;
            break;

        }
        return select;
    }
    public boolean isAdenine(){
        return this==A;
    }
    public boolean isCytosine(){
        return this==C;
    }
    public boolean isGuamine(){
        return this==G;
    }
    public boolean isThymine(){
        return this==T;
    }
    public boolean isUracile(){
        return this==U;
    }

    public String toString(){

        return symbolName;

    }
}
