package Sets;

public enum WeaponType {
    SWORD(4),
    AXE(5),
    CLUB(7);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
