/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddant
 */
public class Senior extends Funzionari {
    private static int costo=80;
    private int oreLavorate;

    // COSTRUTTORE
    public Senior(int codice, String cognome, String nome, int annoInizio, int oreLavorate){
        super(codice,cognome,nome,annoInizio);
        this.oreLavorate=oreLavorate;
    }
    
    // METODO CLONE
    public Senior clone(){
       Senior p=new Senior(this.codice, this.cognome, this.nome, this.annoInizio, this.oreLavorate);
        return p;
    }
    
    // GETTER
    public float getCostoC(){
        return costo*oreLavorate;
    }

}