import java.util.ArrayList;
/*
Main klassen burte hedde GameManager fordi klassen administrerer oprettelsen
og håndteringen af flere karakterer i spillet.
 */
class Main {
    private ArrayList<GameCharacter> characters;

    public Main() {
        characters = new ArrayList<>();
    }

    // Metode til at tilføje karakterer til ArrayList
    public void addCharacter(GameCharacter character) {
        characters.add(character);
    }

    // Metode til at vise alle karakterers handlinger
    public void displayActions() {
        for (GameCharacter character : characters) {
            character.showInfo();
            character.action();

            // Ekstra: Tjekker karaktertype og caster objektet til korrekt type
            if (character instanceof Wizard) {
                Wizard wizard = (Wizard) character;
                System.out.println("Denne troldmand har " + wizard.getMana() + " mana.");
            } else if (character instanceof Warrior) {
                Warrior warrior = (Warrior) character;
                System.out.println("Denne kriger har " + warrior.getStrength() + " styrke.");
            } else if (character instanceof Archer) {
                Archer archer = (Archer) character;
                System.out.println("Denne bueskytte har " + archer.getArrows() + " pile tilbage.");
            }
            System.out.println(); // tom linje for bedre læsbarhed
        }
    }

    // Main metode
    public static void main(String[] args) {
       /*
       Mainm objekt kaldet program. Dette objekt har en ArrayList kaldet characters
       der kan indeholde alle typer karakterer, der nedarver fra GameCharacter.
       Denne ArrayList bliver initialiseret i Mains konstruktør.
        */

        Main program = new Main();

        // Opretter forskellige karakterer
        GameCharacter wizard = new Wizard("Merlin", 100, 50);
        GameCharacter warrior = new Warrior("Thor", 150, 80);
        GameCharacter archer = new Archer("Legolas", 90, 30);

        // Tilføjer karaktererne til ArrayList via addCharacter metoden
        program.addCharacter(wizard);
        program.addCharacter(warrior);
        program.addCharacter(archer);

        // Viser karakterernes handlinger
        program.displayActions();
    }
}
