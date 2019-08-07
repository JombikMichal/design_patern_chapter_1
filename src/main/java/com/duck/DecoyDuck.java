package com.duck;

public class DecoyDuck extends Duck {

    //vytvorime si bezparametricky konstruktor kde inicializujeme premenne objektu (iQuackBehavior a iFlyBehavior) novymi objektami
    //vieme ze tato triedka teda kacka nerobi nic
    public DecoyDuck() {
        iQuackBehavior = new MuteQuack();
        iflyBehavior = new FlyNoWay();
    }

    // povinna implementacia z rodicovskej triedy!
    @Override
    public void display(){
        System.out.println("DecoyDuck: display");
    }

    //tato trieda neimplementuje rozhranie IFlyable ani IQuackable a teda kedze sme tuto metody fly() odstranili z rodicovskej abstraktnej triedy tak ju nema preco overridovat
//    @Override
//    public void fly(){
//        System.out.println("DecoyDuck: fly - but this Duck(DecoyDuck) can not fly!");
//    }

    // vabnicka ale nekvaka ani nepiska
    //tato trieda neimplementuje rozhranie IFlyable ani IQuackable a teda kedze sme tuto metody fly() odstranili z rodicovskej abstraktnej triedy tak ju nema preco overridovat
//    @Override
//    public void quack(){
//        System.out.println("Duck: quack - but thic Duck(DecoyDuck) cant not quacking!");
//    }
}
