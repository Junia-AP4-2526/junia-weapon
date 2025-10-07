package com.jad;

import com.jad.weapon.Hammer;
import com.jad.weapon.IWeapon;
import com.jad.weapon.LongSword;

public class Main {
    public static void main(String[] args) {
        IWeapon sword = new LongSword();
        IWeapon hammer = new Hammer();
    }
}