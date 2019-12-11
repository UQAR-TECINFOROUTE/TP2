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
@Table(name="User")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Integer idUser;

    @Column(name = "username")
    private String username;
    
    @Column(name = "passeword")
    private String passeword;
    
    @Column(name = "fullname")
    private String fullname;
    
    @Column(name = "type")
    private String type;
    
    @OneToMany(mappedBy="Commande")
    private Collection<Commande> commandes = new ArrayList<Commande>();
    
    @OneToMany(mappedBy="Facture")
    private Collection<Facture> factures = new ArrayList<Facture>();

    public User() {
    }

    public User(Integer idUser, String username, String passeword, String fullname, String type) {
        this.idUser = idUser;
        this.username = username;
        this.passeword = passeword;
        this.fullname = fullname;
        this.type = type;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public String getPasseword() {
        return passeword;
    }

    public void setPasseword(String passeword) {
        this.passeword = passeword;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
      
    
    
}
