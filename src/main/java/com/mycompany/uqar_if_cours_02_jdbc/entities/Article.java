/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uqar_if_cours_02_jdbc.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Fanny
 */
@Entity
@Table(name="article")
public class Article implements Serializable {

    @Id
    @GeneratedValue
    private Integer idArticle;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "quantity")
    private Integer quantity;
    
    @Column(name = "price")
    private Float price;

    public Article() {
    }

    public Article(Integer idArticle, String name, Integer quantity, Float price) {
        this.idArticle = idArticle;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getIdArticle() {
        return idArticle;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    
    
}
