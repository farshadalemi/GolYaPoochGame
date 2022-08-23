import java.util.Random;
import java.util.Scanner;

public class GolYaPoochGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] gp = {"L", "R"};
            String computerMove = gp[new Random().nextInt(gp.length)];

            String playerMove;

            while (true) {
                System.out.println("Which hand has the GOL inside of it? (L = Left or R = Right) **Plz turn on CapsLock**");
                playerMove = scanner.nextLine();
                if (playerMove.equals("L") || playerMove.equals("R")){
                    break;
                }
                System.out.println(playerMove + " is not a valid option!");
            }


            System.out.println("Gol is in the " + computerMove + " hand");

            if (playerMove.equals(computerMove)) {
                System.out.println("U Win :)");
            }
            else if (playerMove.equals("L")) {
                if (computerMove.equals("R")) {
                    System.out.println("Try again, Gol is in the Right :O");
                }
            } else if (playerMove.equals("R")) {
                if (computerMove.equals("L")) {
                    System.out.println("Try again, Gol is in the Left :O");
                }
            }
            System.out.println("Rematch? (Enter Y for Yes)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("Y")) {
              break;
            }

            scanner.close();
        }
    }
}
