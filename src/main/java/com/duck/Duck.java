package com.duck;

public abstract class Duck {

    //nasa triedka obsahuje teraz rozhrania ku ktorym nema nikto pristup len ona sama - podme si teda implementovat metody ktore nasledne budu implementovane v zdedenych triedach
    //POZOR!!! - tieto premenne nemusi byt private alebo musia mat settere
    //PRECO? lebo ich inicializujem priamo z potomkov, ktori musia mat k nim pristup
    // OTAZKA? je lepsie aby boli private alebo protected alebo lepsie je spravit k nim settere a tym by som rozsiril konstruktory v jednotlivych triedach ktore od tejto dedia?
    // momentalne tieto premenne instancie su dostupne v aktualnom package
     IFlyBehavior iflyBehavior;
     IQuackBehavior iQuackBehavior;

     //dalej bolo pisane ze by bolo dobre spravit settery :)

    public void setIflyBehavior(IFlyBehavior iflyBehavior) {
        this.iflyBehavior = iflyBehavior;
    }

    public void setiQuackBehavior(IQuackBehavior iQuackBehavior) {
        this.iQuackBehavior = iQuackBehavior;
    }


    //ked mame v triede jednu abstraktnu metodu tak trieda musi byt abstraktna!

    //metodu sme odstranili lebo nechceme aby bola v kazdej triede ktora dedi implementovana ale len tam kde to ma logicky zmysel
//    public void quack(){
//        System.out.println("Duck: quack");
//    }

    public void swim(){
        System.out.println("Duck: swim");
    }


    // tato metoda je abstraktna - chcem aby bola implementovana vo vsekych potomkoch
    // tato metoda najskor mala telo - avsak abstraktne metody obsahuju len typ, nazov a parametre!
        /*abstract void display(){
            System.out.println("Duck: display");
        }*/
    abstract void display();

    //projekt sa rozsiril a je nutne pre kazdu triedu co dedi z triedy Duck implementovat metodu fly()
    //metodu sme odstranili lebo nechceme aby bola v kazdej triede ktora dedi implementovana ale len tam kde to ma logicky zmysel
    //abstract void fly();


    // teraz mame implementovane dve metody ktore volaju funckiu na prislusnom rozhrani
    //this sa odkazdu na konkretny tento objekt a nie je ho dolezite teraz pisat ale napisal som ho pre prehladnost
    public void performQuack(){
        this.iQuackBehavior.quack();
    };

    public void performFly(){
        this.iflyBehavior.fly();
    };


}
