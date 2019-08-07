package com.fighters;

public class Queen extends Character {

    public Queen() {
        setiWeaponBehavior(new AxeBehavior());
    }

    @Override
    public void fight(){
        System.out.println("Im queen and Im fighting with " + getiWeaponBehavior().useWeapon());
    }
}
