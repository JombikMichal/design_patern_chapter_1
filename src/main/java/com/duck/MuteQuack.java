package com.duck;

public class MuteQuack implements IQuackBehavior{
    @Override
    public void quack(){
        System.out.println("MuteQuack: mute - implements interface IQuackBehavior");
    }
}
