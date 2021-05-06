/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddant
 */
public class Tecnici extends Persona{
    private int codice;
    private int annoInizio;
    private int oreLavorate;



    public Tecnici(int codice, int annoInizio, int oreLavorate, String nome, String cognome, int anno) {
        super(nome, cognome, anno);
        this.codice = codice;
        this.annoInizio = annoInizio;
        this.oreLavorate = oreLavorate;
    }
    

    
    
}
