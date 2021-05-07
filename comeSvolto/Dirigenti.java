/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddant
 */
public class Dirigenti extends Persona{
    private static int costo=100;
    private int oreLavorate;
    
    // COSTRUTTORE
    public Dirigenti(int codice, String cognome, String nome, int annoInizio,int oreLavorate){
        super(codice,cognome,nome,annoInizio);
        this.oreLavorate=oreLavorate;
    }

    ///////////////////
    //GETTER E SETTER//
    ///////////////////
    public static int getCosto() {
        return costo;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public static void setCosto(int costo) {
        Dirigenti.costo = costo;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    public float getCostoC(){
        return costo*oreLavorate;
    }
    
    // METODO CLONE
    public Dirigenti clone(){
       Dirigenti p=new Dirigenti(this.codice,this.cognome,this.nome,this.annoInizio,this.oreLavorate);
       return p;
    }
}