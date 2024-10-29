class Wizard extends GameCharacter {
    private int mana;

    public Wizard(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    // Overskriver action metoden for Wizard specifik adfærd
    @Override
    public void action() {
        System.out.println(getName() + " kaster en magisk besværgelse!");
    }

    // Getter for mana
    public int getMana() {
        return mana;
    }

    // Setter for mana
    public void setMana(int mana) {
        this.mana = mana;
    }
}
