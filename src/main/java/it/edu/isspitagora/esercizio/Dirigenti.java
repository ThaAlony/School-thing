/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.edu.isspitagora.esercizio;

/**
 *
 * @author alony
 */
public class Dirigenti extends Persona {
    private int oreLavorate;
    private int costo;
    
    public Dirigenti(String nome, String cognome, int anno, int ore_lavorate) {
        super(nome, cognome, anno);
        this.oreLavorate = ore_lavorate;
        this.costo = 100*ore_lavorate;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = (int) costo;
    }
    
    public Dirigenti clone() {
        return new Dirigenti(super.getNome(), super.getCognome(), super.getAnno(), this.oreLavorate);
    }
    
}
