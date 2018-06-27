package génétique;

import java.util.ArrayList;

public class Main {
    ArrayList<Base>test( ArrayList<Base>l){
        return l;
    }
    public static void main(String[] args) {
	// write your code here
    //test Base
        ArrayList<Base>l=new ArrayList<>();

        for(Base elem:Base.values())
        {
            switch(elem)
            {
                case A:
                    break;
                case T:
                    break;
                case C:
                    break;
                case G:
                    break;
            }
        }

    }
}
