/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uqar_if_cours_02_jdbc.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author Fanny
 */
@Entity
public class Facture implements Serializable {

    
    @Id
    @GeneratedValue
    private Integer idFacture;
    
    @OneToMany(mappedBy="Commande")
    private Collection<Commande> commandes = new ArrayList<Commande>();
    
     @Column(name = "total")
    private Float total;

    public Facture() {
    }

    public Facture(Integer idFacture) {
        this.idFacture = idFacture;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public Integer getIdFacture() {
        return idFacture;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
    
    
    
    
}
