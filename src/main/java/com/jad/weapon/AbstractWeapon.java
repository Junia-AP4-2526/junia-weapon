package com.jad.weapon;

public class AbstractWeapon implements IWeapon {
    public String getName() {
        return this.name;
    }

    @Override
    public String hit() {
        return this.getName() + " " + this.damages;
    }

    private final String name;

    @Override
    public int getDamages() {
        return this.damages;
    }

    private final int damages;


    public AbstractWeapon(final String name, final int damages) {
        this.name = name;
        this.damages = damages;
    }
}
