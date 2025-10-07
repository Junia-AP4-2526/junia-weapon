package com.jad.weapon;

public class AbstractWeapon implements IWeapon {
    public String getName() {
        return this.name;
    }

    private final String name;


    public AbstractWeapon(final String name) {
        this.name = name;
    }
}
