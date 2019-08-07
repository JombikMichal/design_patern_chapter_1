package com.duck;

public class FlyNoWay implements IFlyBehavior{
    @Override
    public void fly(){
        System.out.println("FlyNoWay: no way to fly - implements interface IFlyBehavior");
    }
}
