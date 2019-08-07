package com.duck;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly(){
        System.out.println("FlyWithWings: fly on the wings of love - implements interface IFlyBehavior");
    }
}
