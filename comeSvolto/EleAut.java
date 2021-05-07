/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddant
 */
public class EleAut extends Tecnici {
    private static int costo=50;
    private int oreLavorate;
    private String intest;

    // COSTRUTTORE
    public EleAut(int codice, String cognome, String nome, int annoInizio, int oreLavorate, String intest){
        super(codice, cognome, nome, annoInizio);
        this.oreLavorate=oreLavorate;
        this.intest=intest;
    }


    // GETTER
    public float getCostoC(){
        int anni;
        float risultato;
        anni=Persona.ANNOATTUALE-annoInizio;
        if(intest.equalsIgnoreCase("interno"))
            risultato=(costo*oreLavorate)+anni;
        else
            risultato=costo*oreLavorate;
        return risultato;
    }
    
    // METODO CLONE
    public EleAut clone(){
        EleAut p=new EleAut(this.codice, this.cognome, this.nome, this.annoInizio, this.oreLavorate,this.intest );
        return p;
    }
}