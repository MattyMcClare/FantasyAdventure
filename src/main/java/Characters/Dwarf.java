package Characters;

import Interfaces.IWeapon;

import java.util.ArrayList;

public class Dwarf extends Hero {

    private ArrayList<IWeapon> inventory;

    public Dwarf(String name, int health) {
        super(name, health);
        this.inventory = new ArrayList<>();
    }

    public ArrayList<IWeapon> getInventory(){
        return inventory;
    }

    public int countIWeapon(){
        return inventory.size();
    }

    public
}
