class Archer extends GameCharacter {
    private int arrows;

    public Archer(String name, int health, int arrows) {
        super(name, health);
        this.arrows = arrows;
    }

    // Overskriver action metoden for Archer specifik adfærd
    @Override
    public void action() {
        System.out.println(getName() + " skyder en pil mod fjenden!");
    }

    // Getter for arrows
    public int getArrows() {
        return arrows;
    }

    // Setter for arrows
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}
