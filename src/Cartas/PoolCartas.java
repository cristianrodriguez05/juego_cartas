package Cartas;

import java.util.ArrayList;

public class PoolCartas {

    private static PoolCartas mInstance;
    private ArrayList<Carta> Mazo = null;

    public static PoolCartas getInstance() {
        if (mInstance == null) {
            mInstance = new PoolCartas();
        }

        return mInstance;
    }

    private PoolCartas() {
     
        
            Mazo = new ArrayList<Carta>();
        
    }

    public ArrayList<Carta> getArray() {
        return this.Mazo;
    }

    public void addToArray(Carta value) {
            int i=0;
            for (i = 0; i < Mazo.size(); i++) {
               
            }
        
        Mazo.add(i,value);
    }
    public void vaciar(){
    Mazo.clear();
    
    }

}
