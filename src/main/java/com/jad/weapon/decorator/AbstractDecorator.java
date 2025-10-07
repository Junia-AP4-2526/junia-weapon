package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

abstract class AbstractDecorator implements IWeapon {
    protected final IWeapon weapon;

    AbstractDecorator(final IWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getName() {
        return this.weapon.getName() + " " + this.decoratedGetName();
    }

    @Override
    public String hit() {
        return this.getName() + ": " + this.getDamages();
    }

    @Override
    public int getDamages() {
        return this.weapon.getDamages() + this.decoratedGetDamages();
    }

    protected abstract int decoratedGetDamages();

    protected abstract String decoratedGetName();
}
