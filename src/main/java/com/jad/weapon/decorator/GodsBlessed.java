package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public class GodsBlessed extends AbstractDecorator{
    public GodsBlessed(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    protected int decoratedGetDamages() {
        return this.weapon.getDamages()*2 - this.weapon.getDamages();
    }

    @Override
    protected String decoratedGetName() {
        return "Béni des dieux";
    }
}
