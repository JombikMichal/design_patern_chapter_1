import com.duck.*;
import com.fighters.*;
import com.fighters.Character;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // Vytvorime si objekt duck z triedy Duck kde volam funkcie z triedy Duck
        // 1. mame triedy Duck ktora je abstraktna a ma abstraktnu metodu display() ktora musi byt implementovana v triedach ktore z nej dedia
//        Duck duck = new Duck();
//        duck.display();
//        duck.quack();
//        duck.swim();
        // vsetko pekne prebehlo ale zadanie je take ze metoda display() ma nutit programatora ju implementovat do vsetkych zdedenych tried - teda je abstraktna

        //triedu Duck som prepisal ako abstraktnu a je tu problem - Duck duck = new Duck(); - exception - cannot be accessed from outside package
        // co je zaujimave lebo by som cakal skorej vynimku ohladom toho ze chcem vytvorit objekt abstraktnej triedy


        // 2. rozsirenie od abstraktnu metodu fly()
        // otazka: pre mna by bolo vyhodne aby som si vytvoril:
        // napr pole alebo list Ducks ktore su typu duck a inicializoval ich MallarDuck a RedHeadDuck ale to nejde - preco? lebo je trieda abstraktna? cize si musim vzdy vytvorit
        // objekt zdedenej triedy? nemozem si vytvorit instanciu duck a iterovat list kde bude volat vzdy len metodu display() a ta bude volana prislusnou implementaciou zo zdedenej triedy?

        //zatial je stav taky ze kazda trieda ktora dedi - kazda kacka musi vediet (mat implementovanu metodu) display() a fly();
        //prvy problem: mame novu triedu alebo typ kacka a to gumena - ale gumena kacka nelieta! ale my chceme aby kazda kacka mala implementovanu metodu fly() lebo kazda ziva kacka
        // by mala vediet lietat

        //3. mame novu triedu DecoyDuck ktora tiez nelieta, nekvaka ale momentalna implementacia abstraktnej triedy nas nuti aby sme tieto metody abstraktne implementovali aj do
        // tychto zdedenych tried

        //4. ponuka sa nam skvele chrumkave riesenie a to v podobe interface ktore implementujeme tam kde to treba
        // interface - je skupina metod ktore nemaju telo, ale musi ich kazda trieda ktora implementuje toto rozhranie implementovat


        // 5. mame rozhrania a implementujeme ich do tried kde ich loicky potrebujeme
        // v nasej abstraknej triede teraz ostanu metody - swim() a display()

        //chrumkave riesenie - mame abstraktnu triedu Duck ktora ma metody display() a swim() z coho jedna je abstraktna (display()) a teda je overridnuta vo vsetkych triedach ktore dedia!
        // zaroven mame dve rozhraia (IFlyable a IQuackable), ktore sme implementovali tam kde ich logicky potrebujeme

        // toto riesenie nie je najstastnejsie lebo piseme jednak duplicitny kod a jednak pokial by sme mali viac ako 2 classy ktore to implementuju, napr. 100 tak pri zmene logiky tejto
        // metody by som sa asi rozplakal alebo clovek ktory by to po mne robil tak by ma nakopal

        // The one constant in software development: CHANGE!

        // Design principle: Identify the aspect of your application that vary and separate them from what stay the same!!!

        //6. krasne veci napisane - mame nove rozhrania IFlyBehavior a IQuackBehavior, ktore implementuju triedy ktore realne nieco robia s danym behavior: FlyWithWings,FlyNoWay,
        // Quack,Squeak,MuteQuack


        //tieto rozhrania sme implementovali do vsektych tried


        // no uz mi to dovolilo spravit ale jedine cez modifikator public v abstraktnej class - chapem preco - class Main nie je v rovnakom package a teda bez public nema pristup k Duck
        // ale je to rozumne? robi sa to tak?

        Duck mallard = new MallarDuck();
        Duck modelDuck = new ModelDuck();



        // do abstraktnej triedy sme pridali settery co je podla mna velmi pekne lebo mozme spravanie dynamicky menit hocikedy a nie len urcit spravanie pri inicializacii
        //napr MallarDuck moze lietat...ale co ak si zlomi kridlo a zrazu lietat nemoze? setterom jej nastavime novu hodnotu - flexibilne
        // otazka ci su vyhodne settery je nesporna - ano su - ale je to vyhodne priamo v konstruktore ? podla mna ano...lebo sa moze stat ze to potrebujem nejako osetrit v konstruktore
        // a nemusim pisat na viacerych miestach osetrenie

//        mallard.performFly();
//        mallard.performQuack();
//        System.out.println("********************************************");
//        modelDuck.performFly();
//        modelDuck.performQuack();
//        System.out.println("********************************************");
//        modelDuck.setIflyBehavior(new FlyWithWings());
//        modelDuck.setiQuackBehavior(new Squeak());
//        modelDuck.performFly();
//        modelDuck.performQuack();




        

        List<Character> fighters = new ArrayList<>();
        fighters.add(new King());
        fighters.add(new Queen());
        fighters.add(new Troll());
        fighters.add(new Knight());

        for (int i = 0; i < fighters.size(); i++) {
            if(fighters.get(i) instanceof King){
                fighters.get(i).setiWeaponBehavior(new AxeBehavior());
            }
            fighters.get(i).fight();
        }


    }


}
