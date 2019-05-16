package Characters;

import Interfaces.IWeapon;

public class Dwarf extends Hero {

    private IWeapon weapon;

    public Dwarf(String name, int health, IWeapon weapon) {
        super(name, health);
    }

    public IWeapon getDamage(){
        return weapon;
    }
}
