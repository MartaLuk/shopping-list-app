package com.MartaLuk.shoppinglistapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter
@Setter
class Item {
    @Id
    private int id;
    private String name;
    private boolean check;
}
