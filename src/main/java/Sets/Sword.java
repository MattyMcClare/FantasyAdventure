package Sets;


import Interfaces.IWeapon;

public class Sword implements IWeapon {
    private int damage;
    private IWeapon weapon;
    private String name;

    public Sword(int damage, IWeapon weapon) {
        this.damage = damage;
        this.weapon = weapon;
    }

    public IWeapon getDamage(){
        return this.weapon;
    }

    public String getName(){
        return this.name;
    }

}
