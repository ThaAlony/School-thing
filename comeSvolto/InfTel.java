/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddant
 */
public class InfTel extends Tecnici {
    private static int costo=40;
    private String intest;
    private int oreLavorate;
    
    // COSTRUTTORE
    public InfTel(int codice, String cognome, String nome, int annoInizio, int oreLavorate, String intest ){

        super(codice,cognome,nome,annoInizio);
        this.intest=intest;
        this.oreLavorate=oreLavorate;
    }
    
    
    ///////////////////
    //GETTER E SETTER//
    ///////////////////    
    public float getCostoC(){
        int anni;
        float risultato;
        anni=Persona.ANNOATTUALE-this.annoInizio;
        if( intest.equalsIgnoreCase("interno"))
            risultato=(costo*oreLavorate)+anni;
        else
            risultato=costo*oreLavorate;
        return risultato;
    }
     
    public void setIntest(String intest) {
        this.intest = intest;
    }

    public String getIntest() {
        return intest;
    }

    // METODO CLONE
     public InfTel clone(){
      InfTel p=new InfTel(this.codice, this.cognome, this.nome, this.annoInizio, this.oreLavorate,this.intest );
      return p;
    }

}