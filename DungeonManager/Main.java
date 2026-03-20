import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        titleText();

        System.out.print("Skriv inn navnet på helten din: ");
        String name = sc.nextLine();
        System.out.println();
        
        Player player = new Player(name, 200, 200, 20, 1, 0);

        System.out.println("================== Ny Helt Opprettet ==================");
        playerStats(player);

        while (running) {

            gameMenu();

            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1:
                    enterDungeon(player);
                    break;
                case 2:
                    rest(player);
                    break;
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

    public static void enterDungeon(Player player) {
        System.out.println("================== Dungeon ==================");
        System.out.println("Du gikk inn i en dungeon, der møtte du på ett monster og drepte det.");

        player.takeDemage(40);
        player.addGold(10);
        player.addXp(50);
        
        System.out.println("Liv: -40");
        System.out.println("Gold: +10");
        System.out.println("Xp: +50");

    }

    public static void rest(Player player) {

        System.out.println("================== Hviler ==================");
        System.out.println(player.getPlayerName() + " valgte å hvile i landsbyen.");
        System.out.println(player.getPlayerName() + " Du får tilbake 50 health.");

        player.healPlayer(50);

        System.out.println("Health: " + player.getHealth() + " / " + player.getMaxHealt());

    }

} 
