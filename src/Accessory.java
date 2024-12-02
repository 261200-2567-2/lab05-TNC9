// Accessory.java
public abstract class Accessory {
    public abstract void applyEffect(Character character);
}

class Ring extends Accessory {
    private double attackBonus;

    public Ring(double attackBonus) {
        this.attackBonus = attackBonus;
    }

    @Override
    public void applyEffect(Character character) {
        if (character instanceof Warrior) {
            Warrior warrior = (Warrior) character;
            warrior.increaseStrength(attackBonus);
            System.out.println("Ring applied to Warrior. Increased Attack Damage.");
        } else if (character instanceof Archer) {
            Archer archer = (Archer) character;
            archer.increaseStrength(attackBonus);
            System.out.println("Ring applied to Archer. Increased Attack Damage.");
        }
    }
}

class Boots extends Accessory {
    private double speedBonus;

    public Boots(double speedBonus) {
        this.speedBonus = speedBonus;
    }

    @Override
    public void applyEffect(Character character) {
        if (character instanceof Warrior) {
            Warrior warrior = (Warrior) character;
            warrior.increaseSpeed(speedBonus);
            System.out.println("Boots applied to Warrior. Increased Speed.");
        } else if (character instanceof Archer) {
            Archer archer = (Archer) character;
            archer.increaseSpeed(speedBonus);
            System.out.println("Boots applied to Archer. Increased Speed.");
        }
    }
}
