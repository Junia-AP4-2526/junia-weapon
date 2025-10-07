package com.jad;

import com.jad.weapon.*;
import com.jad.weapon.decorator.Blessed;
import com.jad.weapon.decorator.Cursed;
import com.jad.weapon.decorator.GodsBlessed;

public class Main {
    public static void main(String[] args) {
        IWeapon sword = new Blessed(new LongSword());
        IWeapon hammer = new Blessed( new Cursed(new Hammer()));
        IWeapon axe = new Cursed (new Cursed(new Axe()));
        IWeapon tank = new Cursed(new GodsBlessed(new Tank()));
        System.out.println(sword.hit());
        System.out.println(hammer.hit());
        System.out.println(axe.hit());
        System.out.println(tank.hit());
    }

}