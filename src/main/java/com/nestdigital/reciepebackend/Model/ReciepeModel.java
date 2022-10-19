package com.nestdigital.reciepebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reciepe")
public class ReciepeModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String flavour;
    private String colour;

    public ReciepeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public ReciepeModel(int id, String name, String description, String flavour, String colour) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.flavour = flavour;
        this.colour = colour;
    }
}
