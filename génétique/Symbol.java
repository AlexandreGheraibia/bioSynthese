package génétique;

public class Symbol {
    private String symbol;
    Symbol(String symbol){
        if(symbol.equals("A")||symbol.equals("U")||symbol.equals("T")||symbol.equals("C")||symbol.equals("G")){
            this.symbol=symbol;
        }else{
            System.err.println("the symbol "+symbol+" wasn't in the following list A,T,C,G,U");
        }

    }
    public String toString(){
        return symbol;
    }
}
