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
@Table(name="commande")
public class Commande implements Serializable {
    @Id
    @GeneratedValue
    private Integer idCommande;
    
   @OneToMany(mappedBy="Article")
    private Collection<Article> articles = new ArrayList<Article>();
   
     @ManyToOne
    private User user;
     
     @ManyToOne
    private Facture facture;

    public Commande() {
    }

    public Commande(Integer idCommande, User user, Facture facture) {
        this.idCommande = idCommande;
        this.user = user;
        this.facture = facture;
    }

    public Facture getFacture() {
        return facture;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public User getUser() {
        return user;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }
     
     
    
    
}
