package weapons;

public class Knight extends Character {

    public Knight() {
        setiWeaponBehavior(new SwordBehavior());
    }

    @Override
    public void fight(){
        System.out.println("Im knight and Im fighting with " + getiWeaponBehavior().useWeapon());
    }
}
