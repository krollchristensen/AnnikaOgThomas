// Superklasse, der repræsenterer en generel spilkarakter
class GameCharacter {
    private String name;
    private int health;

    // Konstruktør, der initialiserer navn og helbred
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Standard handling som kan overskrives i underklasser
    public void action() {
        System.out.println(name + " står klar til at kæmpe!");
    }

    // Final metode, der viser karakterens info
    public final void showInfo() {
        System.out.println("Navn: " + name + ", Helbred: " + health);
    }
}