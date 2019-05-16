package Sets;

public enum HealingType {
    POTION(5),
    HERBS(2),
    INCANTATION(9);

    private final int healing;

    HealingType(int healing){
        this.healing = healing;
    }

    public int getHealing(){
        return healing;
    }

}
