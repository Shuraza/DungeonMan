package model.entity.player;

import model.entity.Entity;

public class Player extends Entity {

    private int level;
    private int exp;

    public Player(String name) {
        super(name, 100);
        this.level = 1;
        this.exp = 0;
    }

    public int getLevel() { return level; }
    public int getExp() { return exp; }

    public void gainExp(int amount) {
        this.exp += amount;
        System.out.println(getName() + " ganhou " + amount + " de experiência!");
    }
}