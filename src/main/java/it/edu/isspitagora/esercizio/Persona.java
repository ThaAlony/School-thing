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
    
    static int codici;
    private int codice;
    private String cognome;
    private String nome;
    private int anno;
    private final int ANNOATTUALE = 2021;
    
    public Persona(String nome, String cognome, int anno) {
        this.codici++;
        this.codice = this.codici;
        this.anno = anno;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    public double getCosto() {
        return 0;
    }
    
    @Override
    public Persona clone() {
        return null;
    }
    
}