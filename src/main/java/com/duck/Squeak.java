package com.duck;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack(){
        System.out.println("Squeak: squeak - implements interface IQuackBehavior");
    }
}
