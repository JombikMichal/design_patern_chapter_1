package weapons;

public class King extends Character{
    public King() {
        setiWeaponBehavior(new KnifeBehavior());
    }

    @Override
    public void fight(){
        System.out.println("Im king and Im fighting with " + getiWeaponBehavior().useWeapon());
    }
}
