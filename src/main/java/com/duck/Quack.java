package com.duck;

public class Quack implements IQuackBehavior{
    @Override
    public void quack(){
        System.out.println("Quack: quack - implements interface IQuackBehavior and extends ... and again");
    }
}
