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

    public String toString(){

        return symbolName;

    }
}
