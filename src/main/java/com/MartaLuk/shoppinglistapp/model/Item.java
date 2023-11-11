package com.MartaLuk.shoppinglistapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
@Getter
@Setter
public class Item {
    @Id
    private int id;
    private String name;
    private boolean check;
}
