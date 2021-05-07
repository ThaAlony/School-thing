/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddant
 */
public abstract class Persona {
    public final static int ANNOATTUALE=2011;
    protected int codice;
    protected String cognome;
    protected String nome;
    protected int annoInizio;
    
    // COSTRUTTORE
    public Persona(int codice,String cognome,String nome, int annoInizio){
        this.codice=codice;
        this.cognome=cognome;
        this.nome=nome;
        this.annoInizio=annoInizio;
    }

    ///////////////////
    //GETTER E SETTER//
    ///////////////////
    public int getAnnoInizio() {
        return annoInizio;
    }

    public int getCodice() {
        return codice;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnnoInizio(int annoInizio) {
        this.annoInizio = annoInizio;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // metodi astratti da implementare nelle sottoclassi
    public abstract Persona clone();
    public abstract float getCostoC();
    

}