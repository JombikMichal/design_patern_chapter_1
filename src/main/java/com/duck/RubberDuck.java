package com.duck;

public class RubberDuck extends Duck {
    //zrusili sme implementaciu rozhrania IQuackable lebo ich nepotrebujeme kvoli tomu ze metody mame implementovane inde a toto riesenie nie je prilis stastne


    //vytvorime si bezparametricky konstruktor kde inicializujeme premenne objektu (iQuackBehavior a iFlyBehavior) novymi objektami
    //vieme ze tato triedka teda kacka nekvaka ale piska  a nelieta
    public RubberDuck() {
        iQuackBehavior = new Squeak();
        iflyBehavior = new FlyNoWay();
    }

    // povinna implementacia z rodicovskej triedy!
    @Override
    public void display(){
        System.out.println("RubberDuck: display");
    }

    //tato trieda neimplementuje rozhranie IFlyable a teda kedze sme tuto metody fly() odstranili z rodicovskej abstraktnej triedy tak ju nema preco overridovat
//    @Override
//    public void fly(){
//        System.out.println("RubberDuck: fly - but this Duck(RubberDuck) can not fly!");
//    }

    // logicky overriding lebo gumena kacka piska a nekvaka
//    @Override
//    public void quack(){
//        System.out.println("Duck: squeak");
//    }
}
