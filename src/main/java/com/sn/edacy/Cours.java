/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sn.edacy;

/**
 *
 * @author ZEN
 */
public class Cours {
    private int idCours;
    private String NomDuCours;
    private int Nbheure;
     
    public Cours(){
        
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public void setNomDuCours(String NomDuCours) {
        this.NomDuCours = NomDuCours;
    }

    public void setNbheure(int Nbheure) {
        this.Nbheure = Nbheure;
    }

    public int getIdCours() {
        return idCours;
    }

    public String getNomDuCours() {
        return NomDuCours;
    }

    public int getNbheure() {
        return Nbheure;
    }
    
    
}
