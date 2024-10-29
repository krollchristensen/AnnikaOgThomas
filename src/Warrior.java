class Warrior extends GameCharacter {
    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    // Overskriver action metoden for Warrior specifik adfærd
    @Override
    public void action() {
        System.out.println(getName() + " angriber med sit sværd!");
    }

    // Getter for strength
    public int getStrength() {
        return strength;
    }

    // Setter for strength
    public void setStrength(int strength) {
        this.strength = strength;
    }
}
