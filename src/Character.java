// Character.java
public abstract class Character {
    protected String name;
    protected double health;
    protected double mana;
    protected double speed;
    protected double attackDamage;

    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 50;
        this.speed = 10;
        this.attackDamage = 10;
    }

    public String getName() {
        return name;
    }

    public abstract void equipAccessory(Accessory accessory);
    public abstract void equipWeapon();

    public abstract void showStatus();
}

interface Job {
    void applyJobEffect();
}

class Warrior extends Character implements Job {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void equipAccessory(Accessory accessory) {
        accessory.applyEffect(this);
    }

    @Override
    public void equipWeapon() {
        this.attackDamage *= 1.2;
    }

    @Override
    public void showStatus() {
        System.out.println("Warrior - Name: " + name + ", Health: " + health + ", Mana: " + mana + ", Speed: " + speed + ", Attack Damage: " + attackDamage);
    }

    public void increaseStrength(double bonus) {
        this.attackDamage += bonus;
    }

    public void increaseSpeed(double bonus) {
        this.speed += bonus;
    }

    @Override
    public void applyJobEffect() {
        this.health += 20;
        this.mana += 10;
        this.speed += 5;
    }
}

class Archer extends Character implements Job {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void equipAccessory(Accessory accessory) {
        accessory.applyEffect(this);
    }

    @Override
    public void equipWeapon() {
        this.attackDamage *= 1.3;
    }

    @Override
    public void showStatus() {
        System.out.println("Archer - Name: " + name + ", Health: " + health + ", Mana: " + mana + ", Speed: " + speed + ", Attack Damage: " + attackDamage);
    }

    public void increaseStrength(double bonus) {
        this.attackDamage += bonus;
    }

    public void increaseSpeed(double bonus) {
        this.speed += bonus;
    }

    @Override
    public void applyJobEffect() {
        this.health += 15;
        this.mana += 20;
        this.speed += 7;
    }
}
