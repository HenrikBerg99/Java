public class Monster {

    // Instansvaiabler
    private String name;
    private int helth;
    private int demage;
    private int xpReward;
    private int goldReward;
    
    // Kontruktør
    public Monster(String name, int health, int demage, int xpReward, int goldReward) {
        this.name = name;
        this.helth = health;
        this.demage = demage;
        this.xpReward = xpReward;
        this.goldReward = goldReward;
    }

    public String getName() { return name; }
    public int getHealth() { return helth; }
    public int getDemage() { return demage; }
    public int getXpReward() { return xpReward; }
    public int getGoldReward() { return goldReward; }


}
