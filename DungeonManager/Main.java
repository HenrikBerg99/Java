import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        titleText();

        System.out.print("Skriv inn navnet på helten din: ");
        String name = sc.nextLine();
        System.out.println();
        
        Player player = new Player(name, 200, 200, 40, 20, 1, 0);
        Monster monster = new Monster("Goblin", 50, 20, 10, 1);

        System.out.println("================== Ny Helt Opprettet ==================");
        playerStats(player);

        while (running) {

            gameMenu();

            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    enterDungeon(player, monster);
                    break;
                case 2:
                    // rest(player);
                    // break;
                case 3:
                    playerStats(player);
                    break;
                case 4:
                    System.out.println("Avslutter...");
                    running = false;
                    break;
                default:
                    System.out.println("Ugyldig valg, prøv igjen");
                    break;
            }

        }

        sc.close();
    }


    public static void titleText() {
        System.out.println("==========================================");
        System.out.println("             Dungeon Manager");
        System.out.println("==========================================");
        System.out.println("Velkommen, eventyrer!");
        System.out.println("Før du går inn i dungeon, må vi lage helten din.");
        System.out.println();
    }

    public static void gameMenu() {
        System.out.println("==========================================");
        System.out.println("                Game Menu");
        System.out.println("==========================================");
        System.out.println("(1) Gå inn i dungen");
        System.out.println("(2) Hvile i landsbyen");
        System.out.println("(3) Spiller status");
        System.out.println("(4) Avslutt spillet");
    }

    public static void playerStats(Player player) {
        System.out.println("================== Spiller status ==================");
        System.out.println("Navn: " + player.getPlayerName());
        System.out.println("Health: " + player.getHealth() + " / " + player.getMaxHealt());
        System.out.println("Gold: " + player.getGold());
        System.out.println("Level: " + player.getLevel());
        System.out.println("Xp: " + player.getXp());
        System.out.println();
    }

    public static void enterDungeon(Player player, Monster monster) {

        System.out.println("================== Dungeon ==================");
        System.out.println("Du gikk inn i en dungeon, der møtte du på en " + monster.getName());

        if(player.getHealth() > 0) {
            while(player.getHealth() > 0 && monster.getHealth() > 0) {
                System.out.print("Går i kamp!");
            }
        } else {
            System.out.print("Du har ikke noe health ijen, vensligst dra til landsbyen for å hvile.");
        }

    }

} 
