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
    private int costo;
    
    //80 ora 
    public Senior(int costo, int annoInizio, int oreLavorate, String nome, String cognome, int anno) {
        super(annoInizio, oreLavorate, nome, cognome, anno);
        this.costo = costo;
    }

    public int getCostoC() {
        return costo;
    }
    
    @Override
    public Persona clone() {
        return null;
    }
    
    
}
