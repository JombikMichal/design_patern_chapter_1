package com.fighters;

public abstract class Character {

    private IWeaponBehavior iWeaponBehavior;

    public void setiWeaponBehavior(IWeaponBehavior iWeaponBehavior) {
        this.iWeaponBehavior = iWeaponBehavior;
    }

    public IWeaponBehavior getiWeaponBehavior() {
        return iWeaponBehavior;
    }

    public abstract void fight();
}
