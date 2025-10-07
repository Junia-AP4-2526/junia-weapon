package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public class Blessed extends AbstractDecorator{
    public Blessed(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    protected int decoratedGetDamages() {
        return 15;
    }

    @Override
    protected String decoratedGetName() {
        return "Béni";
    }
}
