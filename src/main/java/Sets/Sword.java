package Sets;


import Characters.Hero;
import Interfaces.IWeapon;

public class Sword implements IWeapon{
    private String name;

    public Sword(String name) {
        this.name = name;
    }

    public int getDamage(int damage) {
       return damage;
    }

    public String getName() {
        return name;
    }
}
