package Characters;

import Interfaces.IWeapon;

import java.util.ArrayList;

public class Knight extends Hero {

    private ArrayList<IWeapon> inventory;

    public Knight(String name, int health) {
        super(name, health);
        this.inventory = new ArrayList<>();
    }

    public ArrayList<IWeapon> getInventory() {
        return inventory;
    }

    public int countInvetnory(){
        return inventory.size();
    }
}
