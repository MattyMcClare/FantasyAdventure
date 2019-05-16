package Characters;

public abstract class Hero {
    private String name;
    private int health;
    private Object inventory;

    public Hero(String name, int health, Object inventory) {
        this.name = name;
        this.health = health;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Object getInventory() {
        return inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setInventory(Object inventory) {
        this.inventory = inventory;
    }
}
