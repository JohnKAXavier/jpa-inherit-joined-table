package com.john.jpainheritjoinedtable.model;

import javax.persistence.Entity;

@Entity
public class Knight extends Infantry{
    private boolean shield;

    public Knight() {
    }

    public Knight(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, boolean shield) {
        super(type, moveSpeed, durability, attack);
        this.shield = shield;
    }
}
