package génétique;

public class Base {

    private String name;
    private Symbol symbol;
    private String family;
    //Constructeur
    Base(String symbol){
        initBaseElement(symbol);
    }
    private void initBaseElement(String symbol){
        this.symbol=new Symbol(symbol);
        switch(symbol){

            case "A":
                this.name="adénine";
                this.family="purine";

                break;
            case "T":
                this.name="thymine";
                this.family="pyrimidines";
                break;
            case "U":
                this.name="uracile";
                this.family="pyrimidines";
                break;
            case "G":
                this.name="adénine";
                this.family="purine";
                break;
            case "C":
                name="cytosine";
                family="pyrimidines";
                break;
            default:
            break;
        }

    }
    public Base compl(){
        Base select=new Base("C");
        switch(this.symbol.toString()){
            case "A":
                select= new Base("T");;
                break;
            case "T":
                select= new Base("A");;
            break;
            case "C":
                select= new Base("G");;
            break;

        }
        return select;
    }
    public boolean isAdenine(){
        return this.symbol.toString().equals("A");
    }
    public boolean isCytosine(){
        return this.symbol.toString().equals("C");
    }
    public boolean isGuamine(){
        return this.symbol.toString().equals("G");
    }
    public boolean isThymine(){
        return this.symbol.toString().equals("T");
    }
    public boolean isUracile(){
        return this.symbol.toString().equals("U");
    }

    public String toString(){

        return /*name+" "+*/""+this.symbol/*+" "+family*/;

    }

}
