/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddant
 */
public class Senior extends Funzionari{
    private int oreLavorativa;
    private int costo;

    public Senior(int oreLavorativa, int costo, int codice, int annoInizio, int oreLavorate, String nome, String cognome, int anno) {
        super(codice, annoInizio, oreLavorate, nome, cognome, anno);
        this.oreLavorativa = oreLavorativa;
        this.costo = costo;
    }

    /*public int getCosto() {
        return costo;
    }*/
    
    @Override
    public Persona clone() {
        return null;
    }
    
    
}
