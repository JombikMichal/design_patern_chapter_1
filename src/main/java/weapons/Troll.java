package weapons;

public class Troll extends  Character{

    public Troll() {
        setiWeaponBehavior(new BowAndArrowBehavior());
    }

    @Override
    public void fight(){
        System.out.println("Im troll and Im fighting with " + getiWeaponBehavior().useWeapon());
    }
}
