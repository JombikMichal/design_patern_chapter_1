package com.duck;

public class RedHeadDuck extends Duck{
    //zrusili sme implementaciu rozhrani IFlyable a IQuackable lebo ich nepotrebujeme kvoli tomu ze metody mame implementovane inde a toto riesenie nie je prilis stastne

    // tato classa dedi od super class Duck

    //vytvorime si bezparametricky konstruktor kde inicializujeme premenne objektu (iQuackBehavior a iFlyBehavior) novymi objektami
    //vieme ze tato triedka teda kacka kvaka  a lieta pomocou kridel
    public RedHeadDuck() {
        iQuackBehavior = new Quack();
        iflyBehavior = new FlyWithWings();
    }

    // metoda display() je abstraktna a teda je nutna ju Overridenut v kazdej zdenenej triede!
    @Override
    public void display(){
        System.out.println("RedHeadDuck: display");
    }

    // povina implementacia abstraktnej metody metody fly() z Duck
    // metodu ponechame ale teraz sa neimplementuje lebo ju obsahuje rodicovska abstraktna trieda ale obsahuje ju rozhranie ktore tato trieda implementuje


    /*
    * tieto metody teraz uz nepotrebujeme lebo ich mame uz implementovane pomocou rozhrani iQuackBehavior a iFlyBehavior
    * */

//    @Override
//    public void fly(){
//        System.out.println("RedHeadDuck: fly");
//    }
//    //trieda tiez implementuje rozhranie IQuackable a teda je potrebne vseky metody overridnut ktore obsahuje toto rozhranie
//    @Override
//    public void quack(){
//        System.out.println("RedHeadDuck: quack");
//    }
}
