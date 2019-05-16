package Sets;

public enum SpellType {
    FIREBALL(5),
    LIGHTINING(10),
    STRIKE(6);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}
