public class Monster {

    // Instansvaiabler
    private String name;
    private int health;
    private int damage;
    private int xpReward;
    private int goldReward;
    
    // Kontruktør
    public Monster(String name, int health, int damage, int xpReward, int goldReward) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.xpReward = xpReward;
        this.goldReward = goldReward;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getDemage() { return damage; }
    public int getXpReward() { return xpReward; }
    public int getGoldReward() { return goldReward; }

    void takeDamage(int amount) {
        health = health - amount;

        if (health <= 0) {
            health = 0;
        }
    }

    void attackPlayer(Player player) {
        player.takeDemage(this.damage);
    }

}
