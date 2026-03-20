public class Player {

    private String playerName;
    private int health;
    private int maxHealt;
    private int gold;
    private int level;
    private int xp;

    public Player(String playerName, int healt, int maxHealth, int gold, int level, int xp) {
        this.playerName = playerName;
        this.health = healt;
        this.maxHealt = maxHealth;
        this.gold = gold;
        this.level = level;
        this.xp = xp;
    }

    // Getters
    public String getPlayerName() { return playerName; }
    public int getHealth() { return health; }
    public int getMaxHealt() { return maxHealt; }
    public int getGold() { return gold; }
    public int getLevel() { return level; }
    public int getXp() { return xp; }



    public void takeDemage(int amount) {
        health = health - amount;

        if (health <= 0) {
            health = 0;
        }
    }

    public void healPlayer(int amount) {
        health = health + amount;

        if(health >= maxHealt) {
            health = maxHealt;
        }
    }

    public void addGold(int amount) {
        gold = gold + amount;
        if(gold <= 0) {
            gold = 0;
        }
    }

    public void addXp(int amount) {
        xp = xp + amount;
    }

}
