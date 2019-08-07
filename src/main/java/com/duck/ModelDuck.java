package com.duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        iflyBehavior = new FlyNoWay();
        iQuackBehavior = new MuteQuack();
    }

    @Override



    void display() {
        System.out.println("Display from ModelDuck");
    }



}
