package model.entity;

public abstract class Entity {

    private String name;
    private int hp;
    private int maxHp;

    public Entity(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp; // Começa com a vida cheia
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getMaxHp() { return maxHp; }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }
}